package com.android.weather.data.repository.local

import com.android.weather.data.model.Weather
import com.android.weather.data.room.HistoryDao
import com.android.weather.data.utils.convertHistoryEntityToWeather
import com.android.weather.data.utils.convertWeatherToEntity

class LocalRepositoryImpl(
    private val localDataSource: HistoryDao
) : LocalRepository {

    override fun saveEntity(weather: Weather) =
        localDataSource.insert(convertWeatherToEntity(weather))

    override fun getAllHistory() = convertHistoryEntityToWeather(localDataSource.all())
}