package com.example.freelanceservicesmarketplace.model

data class Message(
    val id: Int? = null,
    val senderId: Int,
    val receiverId: Int,
    val message: String
)