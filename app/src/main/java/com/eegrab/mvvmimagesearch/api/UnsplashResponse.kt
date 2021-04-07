package com.eegrab.mvvmimagesearch.api

import com.eegrab.mvvmimagesearch.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
        )