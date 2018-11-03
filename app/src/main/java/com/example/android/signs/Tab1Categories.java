package com.example.android.signs;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Tab1Categories extends Fragment {
    private static final String TAG = "Tab1Categories";

    private ImageView mCardImage;
    private TextView mCardTitle;
    private TextView mCardDescription;


    private ImageView mCardImage2;
    private TextView mCardTitle2;
    private TextView mCardDescription2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflates the xml fragment
        View view = inflater.inflate(R.layout.tab1_categories,container,false);

        //declare the image, title and description in onCreate
        mCardDescription = (TextView) view.findViewById(R.id.cardDescription);
        mCardTitle = (TextView) view.findViewById(R.id.cardTitle);
        mCardImage = (ImageView) view.findViewById(R.id.cardImage);

        Resources resources = getResources();
        mCardImage.setImageDrawable(resources.getDrawable(R.drawable.icon));

        //set the title to the text view
        mCardTitle.setText("Група Б");

        //set the description to the text view
        mCardDescription.setText("Пътни знаци относно предимство");


        return view;
    }
}
