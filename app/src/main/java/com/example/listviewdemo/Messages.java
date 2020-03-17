package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.TextView;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        String ID = this.getIntent().getStringExtra("ID");
        TextView cquID = findViewById(R.id.tv_id);
        cquID.setText(ID);
    }
}
