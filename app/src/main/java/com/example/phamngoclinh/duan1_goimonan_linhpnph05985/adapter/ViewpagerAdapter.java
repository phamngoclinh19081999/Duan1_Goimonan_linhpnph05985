package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.Historyorder;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.Ordernow;

public class ViewpagerAdapter extends FragmentPagerAdapter {
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Ordernow();
            case 1:
                return new Historyorder();
            default:
                return new Ordernow();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Order hiện tại";
            case 1:
                return "Lịch sử Order";
            default:
                return "Order hiện tại";
        }
    }
}
