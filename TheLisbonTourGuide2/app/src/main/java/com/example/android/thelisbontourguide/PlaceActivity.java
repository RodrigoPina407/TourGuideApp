package com.example.android.thelisbontourguide;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rodrigo on 29/05/2017.
 */

public class PlaceActivity extends AppCompatActivity {

    private String mName;
    private String mAddress;
    private String mAdditionalInfo;
    int mImageResourceId;


    public PlaceActivity(String name, String address, int imageResourceId) {

        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
        mAdditionalInfo = "";


    }

    public PlaceActivity(String name, String address, String additionalInfo, int imageResourceId ) {

        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
        mAdditionalInfo = additionalInfo;


    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getAdditionalInfo() {
        return mAdditionalInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {

        String string = " " + mName + "\n " + mAddress + "\n " + mAdditionalInfo;

        return string;
    }
}