package com.example.interproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Initialize Variables
    Button currentLocationBtn, otherLocationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Variables
        currentLocationBtn = findViewById(R.id.currentLocationBtn);
        otherLocationBtn = findViewById(R.id.otherLocationBtn);

        //Direct to Login-SignUp Interface
        currentLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginSignupIntent = new Intent(MainActivity.this, login_signup.class);
                startActivity(loginSignupIntent);
                finish();
            }
        });

        otherLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginSignupIntent = new Intent(MainActivity.this, login_signup.class);
                startActivity(loginSignupIntent);
                finish();
            }
        });
    }
}