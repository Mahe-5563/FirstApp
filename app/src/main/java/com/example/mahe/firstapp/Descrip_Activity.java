package com.example.mahe.firstapp;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Descrip_Activity extends AppCompatActivity {

    Button btn;
    Toolbar toolbar;
    TextView tv;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrip_);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //String Descrip = getResources().getStringArray(R.array.);



        Bundle intent = getIntent().getExtras();
        int position = intent.getInt("position");



        String[] description = getResources().getStringArray(R.array.Windows);
        String[] hyperlinks = getResources().getStringArray(R.array.Hyperlinks);

        tv = (TextView) findViewById(R.id.text1);
        tv2 = (TextView)findViewById(R.id.text2);
        ImageView iv = (ImageView)findViewById(R.id.backdrop);


        TextView tvh = (TextView) findViewById(R.id.hyperlink);
        tvh.setMovementMethod(LinkMovementMethod.getInstance());



        tv.setText(description[position]);
        tvh.setText(hyperlinks[position]);


        switch(position)
        {
            case 0:
                tv2.setText("Windows");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.introtowindows));
                break;
            case 1:
                tv2.setText("MS Office");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.msofficejpg));
                break;
            case 2:
                tv2.setText("MS Exchange");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.msexch));
                break;
            case 3:
                tv2.setText("Share Point");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.mssharepoint));
                break;
            case 4:
                tv2.setText("SQL Server");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.sqlserver));
                break;
            case 5:
                tv2.setText("Windows Server");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.windowsserver));
                break;
            case 6:
                tv2.setText("Visual Studio");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.visualstudio));
                break;
            case 7:
                tv2.setText("XBox");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.xbox));
                break;
            case 8:
                tv2.setText("Bing!");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.binglogo));
                break;
            case 9:
                tv2.setText("MS Dynamics");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.msdynamics));
                break;
            case 10:
                tv2.setText("System Center");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.systemcenterlogo));
                break;
            case 11:
                tv2.setText("Skype");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.skypelogo));
                break;
            case 12:
                tv2.setText("Windows Azure");
                iv.setImageDrawable(ContextCompat.getDrawable(Descrip_Activity.this, R.drawable.azure));
                break;
        }


        btn = (Button) findViewById(R.id.toolabrbackbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}