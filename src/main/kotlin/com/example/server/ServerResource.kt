package com.example.server

object ServerResource {
    fun serverUrl(
        apiKey: String = API_KEY,
        type: ServerRequestType = ServerRequestType.LATEST_NEWS,
        categories: List<String>? = null,
        countries: List<String>? = null,
        languages: List<String>? = null,
        domains: List<String>? = null,
        from_date: String? = null,
        to_date: String? = null,
        query: String? = null,
        page: Int = 1
    ): String {
        val url = "apiKey=$apiKey${generateQuery("category", values = categories)}" +
                "${generateQuery("country", values = countries)}${
                    generateQuery(
                        "language",
                        values = languages
                    )
                }${generateQuery("domain", values = domains)}${generateQuery("from_date", from_date)}" +
                "${generateQuery("to_date", to_date)}${generateQuery("q", query)}" +
                generateQuery("page", page.toString())
        return "${type.endPoint}?$url"
    }

    private fun generateQuery(name: String, value: String? = null, values: List<String>? = null): String {
        val format = "&%s=%s"
        values?.let {
            return format.format(name, it.joinToString(","))
        }
        value?.let {
            return format.format(name, it)
        }
        return ""
    }
}

