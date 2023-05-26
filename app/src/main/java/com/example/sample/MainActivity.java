package com.example.sample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ImageView refine;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refine = findViewById(R.id.refine);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Refine.class);
                startActivity(i);
            }
        });

//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.group));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.suitcase));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.vendor));
//
//        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
//            @NonNull
//            @Override
//            public Fragment getItem(int position) {
//                switch (position){
//                    case 0:
//                        break;
//                    case 1:
//                        break;
//                }
//                return null;
//            }
//
//            @Override
//            public int getCount() {
//                return 0;
//            }
//        });
    }
}