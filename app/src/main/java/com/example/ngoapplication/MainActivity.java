package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView skiptext,nexttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        skiptext = findViewById(R.id.skipText);
        nexttext = findViewById(R.id.nextText);
        skiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
            }
        });
        nexttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondPage.class);
                startActivity(intent);
            }
        });



    }
}