package com.example.android.thelisbontourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class TourPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<PlaceActivity> mPlaces;

    public TourPagerAdapter(FragmentManager fm, Context context, ArrayList<PlaceActivity> places){

        super(fm);
        mPlaces = places;

    }

    @Override
    public Fragment getItem(int position) {

        // instantiates a fragment of type PlacesFragment
        PlacesFragment fragment = new PlacesFragment();

        //Calls PlacesFragment public method setPlace() to pass the ArrayList<PlacesActivity> mPlaces to the fragment
            fragment.setPlace(mPlaces.get(position));
            return fragment;

    }


    @Override
    public int getCount() {
        return mPlaces.size();
    }
}
