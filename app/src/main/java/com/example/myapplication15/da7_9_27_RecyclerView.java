package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class da7_9_27_RecyclerView extends AppCompatActivity {
    //名称
    private String[] names = {
            "迪迦奥特曼","开罗奥特曼","闪光的奥特曼","绝对奥特曼"
    };
    //介绍
    private String[] introduces = {
       "光之奥特曼,他变成了光","我不知道","我乱编的","我不知道和乱编的"
    };
    //图片资源
    private int[] icons={R.drawable.table,R.drawable.cake,R.drawable.apple,R.drawable.scarf};
    //创建list数据存放器
    private List<Map<String,Object>> list = new ArrayList<>();
    //创建需要存放的id数组
    private String[] sId = {"name","icon","introduce"};
    //获取需要存放的id值
    private int[] id = {R.id.name,R.id.image,R.id.introduce};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day7_9_27_recycler_view);
        //利用集合放入数据
        for (int i = 0; i < names.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",names[i]);
            map.put("icon",icons[i]);
            map.put("introduce",introduces[i]);
            list.add(map);
        }
        SimpleAdapter simpleAdapter =new SimpleAdapter(this,list,R.layout.recycler_item,sId,id);

        ListView recyclerView = findViewById(R.id.id_recyclerview);
        recyclerView.setAdapter(simpleAdapter);
    }
}
