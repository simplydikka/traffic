package com.example.android.signs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> implements Filterable {

    private ArrayList<ExampleItem> mExampleList;
    private List<ExampleItem> mExampleListFull;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextTitle;
        public TextView mTextDescription;

        public ExampleViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageSign);
            mTextTitle = itemView.findViewById(R.id.signName);
            mTextDescription = itemView.findViewById(R.id.signDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);

                        }
                    }
                }
            });
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList){

        mExampleList = exampleList;
        mExampleListFull = new ArrayList<>(exampleList);
    }
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent, false);
            ExampleViewHolder evh = new ExampleViewHolder(v, mListener);
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


    public Filter getFilter(){
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ExampleItem> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0){
                filteredList.addAll(mExampleListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for(ExampleItem item : mExampleListFull){
                    if (item.getTextTitle().toLowerCase().contains(filterPattern) || item.getmTextDescription().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            mExampleList.clear();
            mExampleList.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };
}
