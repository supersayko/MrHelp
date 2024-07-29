package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ThanksVolunteer extends AppCompatActivity {
    Button hmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_volunteer);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        hmeButton = findViewById(R.id.hmeButton);
        hmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksVolunteer.this, Dashboard.class);
                startActivity(intent);
            }
        });


    }
}