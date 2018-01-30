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

public class ItemRecommendedLanguageViewHolder extends RecyclerView.ViewHolder {

    private SearchDelegate mSearchDelegate;

    public ItemRecommendedLanguageViewHolder(View itemView,SearchDelegate searchDelegate) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mSearchDelegate=searchDelegate;
    }

    @OnClick(R.id.tv_recommended_language)
    public void onTapRecommendedLanguage(View view){
          /* Toast.makeText(view.getContext(),"Item Clicked", Toast.LENGTH_SHORT).show();*/
          mSearchDelegate.onTapLanguageItems();
    }
}
