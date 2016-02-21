package com.example.roisodowd.practice2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class q2Activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Button button = (Button) findViewById(R.id.radioButton10);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                TextView textView = (TextView) findViewById(R.id.textView19);
                textView.setVisibility(View.VISIBLE);
           // public void onClick(View view) {
               // TextView tv = TextView.this.findViewById(R.id.textView19);
               // tv.TextView(View.VISIBLE);
            }
        });
    }
}