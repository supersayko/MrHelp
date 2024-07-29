package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import com.example.ngoapplication.databinding.ActivityBookBinding;
import com.example.ngoapplication.databinding.ActivityFoodBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BookActivity extends AppCompatActivity {
    ActivityBookBinding binding;
    String categ, bkName, pTme, pDte, pLoc;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityBookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dntButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categ = binding.bkEditText.getText().toString();
                bkName = binding.bkEditText1.getText().toString();
                pTme = binding.pickEditText1.getText().toString();
                pDte = binding.pickDateEditText1.getText().toString();
                pLoc = binding.pkLocEditText1.getText().toString();

                if (!categ.isEmpty() && !bkName.isEmpty() && !pTme.isEmpty() && !pDte.isEmpty() && !pLoc.isEmpty()){
                    BookData bd = new BookData(categ,bkName,pTme,pDte,pLoc);
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference("foodData");

                    reference.child(categ).setValue(bd).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.bkEditText.setText("");
                            binding.bkEditText1.setText("");
                            binding.pickEditText1.setText("");
                            binding.pickDateEditText1.setText("");
                            binding.pkLocEditText1.setText("");

                            Intent intent = new Intent(BookActivity.this, ThanksActivity.class);
                            startActivity(intent);
                        }
                    });

                }
            }
        });

        binding.tpText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookActivity.this, MoneyActivity.class);
                startActivity(intent);
            }
        });
    }
}