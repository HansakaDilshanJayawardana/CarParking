package com.example.interproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_signup extends AppCompatActivity {
    //Initialize Variable
    Button loginSignupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        //Assign Variable
        loginSignupBtn = findViewById(R.id.loginSignupBtn);

        //Direct to OTP Verification Interface
        loginSignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otpVerificationIntent = new Intent(login_signup.this, verification_code.class);
                startActivity(otpVerificationIntent);
                finish();
            }
        });
    }
}