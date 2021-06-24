package com.jw.firstapp.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("get_data.json")
    Call<TestInfo> getData();

}
