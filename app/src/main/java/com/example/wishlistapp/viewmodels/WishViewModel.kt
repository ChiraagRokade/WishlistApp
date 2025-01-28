package com.example.wishlistapp.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wishlistapp.data.Wish
import com.example.wishlistapp.data.WishRepository
import kotlinx.coroutines.launch

class WishViewModel(
    private val wishRepository: WishRepository
):ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChanged(newTitle:String){
        wishTitleState = newTitle
    }

    fun onWishDescriptionChanged(newDescription:String){
        wishDescriptionState = newDescription
    }

    lateinit var getAllWishes: List<Wish>

    init {
        viewModelScope.launch {
            getAllWishes = wishRepository.getWished()
        }
    }

    fun addWish(wish: Wish){
        viewModelScope.launch {
            wishRepository.addWish(wish)
        }
    }

    fun updateWish(wish: Wish){
        viewModelScope.launch {
            wishRepository.updateWish(wish)
        }
    }

    fun deleteWish(wish: Wish){
        viewModelScope.launch {
            wishRepository.deleteWish(wish)
        }
    }

    fun getAWishById(id: Long): Wish?{
        return wishRepository.getAWishById(id)
    }

}