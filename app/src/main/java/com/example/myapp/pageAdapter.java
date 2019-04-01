package com.example.myapp;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    public pageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new reporteFragment();
            case 1:
                return new propuestaFragment();
            case 2:
                return new perfilFragment();
            default:
                return null;
        }
    }



    @Override
    public int getCount() {
        return 0;
    }
}
