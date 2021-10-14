package com.example.myapplication.feature.windscreen

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.weatherscreen.ui.WeatherScreenViewModel
import org.koin.android.viewmodel.ext.android.viewModel



class WindScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)
    }

}