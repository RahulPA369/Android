package com.retrievalsages.trainbrain;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("SUBTRACTION");


        b1= (Button) findViewById(R.id.b3_easy);
        b2= (Button)findViewById(R.id.b3_med);
        b3= (Button)findViewById(R.id.b2_hard);
    }




    public void sendMessage1(View v){

        Intent v1 = new Intent(this,Easy3Activity.class);
        startActivity(v1);



    }

    public void sendMessage2(View v){

        Intent v1 = new Intent(this,Medium3Activity.class);
        startActivity(v1);


    }

    public void sendMessage3(View v){

        Intent v1 = new Intent(this,Hard3Activity.class);
        startActivity(v1);


    }
}
