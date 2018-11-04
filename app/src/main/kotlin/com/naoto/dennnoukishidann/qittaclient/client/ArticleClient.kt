package com.naoto.dennnoukishidann.qittaclient.client

import com.naoto.dennnoukishidann.qittaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by gotounaoto on 2018/11/04.
 */
interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}