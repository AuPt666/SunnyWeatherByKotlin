package com.example.sunnyweatherbykotlin.logic.model

import android.app.DownloadManager
import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperatre: Float, @SerializedName("air_quality") val airQuery: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)

}