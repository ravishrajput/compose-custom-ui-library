package com.ravish.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ravish.compose.customuilibrary.Button
import com.ravish.compose.customuilibrary.theme.ComposeCustomUILibraryTheme
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
    }
}