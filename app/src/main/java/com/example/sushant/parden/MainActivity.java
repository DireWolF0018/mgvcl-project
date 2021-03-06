package com.example.sushant.parden;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.app.AlertDialog.THEME_DEVICE_DEFAULT_LIGHT;
import static android.app.AlertDialog.THEME_HOLO_LIGHT;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

            if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle( Html.fromHtml("<font color='#ffffff'>WARNING</font>"));
                builder.setMessage("Please check your network connection");
                builder.show();
            }
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,syncActivity.class);
                startActivity(i);
            }
        });
       /* AnimationDrawable animationDrawable=(AnimationDrawable)b1.getBackground();
        AnimationDrawable animationDrawable1=(AnimationDrawable)b2.getBackground();
        AnimationDrawable animationDrawable2=(AnimationDrawable)b3.getBackground();
        AnimationDrawable animationDrawable3=(AnimationDrawable)b4.getBackground();
        AnimationDrawable animationDrawable4=(AnimationDrawable)b5.getBackground();

        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        animationDrawable1.setEnterFadeDuration(2000);
        animationDrawable1.setExitFadeDuration(4000);
        animationDrawable1.start();
        animationDrawable2.setEnterFadeDuration(2000);
        animationDrawable2.setExitFadeDuration(4000);
        animationDrawable2.start();
        animationDrawable3.setEnterFadeDuration(2000);
        animationDrawable3.setExitFadeDuration(4000);
        animationDrawable3.start();
        animationDrawable4.setEnterFadeDuration(2000);
        animationDrawable4.setExitFadeDuration(4000);
        animationDrawable4.start();*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next1();
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next2();
            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next3();
            }


        });

    }

    private void next3() {
        Intent intent=new Intent(this, com.class);
        startActivities(new Intent[]{intent});
    }

    private void next2() {
        Intent intent=new Intent(this, mgvcl12.class);
        startActivities(new Intent[]{intent});
    }

    private void next() {
        Intent intent=new Intent(this, page1.class);
        startActivities(new Intent[]{intent});
    }
    private void next1() {
        Intent intent=new Intent(MainActivity.this, menu.class);
        startActivities(new Intent[]{intent});
    }

}
