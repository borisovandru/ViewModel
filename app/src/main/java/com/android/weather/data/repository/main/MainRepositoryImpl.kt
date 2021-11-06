package com.android.weather.data.repository.main

import com.android.weather.data.model.Weather
import com.android.weather.data.model.getRussianCities
import com.android.weather.data.model.getWorldCities

class MainRepositoryImpl : MainRepository {

    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}
