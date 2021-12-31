package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ravish.compose.customuilibrary.Button

@Composable
fun LandingScreen(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row {
                Button(onClick = {
                    navController.navigate("buttons_screen")
                }, text = "Buttons", modifier = Modifier.padding(5.dp).fillMaxWidth(0.5f))
                Button(onClick = {
                    navController.navigate("app_top_bar_screen")
                }, text = "App Top Bar", modifier = Modifier.padding(5.dp).fillMaxWidth(1f))
            }
        }
    }
}

@Composable
@Preview
private fun LandingScreenPreview() {
    LandingScreen(rememberNavController())
}