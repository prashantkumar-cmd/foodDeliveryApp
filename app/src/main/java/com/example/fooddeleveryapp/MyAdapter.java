package com.example.fooddeleveryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public String[] data;
    public MyAdapter(String[] data){
        this.data=data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.home_list_item,parent,false);
        return new MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String title=data[position];
        holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView textView;
        public MyViewHolder(View item){
            super(item);

            img=item.findViewById(R.id.img);
            textView=item.findViewById(R.id.text1);
        }
    }
}
