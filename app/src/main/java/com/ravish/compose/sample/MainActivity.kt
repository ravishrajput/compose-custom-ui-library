package com.ravish.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ravish.compose.customuilibrary.theme.ComposeCustomUILibraryTheme
import com.ravish.compose.sample.screens.AppTopBarScreen
import com.ravish.compose.sample.screens.ButtonScreen
import com.ravish.compose.sample.screens.LandingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCustomUILibraryTheme {
                ComposeNavigation()
            }
        }
    }
}

@Composable
private fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "first_screen"
    ) {
        composable("first_screen") {
            LandingScreen(navController)
        }
        composable("buttons_screen") {
            ButtonScreen()
        }
        composable("app_top_bar_screen") {
            AppTopBarScreen()
        }
    }
}