package com.example.sunnyweatherbykotlin

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "9yF91QzioUsEahWd"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}