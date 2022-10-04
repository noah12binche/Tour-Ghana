package com.example.tourghana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context mContext = this;
        setContentView(R.layout.activity_main);





        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mContext);

        // Set the adapter onto the view pager
        viewPager.setAdapter(fragmentAdapter);


        TabLayout tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);
    }
}