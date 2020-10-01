package com.umair.viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.VHolder> {
    List<Model> models;
    public PagerAdapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_items,parent,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder holder, int position) {
        holder.textView1.setText(models.get(position).getName());
        holder.textView2.setText(models.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class VHolder extends RecyclerView.ViewHolder
    {
        TextView textView1;
        TextView textView2;
        public VHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

}
