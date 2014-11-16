package com.example.jazbet.practica1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickName(View view){
        //TextView txt = (TextView)findViewById(R.id.txtName);
        EditText text = (EditText)findViewById(R.id.inputName);
        Intent name = new Intent();
        name.putExtra("value", text.getText().toString());
        name.setClass(this,NameOption.class);
        //Intent name = new Intent(this,NameActivity.class);
        startActivity(name);
    }
    //button for the second activity
    public void onClickSurname(View view){
        //Intent surname = new Intent(this,SurnameActivity.class);
        //startActivity(surname);

        EditText text = (EditText)findViewById(R.id.inputSurname);
        Intent surname = new Intent();
        surname.putExtra("value", text.getText().toString());
        surname.setClass(this,SurnameOption.class);
        startActivity(surname);
    }
    //button for the third activity
    public void onClickAge(View view){
        //Intent age = new Intent(this,AgeActivity.class);
        //startActivity(age);
        EditText text = (EditText)findViewById(R.id.inputAge);
        Intent age = new Intent();
        age.putExtra("value",text.getText().toString());
        age.setClass(this, AgeOption.class);
        startActivity(age);
    }
    //button for the fourth activity
    public void onClickImg(View view){
        Intent img = new Intent(this,ImageOption.class);
        startActivity(img);
    }
}
