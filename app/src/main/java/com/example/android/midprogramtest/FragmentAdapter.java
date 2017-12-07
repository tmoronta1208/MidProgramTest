package com.example.android.midprogramtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by TatianaM on 12/6/17.
 */

public class FragmentAdapter extends RecyclerView.Adapter {

    private List<FirstFragment> frag;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);


        return RecyclerView.ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return frag.size();
    }
}
