package com.example.asus.review.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.review.R;

import java.util.List;

/**
 * Created by asus on 2017/9/10.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewholder>{  //@csk     don't  know why use a costume viewholder

    private String[] string;

    static class viewholder extends RecyclerView.ViewHolder{ //@csk don't know why use static
         TextView text;

        public viewholder(View itemView) {
            super(itemView);
            this.text = (TextView) itemView.findViewById(R.id.string_item);
        }
    }

    public RecyclerAdapter(String[] string) {
        this.string = string;
    }


    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())     //@csk     don't know how to get view
                .inflate(R.layout.recyclerview, parent ,false);
        viewholder viewholder = new viewholder(view);
        return viewholder;
    }


    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        holder.text.setText(string[position]);

    }


    @Override
    public int getItemCount() {
        return string.length;
    }
}
