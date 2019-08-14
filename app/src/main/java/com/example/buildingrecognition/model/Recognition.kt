package com.example.buildingrecognition.model

import com.google.gson.annotations.SerializedName

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
data class Recognition(
    val buildStyle: String,
    @SerializedName("styleinfo")
    val styleInfo: String?,
    val buildings: List<Building>?
)