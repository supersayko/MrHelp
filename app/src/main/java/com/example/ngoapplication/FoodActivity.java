package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityFoodBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodActivity extends AppCompatActivity {

    ActivityFoodBinding binding;
    String foodName, quantity, pTime, pDate, pLocation;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodName = binding.foodEditText.getText().toString();
                quantity = binding.quantityEditText.getText().toString();
                pTime = binding.pickEditText.getText().toString();
                pDate = binding.pickDateEditText.getText().toString();
                pLocation = binding.pkLocEditText.getText().toString();

                if (!foodName.isEmpty() && !quantity.isEmpty() && !pTime.isEmpty() && !pDate.isEmpty() && !pLocation.isEmpty()){
                    FoodData fd = new FoodData(foodName,quantity,pTime,pDate,pLocation);
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference("foodData");

                    reference.child(foodName).setValue(fd).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.foodEditText.setText("");
                            binding.quantityEditText.setText("");
                            binding.pickEditText.setText("");
                            binding.pickDateEditText.setText("");
                            binding.pkLocEditText.setText("");
                            Intent intent = new Intent(FoodActivity.this, ThanksActivity.class);
                            startActivity(intent);
                        }
                    });

                }
            }
        });

        binding.tpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodActivity.this, MoneyActivity.class);
                startActivity(intent);
            }
        });
    }
}