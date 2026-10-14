package com.example.freelanceservicesmarketplace.api

import com.example.freelanceservicesmarketplace.model.Bid
import com.example.freelanceservicesmarketplace.model.Message
import com.example.freelanceservicesmarketplace.model.Review
import com.example.freelanceservicesmarketplace.model.Service
import com.example.freelanceservicesmarketplace.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("register")
    suspend fun registerUser(
        @Body user: User
    ): Response<User>

    @POST("login")
    suspend fun loginUser(
        @Body user: User
    ): Response<User>

    @GET("services")
    suspend fun getServices(): Response<List<Service>>

    @POST("services")
    suspend fun createService(
        @Body service: Service
    ): Response<Service>

    @POST("bids")
    suspend fun submitBid(
        @Body bid: Bid
    ): Response<Bid>

    @GET("messages")
    suspend fun getMessages(): Response<List<Message>>

    @POST("messages")
    suspend fun sendMessage(
        @Body message: Message
    ): Response<Message>

    @POST("reviews")
    suspend fun submitReview(
        @Body review: Review
    ): Response<Review>
}