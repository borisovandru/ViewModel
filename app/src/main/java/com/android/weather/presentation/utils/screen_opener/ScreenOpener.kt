package com.android.weather.presentation.utils.screen_opener

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.android.weather.presentation.view.fragment.googlemaps.GoogleMapsFragment
import com.android.weather.presentation.view.fragment.history.HistoryFragment
import com.android.weather.presentation.view.fragment.home.HomeFragment

class ScreenOpener : IScreenOpener {
    override fun openHomeFragment() = FragmentScreen { HomeFragment() }
    override fun openHistoryFragment() = FragmentScreen { HistoryFragment() }
    override fun openGoogleMapsFragment() = FragmentScreen { GoogleMapsFragment() }
}