package com.example.data.api

import com.example.data.api.models.LatestNewsResponse
import com.example.data.api.models.NewsArchiveResponse
import com.example.data.api.models.SourcesResponse
import com.example.server.ServerResource
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.decodeFromString

class ArticleDatasourceImpl : ArticleDatasource {

    /**
     * loadLatestArticles - loads the latest articles from the data source
     */
    override suspend fun loadLatestArticles(): Either<Failure, LatestNewsResponse> {
        return try {
            val result = KtorClient.httpClient.get(ServerResource.serverUrl())
            Either.Right(result.body())
        } catch (e: Exception) {
            println(e.message)
            e.printStackTrace()
            Either.Left(e.toCustomExceptions())
        }
    }

    /**
     * loadArticleArchive - loads archives from datasource
     */
    override suspend fun loadArticleArchive(): Either<Failure, NewsArchiveResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun loadArticleSources(): Either<Failure, SourcesResponse> {
        TODO("Not yet implemented")
    }
}

fun Exception.toCustomExceptions() = when (this) {
    is ServerResponseException -> Failure.HttpErrorInternalServerError(this)
    is ClientRequestException ->
        when (this.response.status.value) {
            400 -> Failure.HttpErrorBadRequest(this)
            401 -> Failure.HttpErrorUnauthorized(this)
            403 -> Failure.HttpErrorForbidden(this)
            404 -> Failure.HttpErrorNotFound(this)
            else -> Failure.HttpError(this)
        }

    is RedirectResponseException -> Failure.HttpError(this)
    else -> Failure.GenericError(this)
}