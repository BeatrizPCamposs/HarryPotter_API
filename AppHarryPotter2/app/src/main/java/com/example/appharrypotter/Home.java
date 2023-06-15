package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
    //Acesso as telas de filmes
    public void btnfilme1(View view) {
        Intent intent = new Intent(this,filme1.class);
        startActivity(intent);
    }

    public void btnfilme2(View view) {
        Intent intent = new Intent(this,filme2.class);
        startActivity(intent);
    }

    public void btnfilme3(View view) {
        Intent intent = new Intent(this,filme3.class);
        startActivity(intent);
    }

    public void btnfilme4(View view) {
        Intent intent = new Intent(this,filme4.class);
        startActivity(intent);
    }

    public void btnfilme5(View view) {
        Intent intent = new Intent(this,filme5.class);
        startActivity(intent);
    }

    public void btnfilme6(View view) {
        Intent intent = new Intent(this,filme6.class);
        startActivity(intent);
    }

    public void btnfilme7(View view) {
        Intent intent = new Intent(this,filme7.class);
        startActivity(intent);
    }

    //Acesso as telas de personagens
    public void btnpers1(View view) {
        Intent intent = new Intent(this, HarryPotterActivity.class);
        startActivity(intent);
    }

    public void btnpers2(View view) {
        Intent intent = new Intent(this,hermione.class);
        startActivity(intent);
    }

    public void btnpers3(View view) {
        Intent intent = new Intent(this,ronald.class);
        startActivity(intent);
    }

    public void btnpers4(View view) {
        Intent intent = new Intent(this,dracomolfoy.class);
        startActivity(intent);
    }
}