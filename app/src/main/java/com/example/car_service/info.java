package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void next1(View view) {
        Intent i = new Intent(info.this,next.class);
        startActivity(i);
    }

    public void skip(View view) {
        Intent i = new Intent(info.this,login.class);
        startActivity(i);
    }
}