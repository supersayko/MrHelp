package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityFeedbackBinding;


public class FeedbackActivity extends AppCompatActivity {

    ActivityFeedbackBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityFeedbackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sndButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeedbackActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}