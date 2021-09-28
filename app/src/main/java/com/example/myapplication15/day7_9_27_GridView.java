package com.example.myapplication15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day7_9_27_GridView extends AppCompatActivity {
    String[] names = {"cat","dog","老虎","乌鸦"};
    int[] icons = {R.drawable.table,R.drawable.cake,R.drawable.apple,R.drawable.scarf};
    List<Map<String,Object>> arr = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day7_9_27_gridview);
        for (int i = 0; i < names.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("icon",icons[i]);
            map.put("name",names[i]);
            arr.add(map);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arr,R.layout.grid_item,
                new String[]{"icon","name"},new int[]{R.id.image,R.id.ms_dsc});
        GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(simpleAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                //弹出对话框显示单击图片对应的名称
                Toast.makeText(day7_9_27_GridView.this, names[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}