package com.example.roisodowd.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class q1Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        ((ImageView) findViewById(R.id.imageView1)).setImageDrawable(getDrawable(R.drawable.watermelon));
        ((ImageView) findViewById(R.id.imageView2)).setImageDrawable(getDrawable(R.drawable.lemon));
        ((ImageView) findViewById(R.id.imageView3)).setImageDrawable(getDrawable(R.drawable.apple));

        RadioButton r4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton r5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton r6 = (RadioButton) findViewById(R.id.radioButton6);

        r4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView21);
                textViewA.setVisibility(View.VISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView20);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView28);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView21);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView20);
                textViewB.setVisibility(View.VISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView28);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView21);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView20);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView28);
                textViewC.setVisibility(View.VISIBLE);
            }
        });

        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b10 = (Button) findViewById(R.id.button10);

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent1 = new Intent(q1Activity.this, MainActivity.class);
                startActivity(myintent1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(q1Activity.this, q2Activity.class);
                startActivity(myintent2);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent3 = new Intent(q1Activity.this, AddQsActivity.class);
                startActivity(myintent3);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent4 = new Intent(q1Activity.this, SettingsActivity.class);
                startActivity(myintent4);
            }
        });
    }

    public void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

    }
}