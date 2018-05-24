package ru.devsoland.rentmonitor;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ru.devsoland.rentmonitor.model.RentalAlgo;

class AlgoListAdapter extends RecyclerView.Adapter<AlgoListAdapter.ViewHolder>  {

    private ArrayList<RentalAlgo> algos;
    public View view;

    public AlgoListAdapter(ArrayList<RentalAlgo> algos) {
        this.algos = algos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.algo_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return algos.size();
    }






}
