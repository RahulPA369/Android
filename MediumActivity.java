package com.retrievalsages.trainbrain;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MediumActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    Button b1,b2;
    int r1,r2,c1=0,c2=0;
    String message = "ANSWER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MEDIUM");

        t1 = (TextView)findViewById(R.id.mtxt1);
        t2 = (TextView)findViewById(R.id.mtxt3);
        t3 = (TextView)findViewById(R.id.mtxt4);
        b1 = (Button)findViewById(R.id.mbtn1);
        b2 = (Button)findViewById(R.id.mbtn2);


    }

    public void generate(View v){

        Random random = new Random();
        r1 = random.nextInt(100 - 10)+10;
        r2 = random.nextInt(50 - 10)+10;
        t1.setText(String.format("%s",r1));
        t2.setText(String.format("%s",r2));
        if (c2 != 0)
        {
            t3.setText(message);
        }
        c1=1;


    }

    public void answer(View v){

        if (c1==0)
        {
            t3.setText(message);
        }
        else {
            int r3 = r1 * r2;
            t3.setText(String.format("%s", r3));
        }
        c2 = 1;

    }



}
