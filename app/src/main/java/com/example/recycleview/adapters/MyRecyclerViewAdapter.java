package com.example.recycleview.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;

import com.example.recycleview.R;
import com.example.recycleview.model.NicePlace;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<String> mData;

    private List<NicePlace> mNicePlaces = new ArrayList<>();
    private Context mContext;

    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
   // public MyRecyclerViewAdapter(Context context, List<String> data) {

    public MyRecyclerViewAdapter(Context context, List<NicePlace> nicePlaces) {
        this.mInflater = LayoutInflater.from(context);
       // this.mData = data;

        mNicePlaces = nicePlaces;
        mContext = context;

    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       // String animal = mData.get(position);
      //  holder.myTextView.setText(animal);

        holder.myTextView.setText(mNicePlaces.get(position).getTitle());


        String imageUrl = mNicePlaces.get(position).getImageUrl();

        //Loading image using Picasso
        Picasso.get().load(imageUrl).into(holder.profilImage);


    }

    // total number of rows
    @Override
    public int getItemCount() {
       // return  mData.size();
        return mNicePlaces.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;

        ImageView profilImage;

        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.tvAnimalName);
            itemView.setOnClickListener(this);

            profilImage = itemView.findViewById(R.id.profile_image);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    public String getItem(int id) {

        return mNicePlaces.get(id).getTitle();
       // return String.valueOf(mNicePlaces.get(id));

       // return mData.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


}
