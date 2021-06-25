package com.example.interproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otp_Confirmation_activity extends AppCompatActivity {
    //Intialize Variable
    Button confirmation_ok_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp__confirmation_activity);

        //Assign Variable
        confirmation_ok_Btn = findViewById(R.id.confirmation_ok_Btn);

        //Direct to Map Interface
        confirmation_ok_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleMapIntent = new Intent(otp_Confirmation_activity.this, google_map_location.class);
                startActivity(googleMapIntent);
                finish();
            }
        });
    }
}