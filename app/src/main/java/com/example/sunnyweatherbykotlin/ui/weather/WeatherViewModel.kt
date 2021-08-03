package com.example.sunnyweatherbykotlin.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweatherbykotlin.logic.Repository
import com.example.sunnyweatherbykotlin.logic.model.Location

class WeatherViewModel: ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()

    val locationLng = ""
    val locationLat = ""
    val placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }
    fun refreshWeather(lng: String, lat: String){
        locationLiveData.value = Location(lng, lat)
    }
}