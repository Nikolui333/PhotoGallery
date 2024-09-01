package com.example.photogallery.model

data class Photo(
    val id: String,
    val title: String,
    val url: String,
    val description: String? = null
)