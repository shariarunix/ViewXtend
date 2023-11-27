package com.shariarunix.viewxtend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    GridXtend myGrid;
    ListXtend myList;

    LinearLayout llHorzGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGrid = findViewById(R.id.grid_xtend);
        myList = findViewById(R.id.list_xtend);
        llHorzGrid = findViewById(R.id.ll_horz_grid);

        for (int i = 0; i < 5; i++) {
            View myView = getLayoutInflater().inflate(R.layout.horz_item, llHorzGrid, false);

            llHorzGrid.addView(myView);
        }

        myGrid.setXtend(true);
        myList.setXtend(true);

        BaseAdapter myAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return 10;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = getLayoutInflater().inflate(R.layout.xtend_item, viewGroup, false);
                }

                return view;
            }
        };

        myGrid.setAdapter(myAdapter);
        myList.setAdapter(myAdapter);
    }
}