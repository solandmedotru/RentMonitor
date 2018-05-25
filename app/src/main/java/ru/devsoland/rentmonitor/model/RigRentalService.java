package ru.devsoland.rentmonitor.model;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

import ru.devsoland.rentmonitor.model.Pojo.RentalAlgo;


public interface RigRentalService {
    @GET("info/algos")
    Call<RentalAlgo> getRentalAlgos();

    @GET("info/algos")
    Call<ResponseBody> getRentalAlgos1();
}
