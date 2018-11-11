package com.example.android.signs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;

import java.util.ArrayList;

public class AllGroupASignsList extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;


    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_group_a_signs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Знаци от Група А");

        createExampleList();
        buildRecyclerView();
    }

    public void createExampleList() {

//        mExampleList = new ArrayList<>();
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A1_title), getString(R.string.A1_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A2_title), getString(R.string.A2_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A3_title), getString(R.string.A3_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A4_title), getString(R.string.A4_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A5_title), getString(R.string.A5_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A6_title), getString(R.string.A6_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A7_title), getString(R.string.A7_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A8_title), getString(R.string.A8_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A9_title), getString(R.string.A9_description)));
//        mExampleList.add(new ExampleItem(R.drawable.imageplaceholder, getString(R.string.A10_title), getString(R.string.A10_description)));

        mExampleList = DataCollection.getData(this);
    }

    public void buildRecyclerView() {

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

//        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//            Intent intent = new Intent(AllGroupASignsList.this, SingleCardGroupA.class);
//            intent.putExtra("Example Item", mExampleList.get(position));
//            startActivity(intent);
//            }
//        });

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(AllGroupASignsList.this, SingleCardGroupA.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_group_a_signs, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

       searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String s) {
               return false;
           }

           @Override
           public boolean onQueryTextChange(String newText) {
               mAdapter.getFilter().filter(newText);
               return false;
           }
       });
        return true;

    }
}