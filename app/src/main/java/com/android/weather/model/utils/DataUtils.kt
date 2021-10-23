package com.android.weather.model.utils

import com.android.weather.model.data.Weather
import com.android.weather.model.data.getDefaultCity
import com.android.weather.model.dto.WeatherDTO

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(),
            fact.temp!!,
            fact.feels_like!!,
            fact.condition!!
        )
    )
}