package com.example.myapplication.feature.weatherscreen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("humidity")
    val humidity: Int
)

//{
//    "main": {
//        "temp": 282.55,
//        "feels_like": 281.86,
//        "temp_min": 280.37,
//        "temp_max": 284.26,
//        "pressure": 1023,S
//        "humidity": 100
//    }
//}

