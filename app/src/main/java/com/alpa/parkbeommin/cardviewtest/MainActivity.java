package com.alpa.parkbeommin.cardviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this).setOrientation(LinearLayoutManager.HORIZONTAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        recyclerView.setLayoutManager(layoutManager);
recyclerView.setAdapter(recyclerAdapter);

    }

}
