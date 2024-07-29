package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SpashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };td.start();
    }
}