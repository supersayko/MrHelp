package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.ngoapplication.databinding.ActivityVolunteerRegisterationBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VolunteerRegisteration extends AppCompatActivity {

    ActivityVolunteerRegisterationBinding binding;

    String name, number, mail, city, pin;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityVolunteerRegisterationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sbmtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = binding.nameEditText.getText().toString();
                number = binding.contactEditText.getText().toString();
                mail = binding.mailEditText.getText().toString();
                city = binding.cityEditText.getText().toString();
                pin = binding.pinEditText.getText().toString();

                if (!name.isEmpty() && !number.isEmpty() && !mail.isEmpty() && !city.isEmpty() && !pin.isEmpty()){
                    VolunteerData vd = new VolunteerData(name,number,mail,city,pin);
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference("volData");

                    reference.child(name).setValue(vd).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.nameEditText.setText("");
                            binding.contactEditText.setText("");
                            binding.mailEditText.setText("");
                            binding.cityEditText.setText("");
                            binding.pinEditText.setText("");

                            Intent intent = new Intent(VolunteerRegisteration.this, ThanksVolunteer.class);
                            startActivity(intent);


                        }
                    });

                }
            }
        });

        binding.backImgVew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VolunteerRegisteration.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}