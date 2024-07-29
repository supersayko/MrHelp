package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    Button recylerviewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        recylerviewbtn = findViewById(R.id.recyclerviewbtn1);
        recylerviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });
    }
}