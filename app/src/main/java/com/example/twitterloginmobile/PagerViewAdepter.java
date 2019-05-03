package com.example.twitterloginmobile;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdepter extends FragmentPagerAdapter {

    public PagerViewAdepter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i){
            case 0:

                fragment = new Fragment_Timeline();
                break;

            case 1:

                fragment = new Fragment_Otros();
                break;

            case 2:

                fragment = new Fragment_Tweets();
                break;


        }
        return fragment;
    }
    @Override
    public int getCount() {
        return 3;
    }
}
