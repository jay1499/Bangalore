package com.example.and.bangalore;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.and.bangalore.R;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter}
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new com.example.and.bangalore.HistoryFragment();
        } else if (position == 1) {
            return new com.example.and.bangalore.SceneryFragment();
        } else if (position == 2) {
            return new com.example.and.bangalore.RestaurantFragment();
        } else if (position == 3) {
            return new TemplesFragment();
        } else {
            return new com.example.and.bangalore.NightlifeFragment();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.history);
        } else if (position == 1) {
            return mContext.getString(R.string.scenery);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 3) {
            return mContext.getString(R.string.temple);
        } else
            return mContext.getString(R.string.nightlife);
    }
}

