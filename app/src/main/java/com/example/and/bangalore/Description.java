package com.example.and.bangalore;

public class Description {
    private int mheading;
    private int mdescription;
    /**
     * Image resource ID for the the catgeory
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Description(int imageResourceId, int heading, int description) {
        mImageResourceId = imageResourceId;
        mheading = heading;
        mdescription = description;

    }

    public int getheading() {
        return mheading;
    }

    public int getdescription() {
        return mdescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}