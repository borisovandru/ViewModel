package com.android.weather.viewmodel.history

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.weather.app.App.Companion.getHistoryDao
import com.android.weather.model.repository.local.LocalRepository
import com.android.weather.model.repository.local.LocalRepositoryImpl
import com.android.weather.viewmodel.AppState

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository = LocalRepositoryImpl(getHistoryDao())
) : ViewModel() {

    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        historyLiveData.value = AppState.Success(historyRepository.getAllHistory())
    }
}