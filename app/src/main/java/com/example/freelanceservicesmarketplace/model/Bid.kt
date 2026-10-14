package com.example.freelanceservicesmarketplace.model

data class Bid(
    val id: Int? = null,
    val serviceId: Int,
    val freelancerId: Int,
    val amount: Double,
    val proposal: String
)