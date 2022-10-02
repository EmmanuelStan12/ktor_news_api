package com.example

import com.example.data.database.DatabaseFactory
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        DatabaseFactory.init()
        configureSerialization()
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
