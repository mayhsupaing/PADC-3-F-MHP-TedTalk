package com.mayhsupaing.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.adapters.RecommendedEventAdapter;
import com.mayhsupaing.myapplication.adapters.RecommendedLanguageAdapter;
import com.mayhsupaing.myapplication.adapters.RecommendedSpeakerAdapter;
import com.mayhsupaing.myapplication.adapters.RecommendedTopicsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class SearchTedTalksActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv_recommended_topics)
    RecyclerView rvRecommendedTopics;

    @BindView(R.id.rv_recommended_speaker)
    RecyclerView rvRecommendedSpeaker;

    @BindView(R.id.rv_recommended_language)
    RecyclerView rvRecommendedLanguage;

    @BindView(R.id.rv_recommended_event)
    RecyclerView rvRecommendedEvent;

    private RecommendedTopicsAdapter mRecommendedTopicsAdapter;
    private RecommendedSpeakerAdapter mRecommendedSpeakerAdapter;
    private RecommendedLanguageAdapter mRecommendedLanguageAdapter;
    private RecommendedEventAdapter mRecommendedEventAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_ted_talks);
        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mRecommendedTopicsAdapter=new RecommendedTopicsAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,false);
        rvRecommendedTopics.setLayoutManager(linearLayoutManager);
        rvRecommendedTopics.setAdapter(mRecommendedTopicsAdapter);

        mRecommendedSpeakerAdapter=new RecommendedSpeakerAdapter();
        LinearLayoutManager speakerLinearLayoutManager=new LinearLayoutManager(getApplicationContext()
                ,LinearLayoutManager.VERTICAL,false);
        rvRecommendedSpeaker.setLayoutManager(speakerLinearLayoutManager);
        rvRecommendedSpeaker.setAdapter(mRecommendedSpeakerAdapter);

        mRecommendedLanguageAdapter=new RecommendedLanguageAdapter();
        LinearLayoutManager languageLinearLayout=new LinearLayoutManager(getApplicationContext()
                ,LinearLayoutManager.VERTICAL,false);
        rvRecommendedLanguage.setLayoutManager(languageLinearLayout);
        rvRecommendedLanguage.setAdapter(mRecommendedLanguageAdapter);

        mRecommendedEventAdapter=new RecommendedEventAdapter();
        LinearLayoutManager eventLinearLayout=new LinearLayoutManager(getApplicationContext()
                ,LinearLayoutManager.VERTICAL,false);
        rvRecommendedEvent.setLayoutManager(eventLinearLayout);
        rvRecommendedEvent.setAdapter(mRecommendedEventAdapter);
    }
}
