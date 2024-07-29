package com.example.ngoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

public class SignUpPage extends AppCompatActivity {

    Button sgnUpButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    EditText nmeEdit, emailEdit, psswordEdit, confrmEdit;

    TextView lgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sgnUpButton = findViewById(R.id.signUpButton);
        nmeEdit = findViewById(R.id.nameEditText1);
        emailEdit = findViewById(R.id.emailEditText);
        psswordEdit = findViewById(R.id.passwordEditText1);
        confrmEdit = findViewById(R.id.confirmPasswordEditText);
        lgn = findViewById(R.id.lgnText);

        sgnUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nmeEdit.getText().toString();
                String email = emailEdit.getText().toString();
                String pass = psswordEdit.getText().toString();
                String cnfrm = confrmEdit.getText().toString();
                if (!name.isEmpty()) {
                    nmeEdit.setError(null);
                    if (!email.isEmpty()) {
                        emailEdit.setError(null);

                        if (!pass.isEmpty()) {
                            psswordEdit.setError(null);
                            if (pass.equals(cnfrm)) {
                                if (!cnfrm.isEmpty()) {
                                    confrmEdit.setError(null);
                                    if (email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {

                                        firebaseDatabase = FirebaseDatabase.getInstance();
                                        reference = firebaseDatabase.getReference("datauser");

                                        String nameS = nmeEdit.getText().toString();
                                        String emailS = emailEdit.getText().toString();
                                        String passS = psswordEdit.getText().toString();
                                        String cnfrmS = confrmEdit.getText().toString();

                                        StoringData storingData = new StoringData(nameS, emailS, passS, cnfrmS);

                                        reference.child(nameS).setValue(storingData);

                                        Intent intent = new Intent(SignUpPage.this, LoginPage.class);
                                        startActivity(intent);
                                        finish();

                                    } else {
                                        emailEdit.setError("Please enter the valid email");
                                    }
                                } else {
                                    confrmEdit.setError("Please enter the confirm password");
                                }
                            } else {
                                psswordEdit.setError("Confirm password and password should be same");

                            }
                        } else {
                            psswordEdit.setError("Please enter the password");
                        }
                    } else {
                        emailEdit.setError("please enter the email id");
                    }
                } else {
                    nmeEdit.setError("Please enter the name");
                }
            }
        });

        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this, LoginPage.class);
                startActivity(intent);
            }
        });

    }
}