package com.example.android.signs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleCardGroupA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card_groupa);


        Intent intent = getIntent();
        ExampleItem exampleItem = intent.getParcelableExtra("Example Item");

        int imageRes = exampleItem.getImageResource();
        String line1 = exampleItem.getTextTitle();
        String line2 = exampleItem.getmTextDescription();

        ImageView imageView = findViewById(R.id.image_activity2);
        imageView.setImageResource(imageRes);

        TextView textView1 = findViewById(R.id.text1_activity2);
        textView1.setText(line1);

        TextView textView2 = findViewById(R.id.text2_activity2);
        textView2.setText(line2);


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
