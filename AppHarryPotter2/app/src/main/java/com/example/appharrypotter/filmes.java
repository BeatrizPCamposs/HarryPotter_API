package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class filmes extends AppCompatActivity {

    private LinearLayout moviesLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmes);

        moviesLayout = findViewById(R.id.movies_layout);

        addMoviesCard("Harry Potter e a Pedra Filosofal", "04/11/2001", "152 minutos", R.drawable.pedrafilosofal);
        addMoviesCard("Harry Potter e a Câmara Secreta", "15/11/2002", "161 minutos", R.drawable.camarasecreta);
        addMoviesCard("Harry Potter e o Prisioneiro de Azkaban", "15/11/2002", "145 minutos", R.drawable.prisioneiroazkaban);
        addMoviesCard("Harry Potter e o Cálice de Fogo", "06/11/2005", "157 minutos", R.drawable.calicedefogo);
        addMoviesCard("Harry Potter e a Ordem da Fênix", "11/07/2007", "138 minutos", R.drawable.ordemdafenix);
        addMoviesCard("Harry Potter e o Enigma do Príncipe", "07/07/2009", "153 minutos", R.drawable.enigmadoprincipe);
        addMoviesCard("Harry Potter e as Relíquias da Morte", "11/11/2010", "146 minutos", R.drawable.reliquiasdamorte);
    }

    private void addMoviesCard(String title, String date, String time, int imageResId) {
        MoviesCard moviesCard = new MoviesCard(this, title, date, time, imageResId);
        moviesLayout.addView(moviesCard);
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}
