package com.example.car_service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class Language_City extends AppCompatActivity {
 Spinner splang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language__city);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // when this activity is about to be launch we need to check if its openened before or not

        if (restorePrefData()) {

            Intent mainActivity = new Intent(getApplicationContext(),Language_City.class );
            startActivity(mainActivity);
            finish();


        }





        getSupportActionBar().hide();

        splang = (Spinner) findViewById(R.id.spinner);

        List<String> categories = new ArrayList<String>();
        categories.add("کوردی");
        categories.add("عرەبی");
        categories.add("English");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
        splang.setAdapter(dataAdapter);


    }

    public void next(View view) {
        Intent i = new Intent(Language_City.this,login.class);
        startActivity(i);
    }


    private boolean restorePrefData() {


        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend",false);
        return  isIntroActivityOpnendBefore;



    }

}