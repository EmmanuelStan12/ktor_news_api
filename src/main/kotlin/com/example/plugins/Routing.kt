package com.example.plugins

import com.example.data.api.ArticleDatasource
import com.example.data.api.ArticleDatasourceImpl
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            val source = ArticleDatasourceImpl()
            val result = source.loadLatestArticles()
            println(result)
        }
    }
}
