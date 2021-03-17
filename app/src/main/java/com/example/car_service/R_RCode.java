package com.example.car_service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class R_RCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r__r_code);
        getSupportActionBar().hide();




    }

    public void R_S(View view) {

        Intent intent = new Intent(R_RCode.this ,M_R_M.class );
        startActivity(intent);
        finish();

    }
}