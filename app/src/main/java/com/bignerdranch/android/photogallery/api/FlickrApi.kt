package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "703a0fedaee1f58a44f0caca8fc2228b"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
