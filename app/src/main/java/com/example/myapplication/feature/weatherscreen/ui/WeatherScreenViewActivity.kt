package com.example.myapplication.feature.weatherscreen.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenViewActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.liveData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather()
    }

    fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTemperature).let { it.text = "Current Temp: ${state.temperature} °C" }
        findViewById<TextView>(R.id.tvMinTemperature).let { it.text = "Min Temp: ${state.mintemperature} °C" }
        findViewById<TextView>(R.id.tvMaxTemperature).let { it.text = "Max Temp: ${state.maxtemperature} °C" }
    }

}