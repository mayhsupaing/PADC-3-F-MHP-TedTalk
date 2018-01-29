package com.mayhsupaing.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.viewholders.ItemTalkViewHolder;

import java.util.zip.Inflater;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class TalkAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View talk=inflater.inflate(R.layout.item_talk,parent,false);
        ItemTalkViewHolder itemTalkViewHolder=new ItemTalkViewHolder(talk);
        return itemTalkViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
