package com.app.randomfunfact.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun RandomFunFactsNavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN){
        //pass all the composable screens here
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen(navController)
        }

        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen(navController)
        }
    }
}