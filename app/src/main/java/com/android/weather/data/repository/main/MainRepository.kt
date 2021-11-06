package com.android.weather.data.repository.main

import com.android.weather.data.model.Weather

interface MainRepository {

    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): MutableList<Weather>
    fun getWeatherFromLocalStorageWorld(): MutableList<Weather>
}