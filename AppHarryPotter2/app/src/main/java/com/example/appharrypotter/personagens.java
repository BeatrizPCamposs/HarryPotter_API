package com.example.appharrypotter;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class personagens extends AppCompatActivity {

    private LinearLayout characterLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        characterLayout = findViewById(R.id.character_layout);

        addCharacterCard("Harry Potter", "Masculino", "31/07/1980", R.drawable.potter);
        addCharacterCard("Hermione Granger", "Feminino", "19/09/1979", R.drawable.hermione);
        addCharacterCard("Ronald Weasley", "Masculino", "01/03/1980", R.drawable.ronald);
        addCharacterCard("Draco Malfoy", "Masculino", "05/06/1980", R.drawable.molfoy);
    }

    private void addCharacterCard(String name, String gender, String birthdate, int imageResId) {
        CharacterCard characterCard = new CharacterCard(this, name, gender, birthdate, imageResId);
        characterLayout.addView(characterCard);
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}
