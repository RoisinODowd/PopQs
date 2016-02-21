package com.example.roisodowd.practice2;

/**
 * Created by roisodowd on 2/20/16.
 */
public class dbMySqlite {
}


//Initializes controls for DB

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
