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
import com.example.pc_1.akb.MenuEmail;
import com.example.pc_1.akb.MenuInfo;
import com.example.pc_1.akb.MenuProfil;
import com.example.pc_1.akb.MenuSocmed;
import com.example.pc_1.akb.MenuTelp;

public class ContactAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public ContactAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }



    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                MenuTelp tab1 = new MenuTelp();
                return tab1;
            case 1:
                MenuEmail tab2 = new MenuEmail();
                return  tab2;
            case 2:
                MenuSocmed tab3 = new MenuSocmed();
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