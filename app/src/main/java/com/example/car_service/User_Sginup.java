package com.example.car_service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class User_Sginup extends AppCompatActivity {
CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__sginup);

        check = (CheckBox) findViewById(R.id.agre);

    }

    public void checked2(View view) {

        if (check.isChecked()){
            Intent intent = new Intent(User_Sginup.this ,U_Signup.class );
            startActivity(intent);
                              }
                                   }



}
