package com.example.roisodowd.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class q6Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        RadioButton r20 = (RadioButton) findViewById(R.id.radioButton20);
        RadioButton r21 = (RadioButton) findViewById(R.id.radioButton21);
        RadioButton r22 = (RadioButton) findViewById(R.id.radioButton22);

        r20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView33);
                textViewA.setVisibility(View.VISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView24);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView25);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView33);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView24);
                textViewB.setVisibility(View.VISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView25);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView33);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView24);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView25);
                textViewC.setVisibility(View.VISIBLE);
            }
        });
        Button b20 = (Button) findViewById(R.id.button20);
        Button b21 = (Button) findViewById(R.id.button21);
        b20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent1 = new Intent(q6Activity.this, q5Activity.class);
                startActivity(myintent1);
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(q6Activity.this, q7Activity.class);
                startActivity(myintent2);
            }
        });
    }

    protected void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);



    }
}
