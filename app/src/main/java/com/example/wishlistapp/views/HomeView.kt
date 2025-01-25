package com.example.wishlistapp.views

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wishlistapp.data.DummyWish
import com.example.wishlistapp.data.Wish

@Composable
fun HomeView() {
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
//        modifier = modifier
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize().padding(it)){
            items(DummyWish.wishList){
                wish -> WishList(wish = wish)
            }
        }
    }
}

@Composable
fun WishList(wish: Wish){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 8.dp, end = 8.dp),
//            .clickable { onClick() },
        elevation = 15.dp,
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = wish.title,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = wish.description,
            )
        }
    }
}