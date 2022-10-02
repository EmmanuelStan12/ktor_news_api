package com.example.data.api.models

import kotlinx.serialization.Serializable

@Serializable
data class NewsArchiveResponse(
    val nextPage: Int,
    val results: List<Result>,
    val status: String,
    val totalResults: Int
)