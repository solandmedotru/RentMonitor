package ru.devsoland.rentmonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.devsoland.rentmonitor.model.RigRentalService;
import ru.devsoland.rentmonitor.model.Pojo.RentalAlgo;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView algoList;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private RentalAlgo algos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        algoList = findViewById(R.id.rv_algo_list);
        algoList.setHasFixedSize(true);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.miningrigrentals.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RigRentalService service = retrofit.create(RigRentalService.class);


        Call<RentalAlgo> rentalAlgos = service.getRentalAlgos();
        rentalAlgos.enqueue(new Callback<RentalAlgo>() {
            @Override
            public void onResponse(Call<RentalAlgo> call, Response<RentalAlgo> response) {

                if (response.isSuccessful()) {
                    algos = response.body();
                    adapter = new AlgoListAdapter(algos);

                    layoutManager = new LinearLayoutManager(getApplicationContext());
                    algoList.setLayoutManager(layoutManager);
                    algoList.setItemAnimator(new DefaultItemAnimator());
                    algoList.setAdapter(adapter);
                } else {
                    Toast.makeText(getApplicationContext(), response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RentalAlgo> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
