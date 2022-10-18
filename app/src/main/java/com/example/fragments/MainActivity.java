package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SectionStagePagerAdapter pagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     
        pagerAdapter = new SectionStagePagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionStagePagerAdapter adapter = new SectionStagePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment01(), "Fragment01");
        adapter.addFragment(new Fragment02(), "Fragment02");
        adapter.addFragment(new Fragment03(), "Fragment03");
        viewPager.setAdapter(adapter);
    }
    
    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}