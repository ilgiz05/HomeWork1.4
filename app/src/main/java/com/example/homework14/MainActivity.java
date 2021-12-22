package com.example.homework14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homework14.adapter.AdapterBook;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList<String> list =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }
    private void initialization(){
        recyclerView = findViewById( R.id.recycler_view);
        adapterBook = new AdapterBook(list);
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        list.add("Book");
        recyclerView.setAdapter(adapterBook);

    }
}