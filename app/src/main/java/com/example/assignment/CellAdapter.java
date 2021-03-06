package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CellAdapter extends RecyclerView.Adapter<CellAdapter.CellViewHolder>{

    private Context context;
    private ArrayList<Cell>  cellObj;

    public CellAdapter(Context context, ArrayList<Cell> cellObj) {
        this.context = context;
        this.cellObj = cellObj;
    }

    @NonNull
    @Override
    public CellAdapter.CellViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(context).inflate(R.layout.layout_cell, parent, false);
        return new CellViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull CellAdapter.CellViewHolder holder, int position) {

        Cell currentItem = cellObj.get(position);
        String imageUrl = currentItem.getImageUrl();
        String creatorName = currentItem.getImageName();

        holder.mTextViewCreator.setText(creatorName);
       Picasso.get().load(imageUrl).fit().centerInside().into(holder.mImageView);


    }

    @Override
    public int getItemCount() {
        return cellObj.size();
    }


    public class CellViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextViewCreator;
        public CellViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_view);
            mTextViewCreator = itemView.findViewById(R.id.text_view_imageName);
        }
    }

}
