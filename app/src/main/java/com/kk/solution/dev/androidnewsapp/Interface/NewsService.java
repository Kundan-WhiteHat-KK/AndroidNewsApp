package com.kk.solution.dev.androidnewsapp.Interface;

import com.kk.solution.dev.androidnewsapp.Model.News;
import com.kk.solution.dev.androidnewsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kunda on 10/20/2017.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
