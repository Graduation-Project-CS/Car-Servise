package com.example.car_service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class User_Sginup extends AppCompatActivity {
CheckBox check2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__sginup);
        getSupportActionBar().hide();

        check2 = (CheckBox) findViewById(R.id.agreU);

    }

    public void checked2(View view) {

        if (check2.isChecked()){
            Intent intent = new Intent(User_Sginup.this ,U_Signup.class );
            startActivity(intent);
    }
 }



}
