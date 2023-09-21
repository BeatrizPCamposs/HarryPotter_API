package com.example.appharrypotter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BooksCard extends LinearLayout{
    private TextView titleTextView;
    private TextView dateTextView;
    private TextView timeTextView;
    private ImageView movieImageView;
    private Button infoButton;

    public BooksCard(Context context, String title, String date, String time, int imageResId) {
        super(context);
        init(context, title, date, time, imageResId);
    }

    private void init(Context context, String title, String date, String time, int imageResId) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.books_card_layout, this, true);

        titleTextView = rootView.findViewById(R.id.txttitle);
        dateTextView = rootView.findViewById(R.id.txtdate);
        timeTextView = rootView.findViewById(R.id.txttime);
        movieImageView = rootView.findViewById(R.id.image_movie);
        infoButton = rootView.findViewById(R.id.info_button);

        titleTextView.setText(title);
        dateTextView.setText(date);
        timeTextView.setText(time);
        movieImageView.setImageResource(imageResId);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (title.equals("Harry Potter e a Pedra Filosofal")) {
                    Intent intent = new Intent(getContext(), book1.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e a Câmara Secreta")) {
                    Intent intent = new Intent(getContext(), filme2.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e o Prisioneiro de Azkaban")) {
                    Intent intent = new Intent(getContext(), filme3.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e o Cálice de Fogo")) {
                    Intent intent = new Intent(getContext(), filme4.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e a Ordem da Fênix")) {
                    Intent intent = new Intent(getContext(), filme5.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e o Enigma do Príncipe")) {
                    Intent intent = new Intent(getContext(), filme6.class);
                    getContext().startActivity(intent);
                } else if (title.equals("Harry Potter e as Relíquias da Morte")) {
                    Intent intent = new Intent(getContext(), filme7.class);
                    getContext().startActivity(intent);
                }
            }
        });
    }
}
