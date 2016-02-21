package com.example.roisodowd.practice2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class q4Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);



        Button one = (Button)this.findViewById(R.id.audio1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bye);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        Button two = (Button)this.findViewById(R.id.audio2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.hi);
        two.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp2.start();
            }
        });


        Button three = (Button)this.findViewById(R.id.audio3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.thankyou);
       three.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp3.start();
            }
        });





        RadioButton r14 = (RadioButton) findViewById(R.id.radioButton14);
        RadioButton r15 = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton r16 = (RadioButton) findViewById(R.id.radioButton16);

        r14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView35);
                textViewA.setVisibility(View.VISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView36);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView37);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView35);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView36);
                textViewB.setVisibility(View.VISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView37);
                textViewC.setVisibility(View.INVISIBLE);
            }
        });

        r16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewA = (TextView) findViewById(R.id.textView35);
                textViewA.setVisibility(View.INVISIBLE);

                TextView textViewB = (TextView) findViewById(R.id.textView36);
                textViewB.setVisibility(View.INVISIBLE);

                TextView textViewC = (TextView) findViewById(R.id.textView37);
                textViewC.setVisibility(View.VISIBLE);
            }
        });

        Button b16 = (Button) findViewById(R.id.button16);
        Button b17 = (Button) findViewById(R.id.button17);
        b16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent1 = new Intent(q4Activity.this, q3Activity.class);
                startActivity(myintent1);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(q4Activity.this, q5Activity.class);
                startActivity(myintent2);
            }
        });












    }


    protected void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);


    }
}


