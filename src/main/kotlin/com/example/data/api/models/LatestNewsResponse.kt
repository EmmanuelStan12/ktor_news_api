package com.example.data.api.models

import kotlinx.serialization.Serializable

@Serializable
data class LatestNewsResponse(
    val nextPage: Int = 0,
    val results: List<Result> = emptyList(),
    val status: String = "",
    val totalResults: Int = 0
)