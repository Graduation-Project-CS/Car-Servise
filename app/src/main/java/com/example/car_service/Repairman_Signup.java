package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Repairman_Signup extends AppCompatActivity {

    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repairman__signup);

        check = (CheckBox) findViewById(R.id.agree);


    }


    public void checked(View view) {

        if (check.isChecked()){
            Intent intent = new Intent(Repairman_Signup.this ,R_Signup.class );
            startActivity(intent);
        }


    }
}