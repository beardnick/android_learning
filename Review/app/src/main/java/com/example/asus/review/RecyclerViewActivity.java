package com.example.asus.review;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.asus.review.adapter.RecyclerAdapter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private String[] data = {"C" , "C++" , "Java" , "Python" , "PHP" , "Kotlin" , "Go" ,
            "Basic" , "Sql" , "HTML" , "JavaScript" , "Swift"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(RecyclerViewActivity.this);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(new RecyclerAdapter(data));

    }
}
