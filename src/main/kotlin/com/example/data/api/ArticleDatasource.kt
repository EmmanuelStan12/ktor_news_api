package com.example.data.api

import com.example.data.api.models.LatestNewsResponse
import com.example.data.api.models.NewsArchiveResponse
import com.example.data.api.models.SourcesResponse

interface ArticleDatasource {

    suspend fun loadLatestArticles(): Either<Failure, LatestNewsResponse>

    suspend fun loadArticleArchive(): Either<Failure, NewsArchiveResponse>

    suspend fun loadArticleSources(): Either<Failure, SourcesResponse>
}