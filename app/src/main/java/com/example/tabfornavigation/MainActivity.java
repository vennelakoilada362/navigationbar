package com.example.tabfornavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class MainActivity extends AppCompatActivity {
private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       vp = findViewById(R.id.viewpager);
       ViewPagerAdapter vpa=new ViewPagerAdapter(getSupportFragmentManager());
       vp.setAdapter(vpa);
    }
    class ViewPagerAdapter extends FragmentStatePagerAdapterte {
        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return new RedFragment();
                case 1:return new BlueFragment();
                case 3:return new GreenFragment();

            return null;
        }
        @Override
        public int getCount() {
            return 3;
          }

        }
    }
}