package com.example.android.radiocantina;

/**
 * Created by moana on 5/20/2018.
 * With the help of tutorials from Coding in Flow - F. Walther
 */

public class ListItem {
    private int mImageResource;
    private String mList;
    private String mListDesc;

    //define a constructor
    public ListItem(int imageResource, String list, String listDesc){
        mImageResource = imageResource;
        mList = list;
        mListDesc = listDesc;
    }

    // getters
    public int getImageResource(){
      return mImageResource;
    }

    public String getList() {
        return mList;
    }

    public String getListDesc() {
        return mListDesc;
    }
}
