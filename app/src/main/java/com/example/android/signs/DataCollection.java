package com.example.android.signs;

import android.content.Context;

import java.util.ArrayList;

public class DataCollection {
    public static ArrayList<ExampleItem> getData(Context context){
        ArrayList<ExampleItem> mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A1_title), context.getString(R.string.A1_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A2_title), context.getString(R.string.A2_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A3_title), context.getString(R.string.A3_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A4_title), context.getString(R.string.A4_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A5_title), context.getString(R.string.A5_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A6_title), context.getString(R.string.A6_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A7_title), context.getString(R.string.A7_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A8_title), context.getString(R.string.A8_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A9_title), context.getString(R.string.A9_description)));
        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, context.getString(R.string.A10_title), context.getString(R.string.A10_description)));

        return mExampleList;

    }
}
