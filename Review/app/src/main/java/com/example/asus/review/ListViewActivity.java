package com.example.asus.review;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.asus.review.R;

public class ListViewActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter<String> mAdapter;
    private String[] data = {"C" , "C++" , "Java" , "Python" , "PHP" , "Kotlin" , "Go" ,
    "Basic" , "Sql" , "HTML" , "JavaScript" , "Swift"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mListView = (ListView) findViewById(R.id.list);
        mAdapter = new ArrayAdapter<String>(ListViewActivity.this ,
                android.R.layout.simple_list_item_1 , data);    //@csk    forget how to create a adapter
        mListView.setAdapter(mAdapter);
    }
}
