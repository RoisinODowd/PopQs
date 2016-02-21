package com.example.roisodowd.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        RadioButton r1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton r3 = (RadioButton) findViewById(R.id.radioButton3);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddQsActivity.class);
                startActivity(intent);
            }
<<<<<<< HEAD


=======
>>>>>>> master
        });

        b2.setOnClickListener(new View.OnClickListener() {

<<<<<<< HEAD
                        //startActivity(new Intent("com.tobidae.Activity1"));

                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);
                }

            });

          Intent e = new Intent(getApplicationContext(), BubbleActivity.class);
          startActivity(e);
        }

    //Initializes controls

        //editQuestion=(EditText)findViewById(R.id.editQuestion);
        //editAnswer=(EditText)findViewById(R.id.editAnswer);
        //btnAdd=(Button)findViewById(R.id.btnAdd);
        //btnDelete=(Button)findViewById(R.id.btnDelete);
        //btnModify=(Button)findViewById(R.id.btnModify);
        //btnView=(Button)findViewById(R.id.btnView);
        //btnViewAll=(Button)findViewById(R.id.btnViewAll);
        //btnShowInfo=(Button)findViewById(R.id.btnShowInfo);

        // Registers event handlers

        //btnAdd.setOnClickListener(this);
        //btnDelete.setOnClickListener(this);
        //btnModify.setOnClickListener(this);
        //btnView.setOnClickListener(this);
        //btnViewAll.setOnClickListener(this);
        //btnShowAll.setOnClickListener(this);

        // Creates database/table

        //db=openOrCreateDatabase("QuizDB", Context.MODE_PRIVATE, null);
        //db.execSQL("CREATE TABLE IF NOT EXISTS quiz(question VARCHAR,answer VARCHAR);");
=======
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
>>>>>>> master

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, q6Activity.class);
                startActivity(intent);

            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, q4Activity.class);
                startActivity(intent);

            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, q2Activity.class);
                startActivity(intent);

            }
        });


    }
}

