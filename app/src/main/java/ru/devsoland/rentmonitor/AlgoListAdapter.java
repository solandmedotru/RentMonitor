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
        private TextView profitBtc;
        private TextView price;
        private TextView profitUsd;
        private TextView available;
        private TextView rented;



        public ViewHolder(View itemView) {
            super(itemView);
            algoName = itemView.findViewById(R.id.algo_name);
            profitBtc = itemView.findViewById(R.id.profit_btc);
            price = itemView.findViewById(R.id.price);
            profitUsd = itemView.findViewById(R.id.profit_usd);
            available = itemView.findViewById(R.id.available);
            rented = itemView.findViewById(R.id.rented);
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
        holder.profitBtc.setText(algos.getData().get(position).getStats().getPrices().getLast10().getAmount());
        holder.price.setText(algos.getData().get(position).getStats().getPrices().getLast10().getAmount());
        holder.profitUsd.setText(algos.getData().get(position).getStats().getPrices().getLast10().getAmount());
        holder.available.setText(algos.getData().get(position).getStats().getAvailable().getRigs());
        holder.rented.setText(algos.getData().get(position).getStats().getRented().getRigs());

    }

    @Override
    public int getItemCount() {
        if (algos!=null) return algos.getData().size();
        else return 0;
    }






}
