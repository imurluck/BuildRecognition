package com.example.buildingrecognition.model

import com.google.gson.annotations.SerializedName

/**
 * used for
 * create by imurluck
 * create at 2019-08-11
 */
data class Building(
    private val address: String?,
    private val created: String?,
    private val houseNumber: String?,
    private val description: String?,
    private val designer: List<Designer>?,
    private val relation: List<Designer>?,
    private val uri: String?,
    private val architecturalStyle: String?,
    private val hasFile: String?,
    private val name: String?,
    private val architectureStructure: String?,
    @SerializedName("yname")
    private val yName: List<YName>?,
    private val location: List<Location>?,
    private val lane: List<Lane>?,
    private val event: List<Event>

)