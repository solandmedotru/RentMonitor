package ru.devsoland.rentmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.devsoland.rentmonitor.model.Pojo.RentalAlgo;


class AlgoListAdapter extends RecyclerView.Adapter<AlgoListAdapter.ViewHolder>  {


    private RentalAlgo algos;
    private Context context;



    public AlgoListAdapter(RentalAlgo algos, Context context) {
        this.algos = algos;
        this.context = context;
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

        SharedPreferences prefs =
                PreferenceManager.getDefaultSharedPreferences(context);

        float algoHashrate = Float.parseFloat(prefs.getString(algos.getData().get(position).getName(), "0"));

        String algoName = algos.getData().get(position).getDisplay();
        String last10Price = algos.getData().get(position).getStats().getPrices().getLast10().getAmount();
        String lastPrice = algos.getData().get(position).getStats().getPrices().getLast().getAmount();
        String rigsRented = algos.getData().get(position).getStats().getRented().getRigs();
        String rigsAvalable = algos.getData().get(position).getStats().getAvailable().getRigs();

        holder.algoName.setText(algoName);
        holder.profitBtc.setText(getProfitInBTC(last10Price, algoHashrate));
        holder.price.setText(getProfitInBTC(lastPrice, algoHashrate));
        holder.profitUsd.setText(last10Price);
        holder.available.setText(rigsAvalable);
        holder.rented.setText(rigsRented);

    }

    private String getProfitInBTC(String hashrateString, float algoHashrate) {
        float v = Float.parseFloat(hashrateString);
        return v * algoHashrate + " Btc";
    }

    @Override
    public int getItemCount() {
        if (algos!=null) return algos.getData().size();
        else return 0;
    }






}
