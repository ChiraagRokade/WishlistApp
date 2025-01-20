package com.example.wishlistapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            AppBarView(
                title = "Wishlist"
            )
        }
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()){

        }
    }
}