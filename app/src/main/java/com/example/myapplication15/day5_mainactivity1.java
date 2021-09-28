package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class day5_mainactivity1 extends AppCompatActivity implements View.OnClickListener {
    TextView sexText,textView2,title,textView4,textView5,textView6,textView7;
    RadioButton sex1,sex2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7
            ,radioButton8,radioButton9, radioButton10;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day4_questionnaire);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button2){
            Toast.makeText(this,"已经提交您的问卷",Toast.LENGTH_LONG).show();
        }else if (view.getId()==R.id.button3){
            this.finish();
        }
    }
}