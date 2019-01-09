package com.example.and.bangalore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_items, container, false);

        final ArrayList<com.example.and.bangalore.Description> descriptions = new ArrayList<com.example.and.bangalore.Description>();
        descriptions.add(new com.example.and.bangalore.Description(R.drawable.saffron, R.string.saffron, R.string.saffron1));
        descriptions.add(new com.example.and.bangalore.Description(R.drawable.bene, R.string.bene, R.string.bene1));
        descriptions.add(new com.example.and.bangalore.Description(R.drawable.raj_pavilion, R.string.saffron, R.string.saffron1));
        descriptions.add(new com.example.and.bangalore.Description(R.drawable.brahmin, R.string.brahmin, R.string.brahmin1));
        descriptions.add(new com.example.and.bangalore.Description(R.drawable.karavalli, R.string.karavalli, R.string.karavalli1));

        com.example.and.bangalore.DescriptionAdapter adapter = new com.example.and.bangalore.DescriptionAdapter(getActivity(), descriptions, R.color.primary_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}















