package com.example.sql_testexperiment;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder> {

    private Context mContext;
    private Cursor mCursor;

    public GroceryAdapter(Context context, Cursor cursor){
        mContext=context;
        mCursor=cursor;

    }


    public class GroceryViewHolder extends RecyclerView.ViewHolder{
        public TextView nameText;
        public TextView countText;

        public GroceryViewHolder(View itemView){
            super(itemView);

            nameText = itemView.findViewById(R.id.textview_name_item);
            countText = itemView.findViewById(R.id.textview_amount_item);
        }
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder groceryViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }



}
