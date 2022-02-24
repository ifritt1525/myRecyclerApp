package com.example.myrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MoreInfoActivity extends AppCompatActivity {

    Bundle extras;
    int pos;
    String data1[], data2[];
    int images[];
    TextView moreInfoTV;
    ImageView moreInfoIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set View
        setContentView(R.layout.activity_more_info);

        //read in intent data
        extras = getIntent().getExtras();

        //set TextView text
        moreInfoTV = (TextView) findViewById(R.id.moreInfoTextView);
        moreInfoIV = (ImageView) findViewById(R.id.moreInfoImgView);
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (extras == null){
            moreInfoTV.setText("We got a null");
        }
        else {
            //load in the data from last activity
            pos = extras.getInt("idx");
            data1 = extras.getStringArray("data1");
            data2 = extras.getStringArray("data2");
            images = extras.getIntArray("imgs");

            moreInfoIV.setImageResource(images[pos]);
            moreInfoTV.setText(data1[pos] + " is the best country!");
        }
    }
}
