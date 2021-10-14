package com.example.myapplication.feature.weatherscreen.data.api

import com.example.myapplication.feature.weatherscreen.data.api.model.WeatherModel

class WeatherRemoteSource( val api: WeatgerApi) {
    suspend fun getWeather(cityName: String): WeatherModel {
        return api.getWeather("Moscow")
    }
}