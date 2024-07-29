package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityMoneyBinding;
import com.example.ngoapplication.databinding.ActivityThanksBinding;

public class ThanksActivity extends AppCompatActivity {

    ActivityThanksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityThanksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.hmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}