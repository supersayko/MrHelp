package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityDashboardBinding;

public class Dashboard extends AppCompatActivity {

    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.foodCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Fragment fragment = new FoodFragment();
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.container1,fragment).commit();

                Intent intent = new Intent(Dashboard.this, FoodActivity.class);
                startActivity(intent);
            }
        });

        binding.bookCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Fragment fragment = new FoodFragment();
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.container1,fragment).commit();

                Intent intent = new Intent(Dashboard.this, BookActivity.class);
                startActivity(intent);
            }
        });

        binding.clothCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Fragment fragment = new FoodFragment();
//                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.container1,fragment).commit();

                Intent intent = new Intent(Dashboard.this, BookActivity.class);
                startActivity(intent);
            }
        });


        binding.backImgVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, LoginPage.class);
                startActivity(intent);
            }
        });

        binding.volButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, VolunteerRegisteration.class);
                startActivity(intent);
            }
        });

        binding.dntButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, MoneyActivity.class);
                startActivity(intent);
            }
        });

        binding.moneyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, MoneyActivity.class);
                startActivity(intent);
            }
        });

        binding.profileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Dashboard.this,DonatorList.class);
                startActivity(i);
                finish();
            }
        });

    }
}