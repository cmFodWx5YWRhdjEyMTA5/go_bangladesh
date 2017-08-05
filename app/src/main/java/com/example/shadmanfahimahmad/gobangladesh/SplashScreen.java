package com.example.shadmanfahimahmad.gobangladesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ShadmanFahimAhmad on 7/28/2017.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);   // set the duration of splash screen
                    Intent intent = new Intent(getApplicationContext(), LgoinActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }


            }
        };
        timer.start();
    }


}
