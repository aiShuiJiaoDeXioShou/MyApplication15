package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class day5_books extends AppCompatActivity implements View.OnClickListener {
    private Button login,zhuce;
    private TextView user,possword;
    private String text1,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day5_books);
        user = findViewById(R.id.editTextName);
        possword = findViewById(R.id.editTextName2);
        login = findViewById(R.id.longin);
        login.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.longin){
                text1 = user.getText().toString();
                text = possword.getText().toString();
                if (text1.equals("qw")&&text.equals("123")){
                    System.out.println("登入成功");
                    Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
                }else {
                    System.out.println("登入失败账号或者密码错误");
                    Toast.makeText(this,"登入失败账号或者密码错误",Toast.LENGTH_LONG).show();
                }
            }
        }
    }