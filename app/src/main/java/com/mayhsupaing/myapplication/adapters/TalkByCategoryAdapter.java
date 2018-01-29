package com.mayhsupaing.myapplication.adapters;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TableLayout;

import com.bumptech.glide.load.resource.drawable.DrawableResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class TalkByCategoryAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;

    public TalkByCategoryAdapter(FragmentManager fm) {
        super(fm);
        mFragments=new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addTab(Fragment fragment)
    {
        mFragments.add(fragment);
        notifyDataSetChanged();
    }

}
