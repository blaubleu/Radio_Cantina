package com.example.android.radiocantina;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<ListItem> mList;
    private OnItemClickListener mListener;

    // instantiate an onClickListener
    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mListTitle;
        public TextView mListDescription;

        public ListViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iconFade);
            mListTitle = itemView.findViewById(R.id.list_title);
            mListDescription = itemView.findViewById(R.id.list_description);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public ListAdapter(ArrayList<ListItem> list){
        mList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        ListViewHolder lvh = new ListViewHolder(v, mListener);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        ListItem currentItem = mList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mListTitle.setText(currentItem.getList());
        holder.mListDescription.setText(currentItem.getListDesc());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
