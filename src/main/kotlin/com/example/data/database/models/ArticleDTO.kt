package com.example.data.database.models

import org.jetbrains.exposed.sql.Table

object ArticleDTO: Table() {
    val category = varchar("category", 128)
    val content = varchar("content", 1024)
    val country = varchar("country", 128)
    val creator = varchar("creator", 128)
    val description = varchar("description", 1024)
    val image_url = varchar("image_url", 128)
    val keywords = varchar("keywords", 128)
    val language = varchar("language", 128)
    val link = varchar("link", 128)
    val pubDate = varchar("pubDate", 128)
    val source_id = varchar("source_id", 128)
    val title = varchar("title", 128)
    val video_url = varchar("video_url", 128)
    val id = integer("id").autoIncrement()
}