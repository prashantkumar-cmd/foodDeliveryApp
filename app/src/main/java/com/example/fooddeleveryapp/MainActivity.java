package com.example.fooddeleveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView myList=findViewById(R.id.lists);
        myList.setLayoutManager(new LinearLayoutManager(this));
        String contacts[]={"Funbuzz","Subway","Domnic's pizza","Biryani","KFC","XBurgers"};
        myList.setAdapter(new MyAdapter(contacts));
    }
}