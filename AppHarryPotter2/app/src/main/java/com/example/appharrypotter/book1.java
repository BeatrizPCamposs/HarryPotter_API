package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class book1 extends AppCompatActivity {


    private TextView tituloTextView;
    private TextView sumarioTextView;
    private TextView autorTextView;
    private TextView ano_lancamentoTextView;
    private TextView ordemTextView;
    private ImageView coverImageView;
    private TextView numPaginasTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);


        tituloTextView = findViewById(R.id.titulobookTextView);
        sumarioTextView = findViewById(R.id.sumariobookTextView);
        autorTextView = findViewById(R.id.autorlivroTextView);
        ano_lancamentoTextView = findViewById(R.id.anolancTextView);
        ordemTextView = findViewById(R.id.ordemTextView);
        numPaginasTextView = findViewById(R.id.numpagesTextView);

        String bookUrl = "https://api.harrypotterbooks.com/api/books/Harry_Potter_e_a_Pedra_Filosofal";

        FetchBookDataTask task = new FetchBookDataTask();
        coverImageView.setClipToOutline(true);
        task.execute(bookUrl);

        // Botão para acessar o link do filme na web
        Button button = findViewById(R.id.btnlink1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hbomax.com/br/pt/feature/urn:hbo:feature:GYY7NkAImuJzDwgEAAAAL"));
                startActivity(intent);
            }
        });

        // Video
        VideoView videoView = findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.resumolivro1);

        videoView.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }

    private class FetchBookDataTask extends AsyncTask<String, Void, BookData> {

        @Override
        protected BookData doInBackground(String... urls) {
            String bookUrl = urls[0];
            String jsonResponse = "";

            try {
                URL url = new URL(bookUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                InputStream inputStream = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    jsonResponse += line;
                }

                bufferedReader.close();
                inputStream.close();
                connection.disconnect();

                JSONObject jsonObject = new JSONObject(jsonResponse);

                String idBooks = jsonObject.optString("IdBooks", "");
                String titulo = jsonObject.optString("titulo", "");
                String sumario = jsonObject.optString("sumario", "");
                String autor = jsonObject.optString("autor", "");
                String ano_lancamento = jsonObject.optString("ano_lancamento", "");
                String ordem = jsonObject.optString("ordem", "");
                String cover = jsonObject.optString("cover", "");
                String numPaginas = jsonObject.optString("numPaginas", "");

                return new BookData(idBooks, titulo, sumario, autor, ano_lancamento, ordem, cover, numPaginas);
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(BookData bookData) {
            if (bookData != null) {
                tituloTextView.setText(bookData.getTitulo());
                sumarioTextView.setText(bookData.getSumario());
                autorTextView.setText(bookData.getAutor());
                ano_lancamentoTextView.setText(bookData.getAno_lancamento());
                ordemTextView.setText(bookData.getOrdem());
                numPaginasTextView.setText(bookData.getNumPaginas());

                Glide.with(book1.this)
                        .load(bookData.getCover())
                        .into(coverImageView);
            }
        }
    }

    // Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}
