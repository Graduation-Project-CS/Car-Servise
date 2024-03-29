package com.example.car_service;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class U_Signup extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;
    DatabaseReference databaseReference;
    Spinner spcity;
    ImageView w1;
    Button button;
    EditText firstName,secondName,age,phone,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u__signup);

        w1 = (ImageView) findViewById(R.id.w1);
        firstName = findViewById(R.id.fname);
        secondName = findViewById(R.id.lname);
        age = findViewById(R.id.age);
        phone = findViewById(R.id.phone);
        pass = findViewById(R.id.password);


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
                addUser();
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
        w1.setImageURI(selectedImage);
    }

    void addUser(){
        databaseReference= FirebaseDatabase.getInstance().getReference("users");
        String full_name=firstName.getText().toString()+" "+secondName.getText().toString();
        String agee= age.getText().toString();
        String phone_num=phone.getText().toString();
        String passw=pass.getText().toString();
        String city=spcity.getSelectedItem().toString();
        String id="1";
        UserHelperClass userHelperClass=new UserHelperClass(id,full_name,agee,phone_num,city,passw);

        if (!TextUtils.isEmpty(full_name) && !TextUtils.isEmpty(agee) && !TextUtils.isEmpty(phone_num) && !TextUtils.isEmpty(city) && !TextUtils.isEmpty(passw)){

            String idd=databaseReference.push().getKey();
            UserHelperClass repairmenHelperClass=new UserHelperClass(idd,full_name,agee,phone_num,city,passw);
            databaseReference.child(id).setValue(userHelperClass);
            Toast.makeText(this, "done", Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(this, "unsucessful", Toast.LENGTH_SHORT).show();
        }
    }

}