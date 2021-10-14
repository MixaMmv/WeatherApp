package com.example.myapplication.feature.weatherscreen.data

import com.example.myapplication.feature.weatherscreen.data.api.model.WeatherMainModel
import com.example.myapplication.feature.weatherscreen.data.api.model.WeatherModel
import com.example.myapplication.feature.weatherscreen.data.api.model.WeatherWindModel
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.weatherscreen.domain.model.WindDomainModel

fun WeatherModel.toDomain() = WeatherDomainModel(
    temperature = main.temp,
    maxtemperature = main.tempMax,
    mintemperature = main.tempMin,
    windDomainModel = wind.toDomain()
)

fun WeatherWindModel.toDomain() = WindDomainModel(
    this.speed,
    this.deg
)
