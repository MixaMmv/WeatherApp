package com.example.myapplication.feature.windscreen.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.weatherscreen.ui.WeatherScreenViewActivity
import com.example.myapplication.feature.weatherscreen.ui.WeatherScreenViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class WindScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)
        val windSpeed: String? = intent.getStringExtra("windSpeed")
        val windDeg: String? = intent.getStringExtra("windDeg")

        findViewById<TextView>(R.id.tvWindspeed).let {
            it.text = getString(R.string.windspeed, windSpeed)
        }
        findViewById<TextView>(R.id.tvWinddeg).let {
            it.text = getString(R.string.winddeg, windDeg)
        }
    }


}