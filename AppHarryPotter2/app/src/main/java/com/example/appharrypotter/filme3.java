package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class filme3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme3);

        //video
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://" + getPackageName() +"/" + R.raw.trailer3);

        videoView.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //botão para acessar o link do filme na web
        Button button = (Button) findViewById(R.id.btnlink1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hbomax.com/br/pt/feature/urn:hbo:feature:GYY7NkAImuJzDwgEAAAAL"));
                startActivity(intent);
            }
        });
    }

    //Acesso ao menu
    public void menuu(View view) {
        Intent intent = new Intent(this,menu.class);
        startActivity(intent);
    }
}