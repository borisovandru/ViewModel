package com.android.weather.model.repository.details

import com.android.weather.model.dto.WeatherDTO
import retrofit2.Callback

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: Callback<WeatherDTO>
    )
}