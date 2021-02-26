package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Next2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);
    }

    public void next3(View view) {
        Intent i = new Intent(Next2.this,login.class);
        startActivity(i);
    }
}