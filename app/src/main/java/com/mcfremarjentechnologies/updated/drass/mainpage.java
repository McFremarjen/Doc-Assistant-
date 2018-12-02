package com.mcfremarjentechnologies.updated.drass;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class mainpage extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewpager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        mToolbar = (Toolbar)findViewById(R.id.mMain_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Dr Ass");



        //tabs
        mViewpager =(ViewPager)findViewById(R.id.tabPager);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewpager.setAdapter(mSectionsPagerAdapter);

        //tablayout
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout1);
        mTabLayout.setupWithViewPager(mViewpager);
    }
}
