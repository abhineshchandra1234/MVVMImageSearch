package com.eegrab.mvvmimagesearch.api

import com.eegrab.mvvmimagesearch.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object {
        const val BASE_URL = "https://api.unsplash.com/"
    }

    @Headers("Accept-Version: v1", "Authorization: Client-ID DduTK37yuGvExAlXBPLmbefz4wWK0ijz_mzl3fzcDLY")
    @GET("search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ):UnsplashResponse
}