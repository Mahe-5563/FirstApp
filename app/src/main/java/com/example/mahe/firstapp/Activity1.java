package com.example.mahe.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class Activity1 extends AppCompatActivity {
    Button btn1;
    TextView tv;
    private GoogleApiClient client;
    private final int SPLASH_DISPLAY_LENGTH = 500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_1);


        // getActionBar().setDisplayShowTitleEnabled(false);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Activity1.this,Activity2.class);
                Activity1.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                Activity1.this.startActivity(mainIntent);
                Activity1.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}