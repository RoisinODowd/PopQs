package com.example.roisodowd.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class q2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        RadioButton r8 = (RadioButton) findViewById(R.id.radioButton8);
        RadioButton r9 = (RadioButton) findViewById(R.id.radioButton9);
        RadioButton r10 = (RadioButton) findViewById(R.id.radioButton10);

        r8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView17);
                textViewA.setVisibility(View.VISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView18);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView19);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView17);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView18);
                textViewB.setVisibility(View.VISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView19);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView17);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView18);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView19);
                textViewC.setVisibility(View.VISIBLE);
            }
        });
    }



    public void onCreate2 (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Button b12 = (Button) findViewById(R.id.button12);
        Button b13 = (Button) findViewById(R.id.button13);
         b12.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Intent myintent1 = new Intent(q2Activity.this, Main2Activity.class);
                 startActivity(myintent1);
             }
         });

        b13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(q2Activity.this, q3Activity.class);
                startActivity(myintent2);
            }
        });
    }
}
