package com.example.myapplication.feature.weatherscreen.di

import com.example.myapplication.feature.weatherscreen.data.api.WeatgerApi
import com.example.myapplication.feature.weatherscreen.data.api.WeatherRemoteSource
import com.example.myapplication.feature.weatherscreen.data.api.WeatherRepo
import com.example.myapplication.feature.weatherscreen.data.api.WeatherRepoImpl
import com.example.myapplication.feature.weatherscreen.domain.WeatherInteractor
import com.example.myapplication.feature.weatherscreen.ui.WeatherScreenViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://api.openweathermap.org/"

val appModule = module {

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<WeatgerApi> {
        get<Retrofit>().create(WeatgerApi::class.java)
    }

    single<WeatherRemoteSource> {
        WeatherRemoteSource(get<WeatgerApi>())
    }

    single<WeatherRepo> {
        WeatherRepoImpl(get<WeatherRemoteSource>())
    }

    single<WeatherInteractor> {
        WeatherInteractor(get<WeatherRepo>())
    }

    viewModel<WeatherScreenViewModel> {
        WeatherScreenViewModel(get<WeatherInteractor>())
    }

}