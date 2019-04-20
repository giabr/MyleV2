package com.example.mylev2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ListKain();
            case 1: return new ListKain();
            case 2: return new ListKain();
            default: return new ListKain();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 4;
    }

    @Override    public CharSequence getPageTitle(int position) {
        switch (position){
        case 0: return "Kain";
        case 1: return "Desain";
        case 2: return "Penjahit";
        default: return "MyCustom";
    }
    }
}
