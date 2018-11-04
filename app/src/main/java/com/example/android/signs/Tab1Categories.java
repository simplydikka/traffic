package com.example.android.signs;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;

public class Tab1Categories extends Fragment {
    private static final String TAG = "Tab1Categories";

    private ImageView mCardImageA;
    private TextView mCardTitleA;
    private TextView mCardDescriptionA;

    private ImageView mCardImageB;
    private TextView mCardTitleB;
    private TextView mCardDescriptionB;

    private ImageView mCardImageV;
    private TextView mCardTitleV;
    private TextView mCardDescriptionV;

    private ImageView mCardImageG;
    private TextView mCardTitleG;
    private TextView mCardDescriptionG;

    private ImageView mCardImageD;
    private TextView mCardTitleD;
    private TextView mCardDescriptionD;

    private ImageView mCardImageE;
    private TextView mCardTitleE;
    private TextView mCardDescriptionE;

    private ImageView mCardImageJ;
    private TextView mCardTitleJ;
    private TextView mCardDescriptionJ;

    private ImageView mCardImageT;
    private TextView mCardTitleT;
    private TextView mCardDescriptionT;

    private ImageView mCardImageO;
    private TextView mCardTitleO;
    private TextView mCardDescriptionO;

    private ImageView mCardImageR;
    private TextView mCardTitleR;
    private TextView mCardDescriptionR;

    private CardView mCardGroupA;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflates the xml fragment
        View view = inflater.inflate(R.layout.tab1_categories, container, false);

        //declare the clickable card
        mCardGroupA = (CardView) view.findViewById(R.id.card_group_a);

        //declare the image, title and description in onCreate
        mCardDescriptionA = (TextView) view.findViewById(R.id.cardDescriptionA);
        mCardDescriptionB = (TextView) view.findViewById(R.id.cardDescriptionB);
        mCardDescriptionV = (TextView) view.findViewById(R.id.cardDescriptionV);
        mCardDescriptionG = (TextView) view.findViewById(R.id.cardDescriptionG);
        mCardDescriptionD = (TextView) view.findViewById(R.id.cardDescriptionD);
        mCardDescriptionE = (TextView) view.findViewById(R.id.cardDescriptionE);
        mCardDescriptionJ = (TextView) view.findViewById(R.id.cardDescriptionJ);
        mCardDescriptionT = (TextView) view.findViewById(R.id.cardDescriptionT);
        mCardDescriptionO = (TextView) view.findViewById(R.id.cardDescriptionO);
        mCardDescriptionR = (TextView) view.findViewById(R.id.cardDescriptionR);


        mCardTitleA = (TextView) view.findViewById(R.id.cardTitleA);
        mCardTitleB = (TextView) view.findViewById(R.id.cardTitleB);
        mCardTitleV = (TextView) view.findViewById(R.id.cardTitleV);
        mCardTitleG = (TextView) view.findViewById(R.id.cardTitleG);
        mCardTitleD = (TextView) view.findViewById(R.id.cardTitleD);
        mCardTitleE = (TextView) view.findViewById(R.id.cardTitleE);
        mCardTitleJ = (TextView) view.findViewById(R.id.cardTitleJ);
        mCardTitleT = (TextView) view.findViewById(R.id.cardTitleT);
        mCardTitleO = (TextView) view.findViewById(R.id.cardTitleO);
        mCardTitleR = (TextView) view.findViewById(R.id.cardTitleR);


        mCardImageA = (ImageView) view.findViewById(R.id.cardImageA);
        mCardImageB = (ImageView) view.findViewById(R.id.cardImageB);
        mCardImageV = (ImageView) view.findViewById(R.id.cardImageV);
        mCardImageG = (ImageView) view.findViewById(R.id.cardImageG);
        mCardImageD = (ImageView) view.findViewById(R.id.cardImageD);
        mCardImageE = (ImageView) view.findViewById(R.id.cardImageE);
        mCardImageJ = (ImageView) view.findViewById(R.id.cardImageJ);
        mCardImageT = (ImageView) view.findViewById(R.id.cardImageT);
        mCardImageO = (ImageView) view.findViewById(R.id.cardImageO);
        mCardImageR = (ImageView) view.findViewById(R.id.cardImageR);


        Resources resources = getResources();
        mCardImageA.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageB.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageV.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageG.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageD.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageE.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageJ.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageT.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageO.setImageDrawable(resources.getDrawable(R.drawable.icon));
        mCardImageR.setImageDrawable(resources.getDrawable(R.drawable.icon));


        //A: set the title to the text view
        mCardTitleA.setText(getString(R.string.grupa_a_title));
        mCardTitleB.setText(getString(R.string.grupa_b_title));
        mCardTitleV.setText(getString(R.string.grupa_v_title));
        mCardTitleG.setText(getString(R.string.grupa_g_title));
        mCardTitleD.setText(getString(R.string.grupa_d_title));
        mCardTitleE.setText(getString(R.string.grupa_e_title));
        mCardTitleJ.setText(getString(R.string.grupa_j_title));
        mCardTitleT.setText(getString(R.string.grupa_t_title));
        mCardTitleO.setText(getString(R.string.grupa_o_title));
        mCardTitleR.setText(getString(R.string.grupa_r_title));


        //A: set the description to the text view
        mCardDescriptionA.setText(getString(R.string.grupa_a_description));
        mCardDescriptionB.setText(getString(R.string.grupa_b_description));
        mCardDescriptionV.setText(getString(R.string.grupa_v_description));
        mCardDescriptionG.setText(getString(R.string.grupa_g_description));
        mCardDescriptionD.setText(getString(R.string.grupa_d_description));
        mCardDescriptionE.setText(getString(R.string.grupa_e_description));
        mCardDescriptionJ.setText(getString(R.string.grupa_j_description));
        mCardDescriptionT.setText(getString(R.string.grupa_t_description));
        mCardDescriptionO.setText(getString(R.string.grupa_o_description));
        mCardDescriptionR.setText(getString(R.string.grupa_r_description));

        //set onClick event for the card to lead to second activity

        mCardGroupA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Прехвърляне в Група А", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), GroupA.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
