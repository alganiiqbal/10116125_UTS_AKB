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
import com.example.pc_1.akb.MenuInfo;
import com.example.pc_1.akb.MenuProfil;


public class ProfilAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public ProfilAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }



    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                MenuProfil tab1 = new MenuProfil();
                return tab1;
            case 1:
                MenuDescription tab2 = new MenuDescription();
                return  tab2;
            case 2:
                MenuInfo tab3 = new MenuInfo();
                return  tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
