package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class day6_Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day6_);
        TextView textView = findViewById(R.id.textView5);
        TextView textView1 = findViewById(R.id.textView6);
        textView1.setText("性感小雨浩在线装逼");
    }

}