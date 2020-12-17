package com.retrievalsages.trainbrain;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MULTIPLICATION");


        b1= (Button) findViewById(R.id.b_easy);
        b2= (Button)findViewById(R.id.b_med);
        b3= (Button)findViewById(R.id.b_hard);
    }




        public void sendMessage1(View v){

            Intent v1 = new Intent(this,EasyActivity.class);
            startActivity(v1);



        }

        public void sendMessage2(View v){

            Intent v1 = new Intent(this,MediumActivity.class);
            startActivity(v1);


        }

        public void sendMessage3(View v){

            Intent v1 = new Intent(this,HardActivity.class);
            startActivity(v1);


        }



}
