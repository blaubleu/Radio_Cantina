package com.example.android.radiocantina;

public class ListItem {
    private int mImageResource;
    private String mList;
    private String mListDesc;

    public ListItem(int imageResource, String list, String listDesc){
        mImageResource = imageResource;
        mList = list;
        mListDesc = listDesc;
    }

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
