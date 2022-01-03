package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ravish.compose.customuilibrary.Button
import com.ravish.compose.customuilibrary.Style

@Composable
fun ButtonScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "DEFAULT")
        Row {
            Button(onClick = {}, text = "Submit")
            Button(onClick = {}, text = "Submit", enabled = false)
        }
        Row {
            Button(onClick = {}, text = "Favourite", image = Icons.Filled.Favorite)
            Button(onClick = {}, text = "Favourite", enabled = false, image = Icons.Filled.Favorite)
        }

        Text(text = "TEXT")
        Row {
            Button(onClick = {}, text = "Text Button", style = Style.TEXT)
            Button(onClick = {}, text = "Text Button", enabled = false, style = Style.TEXT)
        }
        Row {
            Button(
                onClick = {},
                text = "Favourite",
                image = Icons.Filled.Favorite,
                style = Style.TEXT
            )
            Button(
                onClick = {},
                text = "Favourite",
                enabled = false,
                image = Icons.Filled.Favorite,
                style = Style.TEXT
            )
        }

        Text(text = "OUTLINED")
        Row {
            Button(onClick = {}, text = "Cancel", style = Style.OUTLINED)
            Button(onClick = {}, text = "Cancel", enabled = false, style = Style.OUTLINED)
        }
        Row {
            Button(
                onClick = {},
                text = "Favourite",
                image = Icons.Filled.Favorite,
                style = Style.OUTLINED
            )
            Button(
                onClick = {},
                text = "Favourite",
                enabled = false,
                image = Icons.Filled.Favorite,
                style = Style.OUTLINED
            )
        }
    }
}

@Composable
@Preview
private fun ProfilePreview() {
    Surface(color = MaterialTheme.colors.background) {
        ButtonScreen()
    }
}