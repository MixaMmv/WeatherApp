package com.example.myapplication.feature.windscreen.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.feature.weatherscreen.domain.WeatherInteractor
import com.example.myapplication.feature.weatherscreen.domain.model.WeatherDomainModel
import com.example.myapplication.feature.weatherscreen.domain.model.WindDomainModel
import kotlinx.coroutines.launch

class WindScreenViewModel() : ViewModel() {
    val liveData: MutableLiveData<WindDomainModel> = MutableLiveData()


    }

