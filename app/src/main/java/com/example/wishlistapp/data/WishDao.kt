package com.example.wishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    abstract suspend fun addWish(wishEntity: Wish)

    @Update
    abstract suspend fun updateWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteWish(wishEntity: Wish)

    @Query("SELECT * FROM `wish_table` WHERE id = :id")
    abstract fun getWishById(id: Long): Wish?

    @Query("SELECT * FROM `wish_table`")
    abstract fun getAllWishes(): List<Wish>
}