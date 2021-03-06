package com.mayhsupaing.myapplication.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.delegates.SearchDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class ItemRecommendedTopicsViewHolder extends RecyclerView.ViewHolder {


    private SearchDelegate mSearchDelegate;

    public ItemRecommendedTopicsViewHolder(View itemView, SearchDelegate searchDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mSearchDelegate=searchDelegate;
    }

    @OnClick(R.id.tv_recommended_topics)
    public void onTapRecommendedTopics(View view){
       /* Toast.makeText(view.getContext(),"Item Clicked",Toast.LENGTH_SHORT).show();*/
        mSearchDelegate.onTapTopicItems();
    }
}
