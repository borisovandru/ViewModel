package com.android.weather.model.repository.local

import com.android.weather.model.data.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}