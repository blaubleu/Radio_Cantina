package com.example.android.radiocantina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListItem> list = new ArrayList <>();
        list.add(new ListItem(R.drawable.badenpowelllist, "Jazz Divas & Cool Cats","Take your time to enjoy your favorite Cognac\n while listening to classic jazz"));
        list.add(new ListItem(R.drawable.stephanewrembel2list, "Met at the Movies","A collection of epic movie soundtracks"));

        mRecyclerView = findViewById(R.id.listView);
        // the size of the adapter won't change therefore '.setHasFixedSize' can be set to true
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ListAdapter(list);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
