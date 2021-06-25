package com.example.interproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verification_code extends AppCompatActivity {
    //Initialize Variable
    Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);

        //Assign Variable
        continueBtn = findViewById(R.id.continueBtn);

        //Direct to OTP Confirmation Interface
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otpConfiramtionIntent = new Intent(verification_code.this, otp_Confirmation_activity.class);
                startActivity(otpConfiramtionIntent);
                finish();
            }
        });
    }
}