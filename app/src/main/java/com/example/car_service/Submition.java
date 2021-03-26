package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Submition extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submition);

    }

    public void submit2(View view) {
        Intent intent = new Intent(Submition.this ,login.class );
        startActivity(intent);
        finish();
    }

    //////////////////////database method
    protected void onStart() {
        super.onStart();
    }
}