package ru.devsoland.rentmonitor;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.devsoland.rentmonitor.model.Pojo.RentalAlgo;


class AlgoListAdapter extends RecyclerView.Adapter<AlgoListAdapter.ViewHolder>  {



    private RentalAlgo algos;


    public AlgoListAdapter(RentalAlgo algos) {
        this.algos = algos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView algoName;
        public ViewHolder(View itemView) {
            super(itemView);
            algoName = itemView.findViewById(R.id.algo_name);
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
        holder.algoName.setText(algos.getData().get(position).getDisplay());

    }

    @Override
    public int getItemCount() {
        if (algos!=null) return algos.getData().size();
        else return 0;
    }






}
