package com.retrievalsages.trainbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Splash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash2);
        getSupportActionBar().hide();
        Splash2Activity.Splash2Screen splash = new Splash2Activity.Splash2Screen();
        splash.start();
    }

    private class Splash2Screen extends Thread{

        public void run(){
            try{
                sleep(2000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(Splash2Activity.this,HomeActivity.class);
            startActivity(intent);
            Splash2Activity.this.finish();

        }
    }
}
