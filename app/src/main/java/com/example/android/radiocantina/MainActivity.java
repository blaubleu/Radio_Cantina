package com.example.android.radiocantina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ListItem> mList;
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //remove after test
    private Button button;

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
        mList.add(new ListItem(R.drawable.badenpowelllist, "Jazz Divas & Cool Cats","Take your time to enjoy your favorite drink while listening to classic jazz"));
        mList.add(new ListItem(R.drawable.badenpowelllist, "As heard at El Viejo", "A collection of music from your favorite bar"));
        mList.add(new ListItem(R.drawable.stephanewrembel2list, "Girls night out", "Open a rosé with your besties and let your romantic spirits dream"));
        mList.add(new ListItem(R.drawable.badenpowelllist, "Contemporary Lounge", "Set the mood for a great evening. Business outing. First date. Or hipster BBQ. This list is amazing!"));
        mList.add(new ListItem(R.drawable.stephanewrembel2list, "French Touch", "Indochine, Louiss Attaque, Noir Désir, Mano Negra. Get your dose of 80's Frenchness"));
        mList.add(new ListItem(R.drawable.stephanewrembel2list, "We met at the Movies","A collection of epic movie soundtracks"));
        mList.add(new ListItem(R.drawable.badenpowelllist, "Kneipen-hopping", "Techno. Disco. Salsa. Trance. No matter what your late night style, we got you covered here"));

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
                Intent intent = new Intent(MainActivity.this, Playlist.class);
                intent.putExtra("position", position);
                startActivity(intent);}
            }
        });
    }
}
