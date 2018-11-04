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

public class GroupA extends AppCompatActivity {

    private static final String TAG = "GroupA";

    private ImageView mCardImage;
    private TextView mCardTitle;
    private TextView mCardDescription;
    boolean isEnable = false;
    private ImageButton ButtonStar;
    private Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_a);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Знаци от Група А");


        //declare the image, title and description in onCreate
        mCardDescription = (TextView) findViewById(R.id.cardDescription);
        mCardTitle = (TextView) findViewById(R.id.cardTitle);
        mCardImage = (ImageView) findViewById(R.id.cardImage);
        ButtonStar = (ImageButton) findViewById(R.id.heart);
        btnOpen = (Button) findViewById(R.id.btnOpen);

        //creates and image resource and sets it to the ImageView
        int imageResource = getResources().getIdentifier("@drawable/icon", null, this.getPackageName());
        mCardImage.setImageResource(imageResource);

        //set the title to the text view
        mCardTitle.setText("В1: Забранено е влизането на пътни превозни средства");

        //set the description to the text view
        mCardDescription.setText(getString(R.string.grupa_a_description));

        //creates and image resource and sets it to the ImageButton
        int imageButton = getResources().getIdentifier("@drawable/heartoff", null, this.getPackageName());
        ButtonStar.setImageResource(imageButton);
        ButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEnable){
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.heartoff));
                }else{
                    ButtonStar.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.hearton));
                }
                isEnable = !isEnable;
            }
        });

        //onClickListenet for the button, showing a toast message
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GroupA.this, GroupASigns.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}