package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class day8_9_28_Activity extends AppCompatActivity {
    String tag = "ActivityLifeTest";
    //Activity的生命周期
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day8_9_28);
        Log.d(tag,"执行了 onCreate()方法");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"执行了 onStart()方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"执行了 onStop()方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"执行了 onDestroy()方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"执行了 onPause()方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"执行了 onResume()方法");
    }
}