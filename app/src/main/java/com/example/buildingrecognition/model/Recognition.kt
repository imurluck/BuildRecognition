package com.example.buildingrecognition.model

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
data class Recognition(
    private val buildStyle: String,
    private val buildings: List<Building>?
)