package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class day5_zhuce extends AppCompatActivity implements View.OnClickListener {
    String poss,user,em,yanzhen,poss2;
    Button yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day4_zhuce);
        yes = findViewById(R.id.button4);
        no = findViewById(R.id.button);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        user = findViewById(R.id.editTextTextPersonName).toString();
        poss = findViewById(R.id.editTextTextPassword).toString();
        poss2 = findViewById(R.id.editTextTextPassword2).toString();
        em = findViewById(R.id.editTextTextPersonName2).toString();
        if(view.getId()==R.id.button4){
            if (user!=null&&poss!=null&&poss2.equals(poss)&&em!=null){
                Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"失败",Toast.LENGTH_LONG).show();
            }
        }else if (view.getId()==R.id.button){
            this.finish();
        }
    }
}