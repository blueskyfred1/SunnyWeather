package com.sunnyweather.android.logic.model

/**
 * @author zhangkai
 * @description:
 * @date: 2023/11/17 14:05
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)
