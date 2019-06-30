package com.example.courseondemand.home_fragment_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.courseondemand.R;

import java.util.ArrayList;
import java.util.List;

public class ListScheduleActivity extends AppCompatActivity {

    private List<ListScheduleModel> mLists = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        
        initRecyclerView();
        initDummy();
    }

    private void initDummy() {
        mLists.add(new ListScheduleModel("1", "Angela", "Monday", "Kalkulus", "08:30", "2 hours"));
        mLists.add(new ListScheduleModel("2", "Melissa", "Monday", "Kalkulus", "08:30", "2 hours"));
        mLists.add(new ListScheduleModel("3", "Lisa", "Monday", "Kalkulus", "08:30", "2 hours"));
        mLists.add(new ListScheduleModel("4", "Jennie", "Monday", "Kalkulus", "08:30", "2 hours"));
        mAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView() {
        mRecyclerView = findViewById(R.id.rvSchedule);
        mAdapter = new ListScheduleAdapter(mLists);
        mLayoutManager = new LinearLayoutManager(ListScheduleActivity.this);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_notactive, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
