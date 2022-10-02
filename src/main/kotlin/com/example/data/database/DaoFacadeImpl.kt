package com.example.data.database

import com.example.data.database.DatabaseFactory.dbQuery
import com.example.data.database.models.ArticleDTO
import com.example.domain.models.Article
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

class DaoFacadeImpl : DaoFacade {
    override suspend fun loadAllNewsItems(page: Int): List<Article> = dbQuery {
        ArticleDTO.selectAll().map(::resultRowToArticle)
    }

    override suspend fun loadNewsItem(id: Int): Article? {
        return ArticleDTO
            .select { ArticleDTO.id eq id }
            .map(::resultRowToArticle)
            .singleOrNull()
    }

    private fun resultRowToArticle(row: ResultRow) = Article(
        category = row[ArticleDTO.category].split(","),
        content = row[ArticleDTO.content],
        country = row[ArticleDTO.country].split(","),
        creator = row[ArticleDTO.creator].split(","),
        description = row[ArticleDTO.description],
        image_url = row[ArticleDTO.image_url],
        keywords = row[ArticleDTO.keywords].split(","),
        language = row[ArticleDTO.language],
        link = row[ArticleDTO.link],
        pubDate = row[ArticleDTO.pubDate],
        source_id = row[ArticleDTO.source_id],
        title = row[ArticleDTO.title],
        video_url = row[ArticleDTO.video_url]
    )
}