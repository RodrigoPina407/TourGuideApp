package com.example.android.thelisbontourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.thelisbontourguide.R.id.pager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // Array List of type PlacesActivity that stores the information about each place
        ArrayList<PlaceActivity> places = new ArrayList<>();

        places.add(new PlaceActivity(getString(R.string.padrao_title), getString(R.string.padrao_address), getString(R.string.padrao_description), R.drawable.padrao));
        places.add(new PlaceActivity(getString(R.string.panteao_title), getString(R.string.panteao_address), getString(R.string.panteao_description), R.drawable.panteao));
        places.add(new PlaceActivity(getString(R.string.maat_title), getString(R.string.maat_address), getString(R.string.maat_description), R.drawable.maat));
        places.add(new PlaceActivity(getString(R.string.paco_title), getString(R.string.paco_street), getString(R.string.paco_description), R.drawable.terreiro_do_paco));
        ViewPager pager = (ViewPager) findViewById(R.id.pager);

        //Custom pager adapater to display the places ArrayList
        TourPagerAdapter adapter = new TourPagerAdapter(getSupportFragmentManager(), this , places);

        pager.setAdapter(adapter);


    }
}
