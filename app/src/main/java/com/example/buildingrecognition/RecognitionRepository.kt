package com.example.buildingrecognition

import com.imurluck.net.HttpHelper
import com.imurluck.net.HttpUtil
import com.imurluck.net.LoadCallback
import com.imurluck.net.common.Constant

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
object RecognitionRepository {

    private const val TAG_RECOGNITION = "recognition"

    private const val KEY_PHOTO_FILE = "document"

    fun recognition(photoUrl: String, loadCallback: LoadCallback<String>) {
        HttpHelper.getInstance().post(Constant.URL_RECOGNITION, HashMap(),
            loadCallback, TAG_RECOGNITION, HttpUtil.createFilePart(KEY_PHOTO_FILE, photoUrl))
    }
}