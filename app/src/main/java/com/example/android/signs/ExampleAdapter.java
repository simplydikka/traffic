package com.example.android.signs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<ExampleItem> mExampleList;


    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextTitle;
        public TextView mTextDescription;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageSign);
            mTextTitle = itemView.findViewById(R.id.signName);
            mTextDescription = itemView.findViewById(R.id.signDescription);


        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;
    }
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent, false);
            ExampleViewHolder evh = new ExampleViewHolder(v);
            return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
            ExampleItem currentItem = mExampleList.get(position);
            holder.mImageView.setImageResource(currentItem.getImageResource());
            holder.mTextTitle.setText(currentItem.getTextTitle());
            holder.mTextDescription.setText(currentItem.getmTextDescription());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
