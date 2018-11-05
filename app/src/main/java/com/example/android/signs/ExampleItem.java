package com.example.android.signs;

import android.view.View;
import android.widget.Toast;

public class ExampleItem {
    private int mImageResource;
    private String mTextTitle;
    private String mTextDescription;

    public ExampleItem(int imageResource, String textTitle, String textDescription) {
        mImageResource = imageResource;
        mTextDescription = textDescription;
        mTextTitle = textTitle;
    }


    public int getImageResource(){
        return mImageResource;
    }
     public String getTextTitle() {
        return mTextTitle;
     }

     public String getmTextDescription(){
         return mTextDescription;
     }

}
