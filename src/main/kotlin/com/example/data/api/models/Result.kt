package com.example.data.api.models

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val category: List<String>? = emptyList(),
    val content: String? = "",
    val country: List<String>? = emptyList(),
    val creator: List<String>? = emptyList(),
    val description: String? = "",
    val image_url: String? = "",
    val keywords: List<String>? = emptyList(),
    val language: String? = "",
    val link: String? = "",
    val pubDate: String? = "",
    val source_id: String? = "",
    val title: String? = "",
    val video_url: String? = ""
)