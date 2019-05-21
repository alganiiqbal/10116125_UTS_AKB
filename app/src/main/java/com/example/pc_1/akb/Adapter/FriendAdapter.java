package com.example.pc_1.akb.Adapter;
/**
 21/05/2019
 10116125
 Al Ghani Iqbal Dzulfiqar
 AKB -3
 **/
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pc_1.akb.MenuDescription;
import com.example.pc_1.akb.MenuFriends;
import com.example.pc_1.akb.MenuInfo;
import com.example.pc_1.akb.MenuProfil;

public class FriendAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public FriendAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }



    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                MenuFriends tab1 = new MenuFriends();
                return tab1;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}