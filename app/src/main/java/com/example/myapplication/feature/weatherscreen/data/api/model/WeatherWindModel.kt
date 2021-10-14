package com.example.myapplication.feature.weatherscreen.data.api.model

import com.google.gson.annotations.SerializedName

class WeatherWindModel (
    @SerializedName("speed")
    val speed: Double,
    @SerializedName("deg")
    val deg: Int
)
/*
"wind":
{
    "speed": 1.5,
    "deg": 350
},*/
