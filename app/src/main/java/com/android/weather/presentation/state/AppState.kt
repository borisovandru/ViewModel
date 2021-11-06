package com.android.weather.presentation.state

import com.android.weather.data.model.Weather

sealed class AppState {
    data class Success(val weatherData: MutableList<Weather>) : AppState()
    class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}