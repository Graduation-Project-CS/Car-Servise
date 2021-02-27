package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void forget(View view) {
        Intent i = new Intent(login.this,Forget_Password.class);
        startActivity(i);
    }

    public void login(View view) {






    }

    public void signup(View view) {
        Intent i = new Intent(login.this,SignUP.class);
        startActivity(i);
    }
}