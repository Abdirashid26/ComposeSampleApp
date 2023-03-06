package com.faisal.composesampleapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created By Faisal Abdirashid on Date : 3/6/2023.
 */

@HiltAndroidApp
class ComposeSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}