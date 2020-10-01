package com.umair.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    List<Model> models;
    PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.vpager);
        models = new ArrayList<>();
        models.add(new Model("Umair","Student"));
        models.add(new Model("Kohli","Cricketer"));
        models.add(new Model("Messi","Footballer"));
        adapter = new PagerAdapter(models);
        viewPager.setAdapter(adapter);
    }
}