package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {
    TextView skiptext,nexttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        skiptext = findViewById(R.id.skipText);
        nexttext = findViewById(R.id.nextText);
        skiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondPage.this, LoginPage.class);
                startActivity(intent);
            }
        });
        nexttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondPage.this, ThirdPage.class);
                startActivity(intent);
            }
        });
    }
}