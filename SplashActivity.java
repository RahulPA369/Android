package com.retrievalsages.trainbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        SplashScreen splash = new SplashScreen();
        splash.start();


    }

    private class SplashScreen extends Thread{

        public void run(){
            try{
                sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashActivity.this,Splash2Activity.class);
            startActivity(intent);
            SplashActivity.this.finish();

        }
    }
}
