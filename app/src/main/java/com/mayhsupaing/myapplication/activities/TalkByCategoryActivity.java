package com.mayhsupaing.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.mayhsupaing.myapplication.R;
import com.mayhsupaing.myapplication.adapters.TalkByCategoryAdapter;
import com.mayhsupaing.myapplication.fragments.PlaylistFragment;
import com.mayhsupaing.myapplication.fragments.PodcastsFragment;
import com.mayhsupaing.myapplication.fragments.TalkByCategoryFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TalkByCategoryActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.vp_talk_by_category)
    ViewPager vpTalkByCategory;

    @BindView(R.id.tb_talk_by_category)
    TabLayout tbTalkByCategory;


    private TalkByCategoryAdapter mTalkByCategoryAdapter;

    /*private int[] tabIcons={
            R.drawable.ic_list_black_24dp,
            R.drawable.ic_subscriptions_black_24dp,
            R.drawable.ic_headset_black_24dp
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_by_category);
        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);


        mTalkByCategoryAdapter=new TalkByCategoryAdapter(getSupportFragmentManager());
        vpTalkByCategory.setAdapter(mTalkByCategoryAdapter);

        mTalkByCategoryAdapter.addTab(new TalkByCategoryFragment());
        mTalkByCategoryAdapter.addTab(new PlaylistFragment());
        mTalkByCategoryAdapter.addTab(new PodcastsFragment());


      tbTalkByCategory.setupWithViewPager(vpTalkByCategory);
      setUpTaplayoutIcon();

    }

    public void setUpTaplayoutIcon(){
        tbTalkByCategory.getTabAt(0).setIcon(R.drawable.ic_list_black_24dp);
        tbTalkByCategory.getTabAt(1).setIcon(R.drawable.ic_subscriptions_black_24dp);
        tbTalkByCategory.getTabAt(2).setIcon(R.drawable.ic_headset_black_24dp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.fab)
    public void onTapFab(View view){
        /*Snackbar.make(view, "Replace with your own action - ButterKnife", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();*/
        Intent intent=new Intent(getApplicationContext(),SearchTedTalksActivity.class);
        startActivity(intent);
    }

}
