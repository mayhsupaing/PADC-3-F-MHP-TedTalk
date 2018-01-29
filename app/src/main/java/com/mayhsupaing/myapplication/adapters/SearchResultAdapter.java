package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.viewholders.ItemSearchResultViewHolder;
import com.mayhsupaing.myapplication.viewholders.ItemTalkViewHolder;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class SearchResultAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View searchResult=inflater.inflate(R.layout.item_search_result,parent,false);
        ItemSearchResultViewHolder itemSearchResultViewHolder=new ItemSearchResultViewHolder(searchResult);
        return itemSearchResultViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
