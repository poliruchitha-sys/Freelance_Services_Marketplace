package com.example.freelanceservicesmarketplace.model

data class Review(
    val id: Int? = null,
    val freelancerId: Int,
    val clientId: Int,
    val rating: Float,
    val review: String
)