package com.example.randomdog.models.api
import com.example.randomdog.models.Dog
import retrofit2.http.GET

const val BASE_URL = "https://randomfox.ca/"

interface ApiRequest {
    @GET("floof")
    suspend fun getRandomDog(): Dog
}