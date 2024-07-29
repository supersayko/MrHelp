package com.example.ngoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<GetData> list;

    public MyAdapter(Context context, ArrayList<GetData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.data_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        GetData data = list.get(position);
        holder.name.setText(data.getBkName());
        holder.categ.setText(data.getCateg());
        holder.loc.setText(data.getpLoc());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView name, categ, loc, name1, categ1, loc1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameTextView);
            categ = itemView.findViewById(R.id.textViewDonate);
            loc = itemView.findViewById(R.id.textViewLoc);
        }
    }
}
