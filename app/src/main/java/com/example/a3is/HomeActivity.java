package com.example.a3is;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn_play = (Button) findViewById(R.id.btn_play);
        final VideoView vid_3i =(VideoView)findViewById(R.id.vid_3i);

        final MediaController mediaController= new MediaController(this);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://com.example.a3is/" + R.raw.vid_3i;
                Uri uri= Uri.parse(videoPath);
                vid_3i.setVideoURI(uri);
                vid_3i.setMediaController(mediaController);
                mediaController.setAnchorView(vid_3i);
                vid_3i.start();
            }
        });

    }
}