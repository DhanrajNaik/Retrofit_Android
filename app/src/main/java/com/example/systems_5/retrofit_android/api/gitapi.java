package com.example.systems_5.retrofit_android.api;

/**
 * Created by System S-5 on 14-07-2015.
 */
//import com.makeinfo.flowerpi.model.gitmodel;

import com.example.systems_5.retrofit_android.model.gitmodel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;


public interface gitapi {
    @GET("/users/{user}")
    public void getFeed(@Path("user") String user,Callback<gitmodel> response);

}

