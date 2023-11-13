package com.sunnyweather.android.logic

import androidx.lifecycle.liveData
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

/**
 * @author zhangkai
 * @description:封装仓库层
 * @date: 2023/11/13 16:17
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e: Exception) {

        }
        emit(result)
    }
}