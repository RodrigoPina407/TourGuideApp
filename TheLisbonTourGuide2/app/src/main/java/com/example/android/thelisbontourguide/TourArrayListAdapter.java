package com.example.android.thelisbontourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Custom ArrayListAdapter to display text on a list item
 */

public class TourArrayListAdapter extends ArrayAdapter<String> {

    public TourArrayListAdapter(Context context, ArrayList<String> items) {

        super(context, 0, items);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        String currentItem = getItem(position);

        TextView text = (TextView) listItemView.findViewById(R.id.list_text);

        text.setText(currentItem);

        return listItemView;
    }
}
