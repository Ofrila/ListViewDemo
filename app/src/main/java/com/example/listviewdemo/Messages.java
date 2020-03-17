package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        String ID = this.getIntent().getStringExtra("ID");

        ImageView imageView=findViewById(R.id.image);
        TextView cquID = findViewById(R.id.tv_id);
        cquID.setText(ID);


    }
}
