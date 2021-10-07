package com.example.myapplication.feature.weatherscreen.di

import com.example.myapplication.feature.weatherscreen.data.api.WeatgerApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "api.openweathermap.org/data/2.5/"

val appModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<WeatgerApi> {
        get<Retrofit>().create(WeatgerApi::class.java)
    }

}