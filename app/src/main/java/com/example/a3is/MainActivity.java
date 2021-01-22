package com.example.a3is;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent MainToLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(MainToLogin);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        },3000); //starts after 3 seconds
    }
}