package com.example.android.signs;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

public class ExampleItem implements Parcelable {
    private int mImageResource;
    private String mTextTitle;
    private String mTextDescription;

    public ExampleItem(int imageResource, String textTitle, String textDescription) {
        mImageResource = imageResource;
        mTextTitle = textTitle;
        mTextDescription = textDescription;
    }


    protected ExampleItem(Parcel in) {
        mImageResource = in.readInt();
        mTextTitle = in.readString();
        mTextDescription = in.readString();
    }

    public static final Creator<ExampleItem> CREATOR = new Creator<ExampleItem>() {
        @Override
        public ExampleItem createFromParcel(Parcel in) {
            return new ExampleItem(in);
        }

        @Override
        public ExampleItem[] newArray(int size) {
            return new ExampleItem[size];
        }
    };

    public int getImageResource() {
        return mImageResource;
    }

    public String getTextTitle() {
        return mTextTitle;
    }

    public String getmTextDescription() {
        return mTextDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mTextTitle);
        dest.writeString(mTextDescription);

    }
}
