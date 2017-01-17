package com.droiddigger.customfonts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class NoAdRecyclerViewAdapter extends RecyclerView.Adapter<ItemViewHolder>{
    Context context;
    LayoutInflater inflater;
    ArrayList<Information> myList = new ArrayList<Information>();
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        FontChangeCrawler fontChanger = new FontChangeCrawler(context.getAssets(), "fonts/Roboto-Light.ttf");
        View v =inflater.inflate(R.layout.custom_list_row, parent, false);
        fontChanger.replaceFonts((ViewGroup)v);
        ItemViewHolder itemViewHolder =new ItemViewHolder(v);

        return itemViewHolder;
    }

    public NoAdRecyclerViewAdapter(Context context, ArrayList<Information> myList) {
        this.context = context;
        inflater=LayoutInflater.from(context);
        this.myList = myList;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.message.setText(myList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
