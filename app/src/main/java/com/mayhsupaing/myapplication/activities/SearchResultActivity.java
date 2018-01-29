package com.mayhsupaing.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.adapters.SearchResultAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class SearchResultActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv_search_result)
    RecyclerView rvSearchResult;

    private SearchResultAdapter mSearchResultAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(R.string.search_result_title);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mSearchResultAdapter=new SearchResultAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,false);
        rvSearchResult.setLayoutManager(linearLayoutManager);
        rvSearchResult.setAdapter(mSearchResultAdapter);


    }
}
