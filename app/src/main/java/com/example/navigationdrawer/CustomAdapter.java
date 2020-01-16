package com.example.navigationdrawer;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private Context context;
    private ArrayList<HackSmileModel> items;
    public CustomAdapter(Context context, ArrayList<HackSmileModel> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.monuments, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.itemTitle.setText(items.get(position).getTitle());
        holder.itemImage.setImageResource(items.get(position).getImage());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemTitle;
        public CustomViewHolder(View view) {
            super(view);
            itemImage = view.findViewById(R.id.item_image);
            itemTitle = view.findViewById(R.id.item_title);
        }
    }
}

