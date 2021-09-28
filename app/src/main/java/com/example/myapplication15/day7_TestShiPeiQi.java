package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class day7_TestShiPeiQi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day7_test_shi_pei_qi);
        //定义数据源
        String[] ss = {"姬野","吕归尘","羽然","路明非","陈墨瞳","楚子航"};
        //创造主角适配器,被评定为最简单的适配器
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.test_shi_pei_qi,R.id.text,ss);
        //放入适配器
        ListView listView = findViewById(R.id.lis);
        listView.setAdapter(stringArrayAdapter);

    }
}