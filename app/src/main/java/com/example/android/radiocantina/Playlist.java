package com.example.android.radiocantina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

/**
 * Created by moana on 5/24/2018.
 * With the help documentation from Android Developer Guides https://developer.android.com/guide/topics/ui/layout/gridview
 */

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Toast.makeText(Playlist.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
