package com.kk.solution.dev.androidnewsapp.Common;

import com.kk.solution.dev.androidnewsapp.Interface.IconBetterIdeaService;
import com.kk.solution.dev.androidnewsapp.Interface.NewsService;
import com.kk.solution.dev.androidnewsapp.Remote.IconBetterIdeaClient;
import com.kk.solution.dev.androidnewsapp.Remote.RetrofitClient;

/**
 * Created by kundan on 10/20/2017.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="4f91baeac7724fe197d4de6e975d8b5b";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v1/articles?source=");
        return apiUrl.append(source)
                .append("&sortBy=")
                .append(sortBy)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}

