package com.example.wishlistapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wishlistapp.viewmodels.WishViewModel
import com.example.wishlistapp.views.HomeView
import com.example.wishlistapp.views.Screen
import com.example.wishlistapp.views.AddEditWishDetailView

@Composable
fun Navigation(viewModel: WishViewModel = viewModel(), navController: NavHostController = rememberNavController(),modifier: Modifier = Modifier){
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route,
        modifier = modifier
    ){
        composable(Screen.HomeScreen.route){
            HomeView(navController = navController, viewModel = viewModel)
        }
        composable(Screen.AddScreen.route){
            AddEditWishDetailView(id = 0L, viewModel = viewModel, navController = navController)
        }

    }
}