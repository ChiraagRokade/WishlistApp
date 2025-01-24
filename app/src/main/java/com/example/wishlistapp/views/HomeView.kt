package com.example.wishlistapp.views

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun HomeView(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            AppBarView(
                title = "Wishlist",
                {
                    Toast.makeText(context, "Back Button Clicked", Toast.LENGTH_SHORT).show()
                }
            )
        },
        modifier = modifier
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize().padding(it)){
        }
    }
}