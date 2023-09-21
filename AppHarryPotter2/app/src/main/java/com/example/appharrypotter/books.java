package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class books extends AppCompatActivity {

    private LinearLayout booksLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        booksLayout = findViewById(R.id.books_layout);

        addBooksCard("Harry Potter e a Pedra Filosofal", "26/06/1997", "208 páginas", R.drawable.pedrafilosofalbook1);
        addBooksCard("Harry Potter e a Câmara Secreta", "02/07/1998", "224 páginas", R.drawable.camarasecretabook1);
        addBooksCard("Harry Potter e o Prisioneiro de Azkaban", "08/07/1999", "228 páginas", R.drawable.prisioneiroazkabanbook1);
        addBooksCard("Harry Potter e o Cálice de Fogo", "08/07/2000", "480 páginas", R.drawable.calicedefogobook1);
        addBooksCard("Harry Potter e a Ordem da Fênix", "21/06/2003", "640 páginas", R.drawable.ordemdafenixbook1);
        addBooksCard("Harry Potter e o Enigma do Príncipe", "16/06/2005", "432 páginas", R.drawable.enigmadoprincipebook1);
        addBooksCard("Harry Potter e as Relíquias da Morte", "21/07/2007", "512 páginas", R.drawable.reliquiasdamortebook1);
    }

    private void addBooksCard(String title, String date, String time, int imageResId) {
        BooksCard booksCard = new BooksCard(this, title, date, time, imageResId);
        booksLayout.addView(booksCard);
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}
