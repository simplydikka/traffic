package com.example.android.signs;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleCardGroupA extends AppCompatActivity {

    Button next;
    Button previous;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card_groupa);

        Intent intent = getIntent();

        final int position = intent.getIntExtra("position", 0);


//        ExampleItem exampleItem = intent.getParcelableExtra("Example Item");
        ExampleItem exampleItem = DataCollection
                                    .getData(this)
                                    .get(position);

        int imageRes = exampleItem.getImageResource();
        String line1 = exampleItem.getTextTitle();
        String line2 = exampleItem.getmTextDescription();

        ImageView imageView = findViewById(R.id.image_activity2);
        imageView.setImageResource(imageRes);

        TextView textView1 = findViewById(R.id.text1_activity2);
        textView1.setText(line1);

        TextView textView2 = findViewById(R.id.text2_activity2);
        textView2.setText(line2);

        Button next = (Button) findViewById(R.id.next);
        Button previous = (Button) findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleCardGroupA.this, SingleCardGroupA.class);
                intent.putExtra("position", position+1);
                startActivity(intent);
                finish();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingleCardGroupA.this, SingleCardGroupA.class);
                intent.putExtra("position", position-1);
                startActivity(intent);
                finish();
            }
        });
    }


}
