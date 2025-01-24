package com.example.wishlistapp.views

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun HomeView(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            AppBarView(
                title = "WishList",
                {
                    Toast.makeText(context, "Back Button Clicked", Toast.LENGTH_SHORT).show()
                }
            )
        },
        floatingActionButton = {
          FloatingActionButton (
              modifier = Modifier.padding(20.dp),
              contentColor = Color.White,
              backgroundColor = Color.Black,
              onClick = {
              Toast.makeText(context, "Floating Button Clicked", Toast.LENGTH_SHORT).show()
          })
           {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
          }
        },
        modifier = modifier
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize().padding(it)){
        }
    }
}