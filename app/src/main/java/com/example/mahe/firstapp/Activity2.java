package com.example.mahe.firstapp;

import android.app.Activity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mahe.firstapp.R.id.backdrop;

public class Activity2 extends Activity {

    Button btn,btn1;
    Toolbar toolbar;
    ImageView iv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        listAdaptFunc();
        buttonActionClick();


        this.btn1 = (Button) this.findViewById(R.id.btnext);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });


    }

    private void listAdaptFunc() {

        String[] data = new String[]{"Introduction to Windows", "MS Office", "MS Exchange", "Share Point", "SQL Server", "Windows Server", "Visual Studio", "XBox", "Bing Search Engine", "MS Dynamics", "System Center", "Skype", "Windows Azure"};

        Integer[] imageId = {R.drawable.introtowindows, R.drawable.msofficejpg, R.drawable.msexch, R.drawable.mssharepoint, R.drawable.sqlserver, R.drawable.windowsserver, R.drawable.visualstudio, R.drawable.xbox, R.drawable.binglogo, R.drawable.msdynamics, R.drawable.systemcenterlogo, R.drawable.skypelogo, R.drawable.azure};
        //imageId used to assign the images to the ListView items

        CustomList adapter = new CustomList(Activity2.this, data, imageId);


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(Activity2.this, R.layout.list_view_layout, data);
        ListView lv = (ListView) findViewById(R.id.list1);
        lv.setAdapter(adapter);
    }


    private void buttonActionClick() {

        final ListView lv = (ListView) findViewById(R.id.list1);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                //iv = (ImageView)findViewById(R.id.backdrop);


                Intent intent = new Intent (Activity2.this, Descrip_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("position", position);

               // int listItem = (int) lv.getItemAtPosition(position);

                switch(position)
                {
                    case 0:
                        intent.putExtra("Intro", getResources().getStringArray(R.array.Windows)[0]);
                        intent.putExtra("IntroH", getResources().getStringArray(R.array.Hyperlinks)[0]);

                        intent.putExtras(bundle);
                        break;
                    case 1:
                        intent.putExtra("Office", getResources().getStringArray(R.array.Windows)[1]);
                        intent.putExtra("OfficeH", getResources().getStringArray(R.array.Hyperlinks)[1]);

                        intent.putExtras(bundle);
                        break;
                    case 2:
                        intent.putExtra("Xchg", getResources().getStringArray(R.array.Windows)[2]);
                        intent.putExtra("XchgH", getResources().getStringArray(R.array.Hyperlinks)[2]);

                        intent.putExtras(bundle);
                        break;
                    case 3:
                        intent.putExtra("SPoint", getResources().getStringArray(R.array.Windows)[3]);
                        intent.putExtra("SPointH", getResources().getStringArray(R.array.Hyperlinks)[3]);

                        intent.putExtras(bundle);
                        break;
                    case 4:
                        intent.putExtra("SQL", getResources().getStringArray(R.array.Windows)[4]);
                        intent.putExtra("SQLH", getResources().getStringArray(R.array.Hyperlinks)[4]);

                        intent.putExtras(bundle);
                        break;
                    case 5:
                        intent.putExtra("WServ", getResources().getStringArray(R.array.Windows)[5]);
                        intent.putExtra("WServH", getResources().getStringArray(R.array.Hyperlinks)[5]);

                        intent.putExtras(bundle);
                        break;
                    case 6:
                        intent.putExtra("VStud", getResources().getStringArray(R.array.Windows)[6]);
                        intent.putExtra("VStudH", getResources().getStringArray(R.array.Hyperlinks)[6]);

                        intent.putExtras(bundle);
                        break;
                    case 7:
                        intent.putExtra("Xbox", getResources().getStringArray(R.array.Windows)[7]);
                        intent.putExtra("XboxH", getResources().getStringArray(R.array.Hyperlinks)[7]);

                        intent.putExtras(bundle);
                        break;
                    case 8:
                        intent.putExtra("bing", getResources().getStringArray(R.array.Windows)[8]);
                        intent.putExtra("bingH", getResources().getStringArray(R.array.Hyperlinks)[8]);

                        intent.putExtras(bundle);
                        break;
                    case 9:
                        intent.putExtra("MSD", getResources().getStringArray(R.array.Windows)[9]);
                        intent.putExtra("MSDH", getResources().getStringArray(R.array.Hyperlinks)[9]);

                        intent.putExtras(bundle);
                        break;
                    case 10:
                        intent.putExtra("SysCen", getResources().getStringArray(R.array.Windows)[10]);
                        intent.putExtra("SysCenH", getResources().getStringArray(R.array.Hyperlinks)[10]);

                        //Intent intent1 = intent.putExtra(null);
                        intent.putExtras(bundle);
                        break;
                    case 11:
                        intent.putExtra("Skype", getResources().getStringArray(R.array.Windows)[11]);
                        intent.putExtra("SkypeH", getResources().getStringArray(R.array.Hyperlinks)[11]);

                        intent.putExtras(bundle);
                        break;
                    case 12:
                        intent.putExtra("Azure", getResources().getStringArray(R.array.Windows)[12]);
                        intent.putExtra("AzureH", getResources().getStringArray(R.array.Hyperlinks)[12]);

                        intent.putExtras(bundle);
                        break;
                }

                startActivity(intent);

                Activity2.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


            }
        });

    }


}
