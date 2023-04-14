package com.persival.countryname.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "https://api.printful.com/";
    private static Retrofit retrofit = null;

    // Singleton pattern
    public static GetCountryDataService getService() {

        // Instance is not created before
        if (retrofit == null) {
            retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }

        // If instance is already created, return it
        return retrofit.create(GetCountryDataService.class);
    }

}
