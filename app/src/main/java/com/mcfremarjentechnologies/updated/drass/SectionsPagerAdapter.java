package com.mcfremarjentechnologies.updated.drass;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Updated on 18/05/2018.
 */

class SectionsPagerAdapter  extends FragmentPagerAdapter{
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                HomeFrag homeFrag = new HomeFrag();
                return homeFrag;
            case 1:
                ArticalFrag articalFrag = new ArticalFrag();
                return articalFrag;
            case 2:
                My_doctFrag myDoctFrag =new My_doctFrag();
                return myDoctFrag;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "HOME";
            case 1:
                return "ACTIVITIES";
            case 2:
                return "MY DOCTOR";
            default:
                return null;


        }
    }
}
