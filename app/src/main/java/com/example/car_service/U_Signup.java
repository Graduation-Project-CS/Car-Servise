package com.example.car_service;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class U_Signup extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;
    Spinner spcity;
    ImageView w;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u__signup);

        w = (ImageView) findViewById(R.id.w1);


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

        dataAdapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spcity.setAdapter(dataAdapt);
////////////////////////////////////////////////////////////////////////////////////////////////////


        button= (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(U_Signup.this ,Services.class ));
            }
        });


    }

    public void wena1(View view) {

        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(gallery, RESULT_LOAD_IMAGE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null) ;
        Uri selectedImage = data.getData();
        w.setImageURI(selectedImage);




    }

}