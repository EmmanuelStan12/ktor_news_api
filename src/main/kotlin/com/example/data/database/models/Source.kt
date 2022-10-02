package com.example.data.database.models

import org.jetbrains.exposed.sql.Table

object Source: Table() {
    val category = varchar("category", 128)
    val country = varchar("country", 128)
    val description = varchar("description", 1024)
    val id = varchar("id", 128)
    val language = varchar("language", 128)
    val name = varchar("name", 128)
    val url = varchar("url", 128)
}