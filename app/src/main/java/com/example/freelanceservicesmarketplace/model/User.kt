package com.example.freelanceservicesmarketplace.model

data class User(
    val id: Int? = null,
    val name: String,
    val email: String,
    val password: String,
    val role: String
)