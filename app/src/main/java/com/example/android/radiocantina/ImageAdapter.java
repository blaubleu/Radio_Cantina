package com.example.android.radiocantina;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * create views
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null){
            //if not recycled init attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(104, 112)); //currently using small imgs update once final assets are in else final assets will be cropped to this size
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    //ref to imgs

    private Integer[] mThumbIds = {
            R.drawable.badenpowelllist, R.drawable.chetbakerlist,
            R.drawable.ellafitzgeraldlist, R.drawable.ettajones2list,
            R.drawable.milesdavislist, R.drawable.ninasimonelist,
            R.drawable.stephanewrembel2list
    };
}
