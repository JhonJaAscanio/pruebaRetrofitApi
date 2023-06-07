package com.example.pruebaretrofitapi.Interface;

import com.example.pruebaretrofitapi.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
