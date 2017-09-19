package com.android.ciblearning.thingstodo.adapters;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.ciblearning.thingstodo.R;
import com.android.ciblearning.thingstodo.model.PlaceItems;

import java.util.List;

/**
 * Created by sihlemabaleka on 9/19/17.
 */

public class MyPlaceHorizontalRecyclerViewAdapter extends RecyclerView.Adapter<MyPlaceHorizontalRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceItems> mValues;


    //This is the constructor
    public MyPlaceHorizontalRecyclerViewAdapter(List<PlaceItems> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_place_horizontal_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTitle.setText(mValues.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitle;
        public final ImageView mPlacePicture;
        public final TextView mShortDescription;
        public final FloatingActionButton mLocation;
        public final TextView mPricing;
        public final TextView mRating;
        public PlaceItems mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitle = (TextView) view.findViewById(R.id.title);
            mPlacePicture = (ImageView) view.findViewById(R.id.place_image);
            mShortDescription = (TextView) view.findViewById(R.id.description);
            mLocation = (FloatingActionButton) view.findViewById(R.id.location);
            mPricing = (TextView) view.findViewById(R.id.price);
            mRating = (TextView) view.findViewById(R.id.rating);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTitle.getText().toString() + "'";
        }
    }
}
