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

        // add data using constructor
        ArrayList<ListItem> list = new ArrayList <>();
        list.add(new ListItem(R.drawable.badenpowelllist, "Jazz Divas & Cool Cats","Take your time to enjoy your favorite drink while listening to classic jazz"));
        list.add(new ListItem(R.drawable.badenpowelllist, "As heard at El Viejo", "A collection of music from your favorite bar"));
        list.add(new ListItem(R.drawable.stephanewrembel2list, "Girls night out", "Open a rosé with your besties and let your romantic spirits dream"));
        list.add(new ListItem(R.drawable.badenpowelllist, "Contemporary Lounge", "Set the mood for a great evening. Business outing. First date. Or hipster BBQ. This list is amazing!"));
        list.add(new ListItem(R.drawable.stephanewrembel2list, "French Touch", "Indochine, Louiss Attaque, Noir Désir, Mano Negra. Get your dose of 80's Frenchness"));
        list.add(new ListItem(R.drawable.stephanewrembel2list, "We met at the Movies","A collection of epic movie soundtracks"));
        list.add(new ListItem(R.drawable.badenpowelllist, "Kneipen-hopping", "Techno. Disco. Salsa. Trance. No matter what your late night style, we got you covered here"));

        mRecyclerView = findViewById(R.id.listView);
        // the size of the adapter won't change therefore '.setHasFixedSize' == true
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ListAdapter(list);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
