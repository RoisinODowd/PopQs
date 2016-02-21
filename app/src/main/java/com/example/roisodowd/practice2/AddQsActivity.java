package com.example.roisodowd.practice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddQsActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_qs);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);

        b7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent1 = new Intent(AddQsActivity.this, MainActivity.class);
                startActivity(myintent1);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(AddQsActivity.this, SettingsActivity.class);
                startActivity(myintent2);
            }
        });
    }
}

