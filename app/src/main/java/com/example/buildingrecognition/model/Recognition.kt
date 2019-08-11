package com.example.buildingrecognition.model

import com.google.gson.annotations.SerializedName

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
data class Recognition(
    private val buildStyle: String,
    @SerializedName("styleinfo")
    private val styleInfo: String?,
    private val buildings: List<Building>?
)