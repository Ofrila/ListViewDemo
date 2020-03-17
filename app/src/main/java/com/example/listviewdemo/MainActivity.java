package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] CQU_ID={
                "20161707",
                "20161713",
                "20171591",
                "20171592",
                "20171616",
                "20171627",
                "20171641",
                "20171649",
                "20171650",
                "20171653",
                "20171654",
                "20171655",
                "20171656",
                "20171659",
                "20171664",
                "20171666",
                "20171667",
                "20171667",
                "20171668",
                "20171669",
                "20171670",
                "20171679",
                "20171688",
                "20171697",
                "20171705",
                "20171707",
                "20171714",
                "20171717",
                "20171731",
                "20171742",
                "20175064",
                "20175980",
                "20175990"
        };

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,R.layout.item,R.id.item_text,CQU_ID);
        ListView listView=findViewById(R.id.lv_listview);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, Messages.class);
                intent.putExtra("ID", CQU_ID[position]);
                intent.putExtra("image",R.drawable.girl);
                MainActivity.this.startActivity(intent);



            }
        });





    }
}
