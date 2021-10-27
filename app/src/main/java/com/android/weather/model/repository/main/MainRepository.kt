package com.android.weather.model.repository.main

import com.android.weather.model.data.Weather

interface MainRepository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}