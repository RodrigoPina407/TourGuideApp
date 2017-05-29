package com.example.android.thelisbontourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    private ImageView image;
    private PlaceActivity mPlace;
    private ListView list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        //Saves the instance so it retains the state of the app
        setRetainInstance(true);

        image = (ImageView) rootView.findViewById(R.id.frag_image);
        list = (ListView) rootView.findViewById(R.id.frag_list);

        image.setImageResource(mPlace.getImageResourceId());

        //Creates an ArrayList of Type String to store the text information of a place
        ArrayList<String> items = new ArrayList<>();

        items.add(mPlace.getName());
        items.add(mPlace.getAddress());
        items.add(mPlace.getAdditionalInfo());

        //Custom ArrayListAdapter to display the text information of a place in a ListView
        TourArrayListAdapter adapter = new TourArrayListAdapter(getActivity(), items);

        list.setAdapter(adapter);

        return rootView;
    }

    public void setPlace(PlaceActivity place){
        mPlace = place;
    }


}
