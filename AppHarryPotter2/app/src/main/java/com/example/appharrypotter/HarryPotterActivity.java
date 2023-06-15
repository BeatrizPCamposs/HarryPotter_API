package com.example.appharrypotter;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HarryPotterActivity extends AppCompatActivity {

    private TextView slugTextView;
    private TextView nameTextView;
    private TextView bornTextView;
    private TextView genderTextView;
    private TextView houseTextView;
    private TextView patronusTextView;
    private ImageView characterImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harry_potter);

        slugTextView = findViewById(R.id.slugTextView);
        nameTextView = findViewById(R.id.nameTextView);
        bornTextView = findViewById(R.id.bornTextView);
        genderTextView = findViewById(R.id.genderTextView);
        houseTextView = findViewById(R.id.houseTextView);
        patronusTextView = findViewById(R.id.patronusTextView);
        characterImageView = findViewById(R.id.characterImageView);

        String characterUrl = "https://api.potterdb.com/v1/characters/harry-potter";
        FetchCharacterDataTask task = new FetchCharacterDataTask();
        characterImageView.setClipToOutline(true);
        task.execute(characterUrl);
    }

    private class FetchCharacterDataTask extends AsyncTask<String, Void, CharacterData> {

        @Override
        protected CharacterData doInBackground(String... urls) {
            String characterUrl = urls[0];
            String jsonResponse = "";

            try {
                URL url = new URL(characterUrl);
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

                JSONObject dataObject = jsonObject.optJSONObject("data");
                if (dataObject == null) {
                    throw new JSONException("");
                }

                JSONObject attributesObject = dataObject.optJSONObject("attributes");
                if (attributesObject == null) {
                    throw new JSONException("");
                }

                String slug = attributesObject.optString("slug", "");
                String name = attributesObject.optString("name", "");
                String born = attributesObject.optString("born", "");
                String gender = attributesObject.optString("gender", "");
                String house = attributesObject.optString("house", "Unknown");
                String patronus = attributesObject.optString("patronus", "Unknown");
                String image = attributesObject.optString("image", "");

                return new CharacterData(slug, name, born, gender, house, patronus, image);
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(CharacterData characterData) {
            if (characterData != null) {
                slugTextView.setText(characterData.getSlug());
                nameTextView.setText(characterData.getName());
                bornTextView.setText(characterData.getBorn());
                genderTextView.setText(characterData.getGender());
                houseTextView.setText(characterData.getHouse());
                patronusTextView.setText(characterData.getPatronus());
                Glide.with(HarryPotterActivity.this)
                        .load(characterData.getImage())
                        .circleCrop()
                        .into(characterImageView);
            }
        }
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}





















