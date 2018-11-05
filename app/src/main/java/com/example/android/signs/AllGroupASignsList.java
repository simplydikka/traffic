package com.example.android.signs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class AllGroupASignsList extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_group_a_signs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Знаци от Група А");

        final ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А1 \"Опасен завой на дясно\"","Използва се за сигнализиране на:\n" +
                "- крива, в която не е осигурено разстоянието за видимост\n" +
                "- крива, в която е необходимо скоростта на "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А2 \"Опасен завой наляво\"","Използва се за сигнализиране на:\n" +
                "- крива, в която не е осигурено разстоянието за видимост\n" +
                "- крива, в която е "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А3 \"Последователни опасни завои, първият от които е надясно\"","Използва се за сигнализиране на пътни участъци, в които платното за движение се стеснява от двете страни, но броят на пътните ленти се "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А4 \"Последователни опасни завои, първият от които е наляво\"","Използва се за сигнализиране на пътни участъци, в които платното за движение се стеснява от двете страни, но броят на пътните ленти се "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А5 \"Стръмен наклон при спускане\"","Използва се за сигнализиране на:\n" +
                "- крива, в която не е осигурено разстоянието за видимост\n" +
                "- крива, в която е "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А6 \"Стръмен наклон при изкачване\"","Използва се за сигнализиране на две или повече последователни криви, всяка от които трябва да е сигнализирана, и "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А7 \"Платно за движение, стеснено от двете страни\"","Използва се за сигнализиране на две или повече последователни криви, всяка от които трябва да е сигнализирана, и "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А8 \"Платно за движение, стеснено отдясно\"","Използва се за сигнализиране на пътни участъци с надлъжен наклон, равен или по-голям от 7 на сто и с дължина над 50 m. При ограничена видимост наклонът се сигнализи"));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А9 \"Платно за движение, стеснено отляво\"","Използва се за сигнализиране на пътни участъци, в които платното за движение се стеснява от двете страни, но броят на пътните ленти се "));
        exampleList.add(new ExampleItem(R.drawable.imageplaceholder, "А10 \"Подвижен мост или ферибот\"","Използва се за сигнализиране на пътни участъци, в които платното за движение се стеснява от двете страни, но броят на пътните ленти се "));



        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}