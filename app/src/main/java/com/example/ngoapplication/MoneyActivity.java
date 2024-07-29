package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.ngoapplication.databinding.ActivityFoodBinding;
import com.example.ngoapplication.databinding.ActivityMoneyBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MoneyActivity extends AppCompatActivity {
    ActivityMoneyBinding binding;
    String amount, name, message;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityMoneyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dntButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = binding.amtEditText.getText().toString();
                name = binding.nameEditText1.getText().toString();
                message = binding.msgEditText1.getText().toString();

                if (!amount.isEmpty() && !name.isEmpty() && !message.isEmpty()){
                    MoneyData fd = new MoneyData(amount,name,message);
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference("moneyData");

                    reference.child(name).setValue(fd).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.amtEditText.setText("");
                            binding.nameEditText1.setText("");
                            binding.msgEditText1.setText("");

                            Intent intent = new Intent(MoneyActivity.this, ThanksActivity.class);
                            startActivity(intent);
                        }
                    });

                }
            }
        });
    }
}