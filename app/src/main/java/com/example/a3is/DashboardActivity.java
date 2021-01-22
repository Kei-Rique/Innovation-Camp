package com.example.a3is;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final ImageView img_home = findViewById(R.id.img_home);
        final ImageView img_about = findViewById(R.id.img_about);
        final ImageView img_contact = findViewById(R.id.img_contact);
        final ImageView img_logout = findViewById(R.id.img_logout);


        img_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent DashboardToHome = new Intent(DashboardActivity.this, HomeActivity.class);
                startActivity(DashboardToHome);
            }
        });

        img_about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent DashboardToAbout = new Intent(DashboardActivity.this, AboutActivity.class);
                startActivity(DashboardToAbout);
            }
        });

        img_contact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent DashboardToContact = new Intent(DashboardActivity.this, ContactActivity.class);
                startActivity(DashboardToContact);
            }
        });


        img_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setTitle("Log-out Confirmation");
                builder.setMessage("Are you sure you want to log-out?");
                builder.setIcon(R.drawable.ic_logout);
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent DashboardToLogin = new Intent(DashboardActivity.this, LoginActivity.class);
                        startActivity(DashboardToLogin);
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Staying in", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}