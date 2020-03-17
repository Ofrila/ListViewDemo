package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    int[] images={
            R.drawable.girl,
            R.drawable.picture2,
            R.drawable.picture3,
            R.drawable.picture4,
            R.drawable.picture5,
            R.drawable.picture6,
            R.drawable.picture7,
            R.drawable.picture8,
            R.drawable.picture9,
            R.drawable.picture10,
            R.drawable.picture11,
            R.drawable.picture12,
            R.drawable.picture13,
            R.drawable.picture14,
            R.drawable.picture15,
            R.drawable.picture16,
            R.drawable.picture17,
            R.drawable.picture18,
            R.drawable.picture19,
            R.drawable.picture20,
            R.drawable.picture21,
            R.drawable.picture22,
            R.drawable.picture23,
            R.drawable.picture24,
            R.drawable.picture25,
            R.drawable.picture26,
            R.drawable.picture27,
            R.drawable.picture28,
            R.drawable.picture29,
            R.drawable.picture30,
            R.drawable.picture31,
            R.drawable.picture32,
            R.drawable.picture33
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.lv_listview);

        //ArrayAdapter arrayAdapter= new ArrayAdapter(this,R.layout.item,R.id.item_text,CQU_ID);
        BaseAdapter adapter = new BaseAdapter(){
            public View getView(int position, View convertView, ViewGroup parent) {

                View layout=View.inflate(MainActivity.this, R.layout.item, null);
                ImageView image = (ImageView)layout.findViewById(R.id.item_image);
                TextView ID =(TextView)layout.findViewById(R.id.item_text);
                image.setImageResource(images[position]);
                ID.setText(CQU_ID[position]);
                return layout;
            }

            @Override
            public long getItemId(int position) {

                return position;
            }

            @Override
            public Object getItem(int position) {

                return CQU_ID[position];
            }

            @Override
            public int getCount() {

                return CQU_ID.length;
            }

        };

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               setContentView(R.layout.activity_messages);
               ImageView imageView=findViewById(R.id.image);
               TextView textView=findViewById(R.id.tv_id);
               imageView.setImageResource(images[position]);
               textView.setText(CQU_ID[position]);

            }
        });





    }
}
