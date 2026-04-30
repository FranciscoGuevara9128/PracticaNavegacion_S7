package com.example.loging1.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.loging1.ui.screen.Content
import com.example.loging1.ui.screen.DetailView
import com.example.loging1.ui.screen.LoginScreen

@Composable
fun AppNavigation(modifier: Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = LoginScreen,
        modifier = modifier.fillMaxSize()
    ) {
        composable<LoginScreen> {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(TaskScreen)
                }
            )
        }

        composable<TaskScreen> {
            Content(
                tab = 0,
                onNavigationToDetail = {
                    navController.navigate(DetailScreen(1))
                }
            )
        }

        composable<DetailScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<DetailScreen>()
            DetailView(
                args.userId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}