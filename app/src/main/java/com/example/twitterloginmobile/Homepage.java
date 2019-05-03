package com.example.twitterloginmobile;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity{
    TextView timeline,otros,tweets;
    Button Button1,Button2,Button3;

    ViewPager viewPager;
    PagerViewAdepter pagerViewAdepter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        timeline = (TextView)findViewById(R.id.timeline);
        otros = (TextView)findViewById(R.id.otros);
        tweets = (TextView)findViewById(R.id.tweets);
        viewPager = (ViewPager)findViewById(R.id.fragment_container);

        pagerViewAdepter = new PagerViewAdepter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdepter);

        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });



        otros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });


        tweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });






        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int i) {
                onChangeTab(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });





    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int i) {
        if (i==0){

            timeline.setTextSize(22);
            timeline.setTextColor(getColor(R.color.blue_color));


            otros.setTextSize(20);
            otros.setTextColor(getColor(R.color.gray_color));

            tweets.setTextSize(20);
            tweets.setTextColor(getColor(R.color.gray_color));



        }

        if (i==1){

            timeline.setTextSize(20);
            timeline.setTextColor(getColor(R.color.gray_color));


            otros.setTextSize(22);
            otros.setTextColor(getColor(R.color.blue_color));

            tweets.setTextSize(20);
            tweets.setTextColor(getColor(R.color.gray_color));



        }

        if (i==2){

            timeline.setTextSize(20);
            timeline.setTextColor(getColor(R.color.gray_color));


            otros.setTextSize(20);
            otros.setTextColor(getColor(R.color.gray_color));

            tweets.setTextSize(22);
            tweets.setTextColor(getColor(R.color.blue_color));



        }






    }



}


