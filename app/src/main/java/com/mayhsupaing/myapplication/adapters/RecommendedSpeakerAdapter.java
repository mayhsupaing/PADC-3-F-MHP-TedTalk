package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.delegates.SearchDelegate;
import com.mayhsupaing.myapplication.viewholders.ItemRecommendedSpeakerViewHolder;

import java.util.zip.Inflater;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class RecommendedSpeakerAdapter extends RecyclerView.Adapter {

    private SearchDelegate mSearchDelegage;

    public RecommendedSpeakerAdapter(SearchDelegate searchDelegate) {
        mSearchDelegage=searchDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View recommendedSpeaker=inflater.inflate(R.layout.item_recommended_speaker,parent,false);
        ItemRecommendedSpeakerViewHolder itemRecommendedSpeakerViewHolder=new ItemRecommendedSpeakerViewHolder(recommendedSpeaker,mSearchDelegage);
        return itemRecommendedSpeakerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
