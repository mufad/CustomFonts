package com.droiddigger.customfonts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class NewActivity extends BaseActivity {
    String[]messagesArray;

    RecyclerView recyclerView;
    NoAdRecyclerViewAdapter recyclerViewAdapter;

    RecyclerView.LayoutManager layoutManager;
    ArrayList<Information>quotes = new ArrayList<Information>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        messagesArray=getResources().getStringArray(R.array.bangla_sms);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        for (int i=0;i<messagesArray.length;i++){
            Information dataset=new Information(messagesArray[i]);
            quotes.add(dataset);

        }
        layoutManager=new LinearLayoutManager(this);
         recyclerViewAdapter=new NoAdRecyclerViewAdapter(this, quotes);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(layoutManager);



    }
}
