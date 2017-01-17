package com.droiddigger.customfonts;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
/**
 * Created by mufad on 1/11/2017.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView message;
    public ItemViewHolder(View itemView) {
        super(itemView);
        message= (TextView) itemView.findViewById(R.id.listItemText);
    }
}
