package com.example.travellingapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travellingapplication.adapter.RecentsAdapter;
import com.example.travellingapplication.adapter.TopPlacesAdapter;
import com.example.travellingapplication.model.RecentsData;
import com.example.travellingapplication.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecyler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India", "From $300", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);


        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill", "India", "$200 - $500", R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }


    private void setRecentRecycler(List<RecentsData> recentsDataList) {
        recentRecyler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecyler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecyler.setAdapter(recentsAdapter);
    }
}