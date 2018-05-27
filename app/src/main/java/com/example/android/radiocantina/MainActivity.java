package com.example.android.radiocantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ListItem> mList;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();
        buildRecyclerView();

    }

    public void createList(){
        // add data using constructor
        mList = new ArrayList <>();
        mList.add(new ListItem(R.drawable.sodastereo2, "Soda Stereo", "Canción Animal"));
        mList.add(new ListItem(R.drawable.texas2, "Texas", "The Greatest Hits"));
        mList.add(new ListItem(R.drawable.norahjones2, "Norah Jones", "Feels Like Home"));
        mList.add(new ListItem(R.drawable.ninasimone2, "Nina Simone", "The Very Best of Nina Simone"));
        mList.add(new ListItem(R.drawable.melancholia2, "Melancholia Soundtrack", "The City of Prague Philharmonic Orchestra & Richard Hein"));
        mList.add(new ListItem(R.drawable.louiseattaque3, "Louise Attaque", "à plus tard crocodile"));
        mList.add(new ListItem(R.drawable.amelie2, "Amélie Soundtrack", "Yann Tiersen"));
        mList.add(new ListItem(R.drawable.indochine2, "Indochine", "J'ai demandé à la lune"));
        mList.add(new ListItem(R.drawable.doctorstrange2, "Doctor Strange Soundtrack", "Michael Giacchino"));
    }

    public void buildRecyclerView (){
        mRecyclerView = findViewById(R.id.listView);
        // the size of the adapter won't change therefore '.setHasFixedSize' == true
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ListAdapter(mList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                mList.get(position);
                if (position == 0){
                    Intent intent = new Intent(MainActivity.this, Playlist.class); // add class
                    intent.putExtra("position", position);
                    startActivity(intent);}
            }
        });
    }
}
