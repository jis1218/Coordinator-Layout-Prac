package com.hongsup.coordinatorlayoutprac;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayoutMyinfo, tabLayoutClone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_myinfo);
        viewPagerAdapter = new ViewPagerAdapter();
        viewPager = findViewById(R.id.myinfo_viewPager);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayoutMyinfo = findViewById(R.id.tabLayoutMyInfo);
        tabLayoutClone = findViewById(R.id.tabLayoutClone);
        setListener();
    }

    private void setListener(){
        tabLayoutMyinfo.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        tabLayoutClone.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutClone));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutMyinfo));

    }
}
