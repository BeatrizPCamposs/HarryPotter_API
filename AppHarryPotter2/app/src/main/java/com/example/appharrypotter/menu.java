package com.example.appharrypotter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;

public class menu extends AppCompatActivity {

    private Spinner menuDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuDropdown = findViewById(R.id.menudp);

        // Lista de opções do Spinner
        String[] options = {"Selecione uma opção", "Personagens", "Filmes"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        menuDropdown.setAdapter(adapter);

        menuDropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);

                if (selectedItem.equals("Personagens")) {
                    Intent intent = new Intent(menu.this, personagens.class);
                    startActivity(intent);
                } else if (selectedItem.equals("Filmes")) {
                    Intent intent = new Intent(menu.this, filmes.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

}
