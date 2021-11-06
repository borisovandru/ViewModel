package com.android.weather.presentation.viewmodel.history

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.weather.data.app.App.Companion.getHistoryDao
import com.android.weather.data.repository.local.LocalRepository
import com.android.weather.data.repository.local.LocalRepositoryImpl
import com.android.weather.presentation.state.AppState

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository = LocalRepositoryImpl(getHistoryDao())
) : ViewModel() {

    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        historyLiveData.value = AppState.Success(historyRepository.getAllHistory())
    }
}
