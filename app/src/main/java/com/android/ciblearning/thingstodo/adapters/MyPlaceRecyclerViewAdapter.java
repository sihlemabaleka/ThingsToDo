package com.android.ciblearning.thingstodo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ciblearning.thingstodo.R;
import com.android.ciblearning.thingstodo.model.Place;

import java.util.List;

public class MyPlaceRecyclerViewAdapter extends RecyclerView.Adapter<MyPlaceRecyclerViewAdapter.ViewHolder> {

    private final List<Place> mValues;


    //This is the constructor
    public MyPlaceRecyclerViewAdapter(List<Place> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        //Set horizontal RecyclerView Section title
        holder.mIdView.setText(mValues.get(position).getTitle());

        //Instantiate horizontal Adapter
        MyPlaceHorizontalRecyclerViewAdapter adapter = new MyPlaceHorizontalRecyclerViewAdapter(mValues.get(position).getItems());


        //Set horizontal adapter to recyclerview item
        holder.mContentView.setAdapter(adapter);


    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final RecyclerView mContentView;
        public Place mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (RecyclerView) view.findViewById(R.id.item_list);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mIdView.getText().toString() + "'";
        }
    }
}
