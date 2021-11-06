package com.android.weather.data.repository.local

import com.android.weather.data.model.Weather

interface LocalRepository {

    fun saveEntity(weather: Weather)
    fun getAllHistory(): MutableList<Weather>
}