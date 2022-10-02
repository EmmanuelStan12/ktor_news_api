package com.example.data.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.observer.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.netty.handler.logging.LogLevel
import kotlinx.serialization.json.Json

object KtorClient {
    val httpClient = HttpClient(CIO) {

        install(ResponseObserver) {
            onResponse { response ->
                println("HTTP status: ${response.status.value}")
            }
        }

        install(DefaultRequest) {
            header(HttpHeaders.ContentType, ContentType.Application.Json)
        }

        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }
}