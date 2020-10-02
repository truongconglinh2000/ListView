package com.example.btlist;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ListView lvSinger;
    ArrayList<Singer> arraySinger;
    SingerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new SingerAdapter(this,R.layout.line_singer,arraySinger);
        lvSinger.setAdapter(adapter);

    }
    private void AnhXa(){
        lvSinger =(ListView) findViewById(R.id.listview);
        arraySinger = new ArrayList<>();
        arraySinger.add(new Singer("V","BTS",R.drawable.v02));
        arraySinger.add(new Singer("Kim Jiso","BlackPink",R.drawable.jiso));
        arraySinger.add(new Singer("Kim Jenie","BlackPink",R.drawable.jennie));
        arraySinger.add(new Singer("B.I","Ikon",R.drawable.bi));
        arraySinger.add(new Singer("Kim Yohan","X1",R.drawable.yohan));

    }
}