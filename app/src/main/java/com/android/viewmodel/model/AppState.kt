package com.android.viewmodel.model

import com.android.viewmodel.model.data.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}