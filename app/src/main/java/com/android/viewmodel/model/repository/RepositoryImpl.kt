package com.android.viewmodel.model.repository

import com.android.viewmodel.model.data.Weather
import com.android.viewmodel.model.data.getRussianCities
import com.android.viewmodel.model.data.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }
}