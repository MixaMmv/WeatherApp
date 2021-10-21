package com.example.myapplication.feature.weatherscreen.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.windscreen.ui.WindScreenActivity
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherScreenViewActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        weatherScreenViewModel.liveData.observe(this, Observer(::render))
        weatherScreenViewModel.requestWeather()
//        Log.i("OUT", windspeed.toString() ?: "null")

        findViewById<Button>(R.id.btnWind).setOnClickListener {
            Intent(this, WindScreenActivity::class.java).apply {
                putExtra("windSpeed", weatherScreenViewModel.liveData.value?.windDomainModel?.speed.toString())
                putExtra("windDeg", weatherScreenViewModel.liveData.value?.windDomainModel?.deg.toString())
            }.also {
                startActivity(it)
            }
        }

    }

    fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvTemperature).let {
            it.text = getString(R.string.temperature, state.temperature)
        }
        findViewById<TextView>(R.id.tvMinTemperature).let {
            it.text = getString(R.string.temperature_min, state.mintemperature)
        }
        findViewById<TextView>(R.id.tvMaxTemperature).let {
            it.text = getString(R.string.temperature_max, state.maxtemperature)
        }
        val windDomainModel = state.windDomainModel

    }

}

//https://github.com/skull615d/weather/tree/NewBranch
