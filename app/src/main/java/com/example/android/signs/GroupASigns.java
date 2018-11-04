package com.example.android.signs;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GroupASigns extends AppCompatActivity {

    private static final String TAG = "GroupA";

    private ImageView mCardImage;
    private TextView mCardTitle;
    private TextView mCardDescription;
    boolean isEnable = false;
    private Button btnOpen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_a_signs);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Знаци от Група LLLL");


        //declare the image, title and description in onCreate
        mCardDescription = (TextView) findViewById(R.id.cardDescription2);
        mCardTitle = (TextView) findViewById(R.id.cardTitle2);
        mCardImage = (ImageView) findViewById(R.id.cardImage2);
        btnOpen2 = (Button) findViewById(R.id.btnOpen2);

        //creates and image resource and sets it to the ImageView
        int imageResource = getResources().getIdentifier("@drawable/icon", null, this.getPackageName());
        mCardImage.setImageResource(imageResource);

        //set the title to the text view
        mCardTitle.setText("В1333: Забранено е влизането на пътни превозни средства");

        //set the description to the text view
        mCardDescription.setText(getString(R.string.grupa_a_description));


//onClickListenet for the button, showing a toast message
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}