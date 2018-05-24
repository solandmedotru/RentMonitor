package ru.devsoland.rentmonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import ru.devsoland.rentmonitor.model.RentalAlgo;

public class MainActivity extends AppCompatActivity {

    private RecyclerView algoList;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    ArrayList< RentalAlgo> algos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        algoList = findViewById(R.id.rv_algo_list);
        algoList.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        algoList.setLayoutManager(layoutManager);

        adapter = new AlgoListAdapter(algos);
        algoList.setAdapter(adapter);

    }
}
