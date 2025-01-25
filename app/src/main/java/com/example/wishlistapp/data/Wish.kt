package com.example.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String="",
    val description: String="",
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Watch", description = "I want to buy a round watch"),
        Wish(title = "Phone", description = "I want to buy a new phone"),
        Wish(title = "Computer", description = "I want to buy a new computer"),
    )
}