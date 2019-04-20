package com.example.mylev2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    ArrayList<Item> dataList;

    public ItemAdapter(ArrayList<Item> dataList) {
        this.dataList = dataList;
    }

    public  ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, final int position) {
        holder.Nama.setText(dataList.get(position).getProduk());
        holder.Penjual.setText(dataList.get(position).getPenjual());
        holder.imageView.setImageResource(dataList.get(position).getImg());
        holder.Categories.setText(dataList.get(position).getTag());
        holder.Gender.setText(dataList.get(position).getGender());
        holder.CommentCount.setText(dataList.get(position).getComment());
        holder.ratingBar.setRating(dataList.get(position).getRating());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Class<?> destination = Class.forName(dataList.get(position).getIntentDestination());
                    Intent intent = new Intent(v.getContext(), destination);
                    v.getContext().startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView Nama, Penjual, Categories, Gender, CommentCount;
        private RatingBar ratingBar;
        ImageView imageView;

        public ItemViewHolder(View itemView) {
            super(itemView);

            Nama = itemView.findViewById(R.id.produk);
            Penjual = itemView.findViewById(R.id.penjual);
            Categories = itemView.findViewById(R.id.tag);
            Gender = itemView.findViewById(R.id.gender);
            CommentCount = itemView.findViewById(R.id.comment);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            imageView = itemView.findViewById(R.id.img);

        }
    }



}
