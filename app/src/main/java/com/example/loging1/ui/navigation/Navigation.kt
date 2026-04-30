package com.example.loging1.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
object LoginScreen

@Serializable
object TaskScreen

@Serializable
data class DetailScreen(
    val userId: Int
)