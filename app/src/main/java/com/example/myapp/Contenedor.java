package com.example.myapp;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contenedor extends AppCompatActivity {

    TabItem tabAlumno;
    TabItem tabDocente;
    ViewPager viewPager;
    TabLayout tabLayout;
    PagerAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);
        tabLayout = findViewById(R.id.tab_layout);
        tabAlumno = findViewById(R.id.tabAlumno);
        tabDocente = findViewById(R.id.tabDocente);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new pageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
