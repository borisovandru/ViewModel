package com.android.weather.model.repository.local

import com.android.weather.model.data.Weather
import com.android.weather.model.utils.convertHistoryEntityToWeather
import com.android.weather.model.utils.convertWeatherToEntity
import com.android.weather.room.HistoryDao

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {

    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        return localDataSource.insert(convertWeatherToEntity(weather))
    }
}