package com.example.tourghana;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public FragmentAdapter(@NonNull FragmentManager fm, Context mContext) {
        
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.region_1);
            case 1:
                return mContext.getString(R.string.region_2);
            case 2:
                return mContext.getString(R.string.region_3);
            case 3:
                return mContext.getString(R.string.region_4);
            case 4:
                return mContext.getString(R.string.region_5);
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NorthernRegionFragment();
            case 1:
                return new EasternRegionFragment();
            case 2:
                return new WesternRegionFragment();
            case 3:
                return new AshantiRegionFragment();
            case 4:
                return new BrongAhafoRegionFragment();
            default:
                return null;
        }
    }
}
