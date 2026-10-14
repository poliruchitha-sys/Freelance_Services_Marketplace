package com.example.freelanceservicesmarketplace.model

data class Service(
    val id: Int? = null,
    val title: String,
    val description: String,
    val budget: Double,
    val clientId: Int? = null
)