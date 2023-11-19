package com.aliz.soccertable.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aliz.soccertable.presentation.screens.home.HomeScreen
import com.aliz.soccertable.presentation.screens.home.HomeUiState
import com.aliz.soccertable.presentation.screens.home.HomeViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(navController = navController, startDestination = startDestination) {
        homeRoute()
    }
}


@RequiresApi(Build.VERSION_CODES.O)
fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {
        val viewModel = hiltViewModel<HomeViewModel>()
        val state by viewModel.state.collectAsState()
        HomeScreen(viewModel = viewModel, state = state)
    }
}