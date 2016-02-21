package com.example.roisodowd.practice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

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

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b10 = (Button) findViewById(R.id.button10);

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent1 = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(myintent1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Main2Activity.this, q2Activity.class);
                startActivity(myintent2);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent3 = new Intent(Main2Activity.this, AddQsActivity.class);
                startActivity(myintent3);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent4 = new Intent(Main2Activity.this, SettingsActivity.class);
                startActivity(myintent4);
            }
        });
    }
}