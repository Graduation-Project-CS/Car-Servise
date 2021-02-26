package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Language_City extends AppCompatActivity {
 Spinner splang , spcity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language__city);

        splang = (Spinner) findViewById(R.id.spinner);
        spcity = (Spinner) findViewById(R.id.spinner2);

        List<String> categories = new ArrayList<String>();
        categories.add("کوردی");
        categories.add("عرەبی");
        categories.add("English");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
        splang.setAdapter(dataAdapter);
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String> categori = new ArrayList<String>();
        categori.add("سلێمانی");
        categori.add("هەولێر");
        categori.add("کەرکوک");
        categori.add("هەڵەبجە");
        categori.add("دهۆک");
        categori.add("زاخۆ");
        categori.add("ئاکرێ");
        categori.add("قەرەداغ");
        categori.add("خانەقین");
        categori.add("کفری");
        categori.add("عەنکاوە");
        categori.add("چەمچەماڵ");
        categori.add("پیرەمەگروون");
        categori.add("کەلار");

        ArrayAdapter<String> dataAdapt = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, categori);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
        spcity.setAdapter(dataAdapt);

    }

    public void next(View view) {
        Intent i = new Intent(Language_City.this,info.class);
        startActivity(i);
    }
}