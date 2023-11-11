package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * @author zhangkai
 * @description:
 * @date: 2023/11/11 15:33
 */
class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "DA0OnwTQPOQWP30j"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}