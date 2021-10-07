package com.example.myapplication.feature.weatherscreen.data.api

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

//const val BASE_URL = "api.openweathermap.org/data/2.5/weather"


interface WeatgerApi {
    @GET("/weather")
    fun getWeather(
            @Query("q") cityName: String,
            @Query("appid") appId: String = "42502d933ac900083663981380182cb2"
    ) : ResponseBody
}