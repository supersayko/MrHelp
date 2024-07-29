package com.example.ngoapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginPage extends AppCompatActivity {

    Button loginButton;

    EditText nmeEditText, psswordEditText;
    TextView sgnup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        loginButton = findViewById(R.id.loginButton);
        nmeEditText = findViewById(R.id.nameEditText);
        psswordEditText = findViewById(R.id.passwordEditText);
        sgnup = findViewById(R.id.sgnUpText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nmeEditText.getText().toString();
                String pass = psswordEditText.getText().toString();

                if (!name.isEmpty()){
                    nmeEditText.setError(null);

                    if (!pass.isEmpty()){
                        psswordEditText.setError(null);

                        final String name_data = nmeEditText.getText().toString();
                        final String pass_data = psswordEditText.getText().toString();

                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        DatabaseReference reference = firebaseDatabase.getReference("datauser");

                        Query check_username = reference.orderByChild("name").equalTo(name_data);

                        check_username.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()){
                                    nmeEditText.setError(null);
                                    String passCheck = snapshot.child(name_data).child("password").getValue(String.class);
                                    if(passCheck.equals(pass_data)){
                                        psswordEditText.setError(null);
                                        Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                                        startActivity(intent);
                                        finish();
                                    }else {
                                        psswordEditText.setError("Wrong Password");
                                    }
                                }else {
                                    nmeEditText.setError("User does not exists");
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }else {
                        nmeEditText.setError("Please enter the password");
                    }

                }else {
                    nmeEditText.setError("Please enter the name");
                }
            }
        });

        sgnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, SignUpPage.class);
                startActivity(intent);
            }
        });
    }
}