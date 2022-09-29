package com.example.server

enum class ServerRequestType(val endPoint: String) {
    LATEST_NEWS("https://newsdata.io/api/1/news"),
    NEWS_ARCHIVE("https://newsdata.io/api/1/archive"),
    SOURCES("https://newsdata.io/api/1/sources"),
    CRYPTO_NEWS("https://newsdata.io/api/1/crypto")
}