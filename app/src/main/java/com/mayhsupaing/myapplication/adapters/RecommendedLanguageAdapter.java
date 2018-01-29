package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.viewholders.ItemRecommendedLanguageViewHolder;
import com.mayhsupaing.myapplication.viewholders.ItemRecommendedSpeakerViewHolder;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class RecommendedLanguageAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View recommendedLanguage=inflater.inflate(R.layout.item_recommended_lanuguage,parent,false);
        ItemRecommendedLanguageViewHolder itemRecommendedLanguageViewHolder=new ItemRecommendedLanguageViewHolder(recommendedLanguage);
        return itemRecommendedLanguageViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
