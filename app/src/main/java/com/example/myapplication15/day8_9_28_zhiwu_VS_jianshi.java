package com.example.myapplication15;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class day8_9_28_zhiwu_VS_jianshi extends AppCompatActivity {
    private ImageView imageView;
    private int indext = 0;
    private int imgs[]={
            R.drawable.z_01,
            R.drawable.z_02,
            R.drawable.z_03,
            R.drawable.z_04,
            R.drawable.z_05,
            R.drawable.z_06,
            R.drawable.z_07,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day8_9_8_zhiwu_vs_jianshi);
        imageView = findViewById(R.id.imageView7);
        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what==123){
                    imageView.setImageResource(imgs[indext++%7 ]);
                }
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(123);
            }
        },0,200);
    }
}