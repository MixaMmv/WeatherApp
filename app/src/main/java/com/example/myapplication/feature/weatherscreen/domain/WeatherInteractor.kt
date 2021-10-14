package com.example.myapplication.feature.weatherscreen.domain

import com.example.myapplication.feature.weatherscreen.data.api.WeatherRepo
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel

class WeatherInteractor(private val weatherRepo: WeatherRepo) {
    suspend fun getWeather(): WeatherDomainModel {
        return weatherRepo.getWeather()
    }
}

