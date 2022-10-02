package com.example.data.database

import com.example.data.database.models.ArticleDTO
import com.example.domain.models.Article

interface DaoFacade {
    suspend fun loadAllNewsItems(page: Int): List<Article>
    suspend fun loadNewsItem(id: Int): Article?
//    suspend fun addNewArticle(title: String, body: String): NewsItem?
//    suspend fun editArticle(id: Int, title: String, body: String): Boolean
//    suspend fun deleteArticle(id: Int): Boolean
}