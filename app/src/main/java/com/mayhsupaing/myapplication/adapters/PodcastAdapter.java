package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.viewholders.ItemPlaylistViewHolder;
import com.mayhsupaing.myapplication.viewholders.ItemPodcastViewHolder;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class PodcastAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View podcast=inflater.inflate(R.layout.item_podcast,parent,false);
        ItemPodcastViewHolder itemPodcastViewHolder=new ItemPodcastViewHolder(podcast);
        return itemPodcastViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
