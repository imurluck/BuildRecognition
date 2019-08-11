package com.example.buildingrecognition.base

import android.app.Application
import com.imurluck.net.HttpHelper
import com.imurluck.net.RetrofitProcessor

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        HttpHelper.getInstance().init(RetrofitProcessor())
    }

}