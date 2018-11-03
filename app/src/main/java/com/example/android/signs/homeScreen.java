package com.example.android.signs;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class homeScreen extends AppCompatActivity {

    private static final String TAG = "homeScreen";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        //Set up the ViewPager with the sections adapter
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        //creates a tab layout object and sets the id to tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    //creates a sections pager adapter and adds the fragments to the sections pager adapter and give them titles (like you're adding items to a list)
    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Categories(), "Категории");
        adapter.addFragment(new Tab2Favorites(), "Запазени");
        adapter.addFragment(new Tab3All(), "Всички");
        viewPager.setAdapter(adapter);


    }

}