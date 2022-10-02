package com.example.data.api.models

import kotlinx.serialization.Serializable

@Serializable
data class SourcesResponse(
    val results: List<SourceItem>,
    val status: String
)