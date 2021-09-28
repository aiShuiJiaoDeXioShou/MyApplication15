package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day6_month9_26_ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day6_9_26_list);
        //填充对象v
        ListView listView = findViewById(R.id.lv);
        //填充数据m
        List<Map<String, Object>> list = new ArrayList<>();
        String[] titles = { "桌子", "苹果", "蛋糕", "线衣", "猕猴桃", "围巾"};
        String[] prices = { "1800元", "10元/kg", "300元", "350元", "10元/kg","280元"};
        String[] from = {"icon","title","price"};
        int[] icons = {
                R.drawable.table,R.drawable.apple,R.drawable.cake,
                R.drawable.wireclothes,R.drawable.kiwifruit,R.drawable.scarf};
        for (int i = 0; i < titles.length; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("icon",icons[i]);
            map.put("title",titles[i]);
            map.put("price",prices[i]);
            list.add(map);
        }
        //控制器c
        //'SimpleAdapter(android.content.Context, java.util.List? extends java.util.Map >, int, java.lang.String[], int[])
        SimpleAdapter simpleAdapter = new SimpleAdapter(day6_month9_26_ListView.this,list,R.layout.list_item,from,icons);
        listView.setAdapter(simpleAdapter);
    }
}