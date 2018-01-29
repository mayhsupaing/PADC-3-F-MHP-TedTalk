package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.viewholders.ItemRecommendedEventViewHolder;
import com.mayhsupaing.myapplication.viewholders.ItemRecommendedLanguageViewHolder;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class RecommendedEventAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View recommendedEvent=inflater.inflate(R.layout.item_recommended_events,parent,false);
        ItemRecommendedEventViewHolder itemRecommendedEventViewHolder=new ItemRecommendedEventViewHolder(recommendedEvent);
        return itemRecommendedEventViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
