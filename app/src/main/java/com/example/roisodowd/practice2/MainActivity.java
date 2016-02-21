package com.example.roisodowd.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button mClickButton1 = (Button)findViewById(R.id.button);
        //mClickButton1.setOnClickListener(this);
        //Button mClickButton2 = (Button)findViewById(R.id.button2);
        //mClickButton2.setOnClickListener(this);


        Button send = (Button) findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //public void onClick (View v){

                //startActivity(new Intent("com.tobidae.Activity1"));

                Intent i = new Intent(getApplicationContext(), AddQsActivity.class);
                startActivity(i);
            }


        });

    //}

   // @Override
   // protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);


       final Button button = (Button) findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    //public void onClick (View v){

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

        // Inserts a record in the table

        //db.execSQL("INSERT INTO student VALUES('"+editQuestion.getText()+"','"+editAnswer.getText()+"');");

        // Updates record of selected question

        //db.execSQL("UPDATE student SET answer='"+editAnswer.getText()+"'WHERE question='"+editQuestion.getText()+"');");

        // View one record

        //Cursor c=db.rawQuery("SELECT * FROM quiz WHERE question='"+editQuestion.getText()+"'", null);
        //if(c.movetoFirst())
        //{
        //    editAnswer.setText(c.getString(1));
        //}

        // View all records

        //Cursor c=db.rawQuery("SELECT * FROM quiz", null);
        //if(c.getCount()==0)
        //{
        //    showMessage("Error", "No records found");
        //    return;
    }
        //StringBuffer buffer=new StringBuffer();
        //while(c.moveToNext())
        //{
        //    buffer.append("Question: "+c.getString(0)+"\n");
        //    buffer.append("Answer: "+c.getString(1)+"\n");
        //}
        //showMessage("Quiz Details", buffer.toString());




    // Interfaces with radio buttons

   // @Override
    //public void onRadioButtonClicked(View view) {

        // Sees if the button was checked

//        boolean checked = ((RadioButton) view).isChecked();

        // Sees which button was checked

  //      switch(view.getId()) {
    //        case R.id.radio_app_name:
      //          if (checked)
                    // Do something
       //         break;
         //   case R.id.radio_action_settings:
           //     if (checked)
             //       // Do something
               // break;
        //}
    //}



    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
      //  return true;
    //}

    //@Override
  //  public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
    //    if (id == R.id.action_settings) {
   //         return true;
   //     }

  //      return super.onOptionsItemSelected(item);
   // }
//}
