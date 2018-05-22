package com.example.anfio.popularmovies.utilities;

import com.example.anfio.popularmovies.BuildConfig;

public class Constants {

    public static final String API_KEY = BuildConfig.API_KEY;
    // used in MainActivity
    public static final String STRING_URL_POPULAR = "http://api.themoviedb.org/3/movie/popular?api_key=" + Constants.API_KEY;
    public static final String STRING_URL_TOP_RATED = "http://api.themoviedb.org/3/movie/top_rated?api_key=" + Constants.API_KEY;
}