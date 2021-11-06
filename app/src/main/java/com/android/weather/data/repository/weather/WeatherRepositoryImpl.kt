package com.android.weather.data.repository.weather

import com.android.weather.data.repository.remote.RemoteDataSource

class WeatherRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : WeatherRepository {

    override fun getWeatherDetailsFromServer(lat: Double, lon: Double) =
        remoteDataSource.getWeatherDetails(lat, lon)
}