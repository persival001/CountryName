package com.persival.countryname.service;

import com.persival.countryname.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

//Retrofit Interface
public interface GetCountryDataService {


    @GET("countries")
    Call<Result> getResult();
}
