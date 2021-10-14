package com.example.myapplication.feature.weatherscreen.data

import com.example.myapplication.feature.weatherscreen.data.api.model.WeatherModel
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel

fun WeatherModel.toDomain(): WeatherDomainModel {
    return WeatherDomainModel(
        this.main.temp,
        this.main.tempMin,
        this.main.tempMax
    )
}
