package com.example.data.api.models

import kotlinx.serialization.Serializable

@Serializable
data class SourceItem(
    val category: List<String>,
    val country: List<String>,
    val description: String,
    val id: String,
    val language: List<String>,
    val name: String,
    val url: String
)