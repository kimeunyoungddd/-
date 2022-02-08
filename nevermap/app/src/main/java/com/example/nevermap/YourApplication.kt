package com.example.nevermap

import android.app.Application

class YourApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformGovClient("bIlEVs7CPhaPCqkYWpxI")
    }
}