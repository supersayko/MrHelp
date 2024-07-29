package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityBookBinding;
import com.example.ngoapplication.databinding.ActivityClothBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ClothActivity extends AppCompatActivity {

    ActivityClothBinding binding;
    String cloth, size, pTme, pDte, pLoc;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityClothBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dntButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cloth = binding.clothEditText1.getText().toString();
                size = binding.szeEditText1.getText().toString();
                pTme = binding.pickEditText1.getText().toString();
                pDte = binding.pickDateEditText1.getText().toString();
                pLoc = binding.pkLocEditText1.getText().toString();

                if (!cloth.isEmpty() && !size.isEmpty() && !pTme.isEmpty() && !pDte.isEmpty() && !pLoc.isEmpty()){
                    ClothData cd = new ClothData(cloth,size,pTme,pDte,pLoc);
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference("foodData");

                    reference.child(cloth).setValue(cd).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.clothEditText1.setText("");
                            binding.szeEditText1.setText("");
                            binding.pickEditText1.setText("");
                            binding.pickDateEditText1.setText("");
                            binding.pkLocEditText1.setText("");

                            Intent intent = new Intent(ClothActivity.this, ThanksActivity.class);
                            startActivity(intent);

                        }
                    });

                }
            }
        });

        binding.tpText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClothActivity.this, MoneyActivity.class);
                startActivity(intent);
            }
        });
    }
}