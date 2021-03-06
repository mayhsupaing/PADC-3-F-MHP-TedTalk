package com.mayhsupaing.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.adapters.PlaylistAdapter;
import com.mayhsupaing.myapplication.adapters.TalkAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Lenovo on 1/29/2018.
 */

public class TalkByCategoryFragment extends Fragment {

    @BindView(R.id.rv_ted_talks)
    RecyclerView rvTedTalks;

    private TalkAdapter mTalkAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_talk_by_category, container, false);
        ButterKnife.bind(this, view);

        mTalkAdapter = new TalkAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        rvTedTalks.setLayoutManager(linearLayoutManager);
        rvTedTalks.setAdapter(mTalkAdapter);

        return view;
    }
}
