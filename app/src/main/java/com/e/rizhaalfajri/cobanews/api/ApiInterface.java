package com.e.rizhaalfajri.cobanews.api;

import com.e.rizhaalfajri.cobanews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("everything")
    Call<News> getNews(

            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

}
