package com.example.homework14.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework14.R;

import java.nio.file.attribute.FileTime;
import java.util.ArrayList;

public class AdapterBook extends RecyclerView.Adapter<AdapterBook.HolderBook> {
    ArrayList<String> list;


    @NonNull
    @Override
    public HolderBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder_book, parent, false);
        return new HolderBook(view);
    }

    public AdapterBook(ArrayList<String> list){
        this.list = list;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBook holder, int position) {
        holder.onbind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderBook extends RecyclerView.ViewHolder {
        TextView tvNameBook;
        public HolderBook(@NonNull View itemView) {
            super(itemView);
            tvNameBook = itemView.findViewById(R.id.tv_name_book);
        }

        public void onbind(String s) {
            tvNameBook.setText(s);
        }
    }
}
