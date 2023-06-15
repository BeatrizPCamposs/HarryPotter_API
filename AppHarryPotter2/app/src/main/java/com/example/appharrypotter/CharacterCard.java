package com.example.appharrypotter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CharacterCard extends LinearLayout {
    private TextView nameTextView;
    private TextView genderTextView;
    private TextView birthdateTextView;
    private ImageView characterImageView;
    private Button infoButton;

    public CharacterCard(Context context, String name, String gender, String birthdate, int imageResId) {
        super(context);
        init(context, name, gender, birthdate, imageResId);
    }

    private void init(Context context, String name, String gender, String birthdate, int imageResId) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.character_card_layout, this, true);

        nameTextView = rootView.findViewById(R.id.txtname);
        genderTextView = rootView.findViewById(R.id.txtgender);
        birthdateTextView = rootView.findViewById(R.id.txtborn);
        characterImageView = rootView.findViewById(R.id.image_character);
        infoButton = rootView.findViewById(R.id.info_button);

        nameTextView.setText(name);
        genderTextView.setText(gender);
        birthdateTextView.setText(birthdate);
        characterImageView.setImageResource(imageResId);

        infoButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.equals("Harry Potter")) {
                    Intent intent = new Intent(getContext(), HarryPotterActivity.class);
                    getContext().startActivity(intent);
                } else if (name.equals("Hermione Granger")) {
                    Intent intent = new Intent(getContext(), hermione.class);
                    getContext().startActivity(intent);
                } else if (name.equals("Ronald Weasley")) {
                    Intent intent = new Intent(getContext(), ronald.class);
                    getContext().startActivity(intent);
                } else if (name.equals("Draco Malfoy")) {
                    Intent intent = new Intent(getContext(), dracomolfoy.class);
                    getContext().startActivity(intent);
                }
            }
        });

    }
}


