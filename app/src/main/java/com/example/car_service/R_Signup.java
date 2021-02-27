package com.example.car_service;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class R_Signup extends AppCompatActivity {
    private static final int RESULT_LOAD_IMAGE = 1;
    private static final int RESULT_LOAD_IMAGE2 = 1;
    Spinner spcity , azmwn;
    ImageView w1 , w2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r__signup);

        w1 = (ImageView) findViewById(R.id.w1);
        w2 = (ImageView) findViewById(R.id.w2);


////////////////////////////////////////////////////////////////////////////////////////////////////
        spcity = (Spinner) findViewById(R.id.spinner2);

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

        dataAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
        spcity.setAdapter(dataAdapt);
////////////////////////////////////////////////////////////////////////////////////////////////////
        azmwn = (Spinner) findViewById(R.id.azmwnykar);


        List<String> categoris = new ArrayList<String>();
        categoris.add("فیتەر");
        categoris.add("وایەرمەن");
        categoris.add("ڕۆنگۆڕ");
        categoris.add("پاتری");
        categoris.add("سەیارەی فلات");
        categoris.add("بەنزینی گەڕۆک");
        categoris.add("فیت پەمپ");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, categoris);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) ;
        azmwn.setAdapter(dataAdapter);
////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    public void wena1(View view) {

        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery , RESULT_LOAD_IMAGE);
    }

    public void wena2(View view) {
        Intent gallery2 = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery2 , RESULT_LOAD_IMAGE2);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null);
        Uri selectedImage = data.getData();
        w1.setImageURI(selectedImage);



        if (requestCode == RESULT_LOAD_IMAGE2 && resultCode == RESULT_OK && data != null);
        Uri selectedImage2 = data.getData();
        w2.setImageURI(selectedImage2);




    }



}