package com.example.myapplication.feature.weatherscreen.data.api

import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel

interface WeatherRepo {
    suspend fun getWeather(): WeatherDomainModel
}