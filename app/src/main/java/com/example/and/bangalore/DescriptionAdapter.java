
package com.example.and.bangalore;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and.bangalore.Description;
import com.example.and.bangalore.R;

import java.util.ArrayList;


public class DescriptionAdapter extends ArrayAdapter<Description> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public DescriptionAdapter(Context context, ArrayList<Description> desc, int colorResourceId) {
        super(context, 0, desc);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_items, parent, false);
        }

        Description currentdesc = getItem(position);

        TextView headingTextView = (TextView) listItemView.findViewById(R.id.title1);
        headingTextView.setText(currentdesc.getheading());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.content);
        descriptionTextView.setText(currentdesc.getdescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentdesc.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentdesc.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}