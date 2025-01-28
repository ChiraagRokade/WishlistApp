package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "title")
    val title: String="",
    @ColumnInfo(name = "description")
    val description: String="",
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Watch", description = "I want to buy a round watch"),
        Wish(title = "Phone", description = "I want to buy a new phone"),
        Wish(title = "Computer", description = "I want to buy a new computer"),
    )
}