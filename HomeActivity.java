package com.retrievalsages.trainbrain;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("HOME");


        b1= (Button) findViewById(R.id.b_add);
        b2= (Button)findViewById(R.id.b_sub);
        b3= (Button)findViewById(R.id.b_mul);


    }

    public void sendMessage1(View v){

        Intent v1 = new Intent(this,Main2Activity.class);
        startActivity(v1);



    }

    public void sendMessage2(View v){

        Intent v1 = new Intent(this,Main3Activity.class);
        startActivity(v1);


    }

    public void sendMessage3(View v){

        Intent v1 = new Intent(this,MainActivity.class);
        startActivity(v1);


    }






}
