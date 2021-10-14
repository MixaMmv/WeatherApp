package com.example.myapplication.feature.weatherscreen.data.api

import com.example.myapplication.feature.weatherscreen.data.toDomain
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel

class WeatherRepoImpl(private val source: WeatherRemoteSource): WeatherRepo {
    override suspend fun getWeather(): WeatherDomainModel {
        return source.getWeather("").toDomain()
    }
}