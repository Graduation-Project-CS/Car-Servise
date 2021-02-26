package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void next2(View view) {
        Intent i = new Intent(next.this,Next2.class);
        startActivity(i);
    }

    public void skip2(View view) {
        Intent i = new Intent(next.this,login.class);
        startActivity(i);
    }
}