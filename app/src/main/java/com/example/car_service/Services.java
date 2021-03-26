package com.example.car_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Services extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        imageView1=(ImageView) findViewById(R.id.imageView1);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView3=(ImageView) findViewById(R.id.imageView3);
        imageView4=(ImageView) findViewById(R.id.imageView4);
        imageView5=(ImageView) findViewById(R.id.imageView5);
        imageView6=(ImageView) findViewById(R.id.imageView6);
        imageView7=(ImageView) findViewById(R.id.imageView7);
        imageView8=(ImageView) findViewById(R.id.imageView8);
        imageView9=(ImageView) findViewById(R.id.imageView9);
        imageView10=(ImageView) findViewById(R.id.imageView10);

        textView1=(TextView) findViewById(R.id.textView1);
        textView2=(TextView) findViewById(R.id.textView2);
        textView3=(TextView) findViewById(R.id.textView3);
        textView4=(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView5);
        textView6=(TextView) findViewById(R.id.textView6);
        textView7=(TextView) findViewById(R.id.textView7);
        textView8=(TextView) findViewById(R.id.textView8);
        textView9=(TextView) findViewById(R.id.textView9);
        textView10=(TextView) findViewById(R.id.textView10);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        textView6.setOnClickListener(this);
        textView7.setOnClickListener(this);
        textView8.setOnClickListener(this);
        textView9.setOnClickListener(this);
        textView10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView1:
            case R.id.textView1:
            case R.id.imageView2:
            case R.id.textView2:
            case R.id.imageView3:
            case R.id.textView3:
            case R.id.imageView4:
            case R.id.textView4:
            case R.id.imageView5:
            case R.id.textView5:
            case R.id.imageView6:
            case R.id.textView6:
            case R.id.imageView7:
            case R.id.textView7:
            case R.id.imageView8:
            case R.id.textView8:
            case R.id.imageView9:
            case R.id.textView9:
            case R.id.imageView10:
            case R.id.textView10:
                startActivity(new Intent(this,Pishakan.class));
                break;
        }
    }

}