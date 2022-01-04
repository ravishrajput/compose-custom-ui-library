package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ravish.compose.customuilibrary.AppTopBar
import com.ravish.compose.customuilibrary.theme.ComposeCustomUILibraryTheme

@Composable
fun AppTopBarScreen() {
    ComposeCustomUILibraryTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(modifier = Modifier.fillMaxSize()) {
                AppTopBar("My App TopBar", navigationOnClick = {}, actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Settings, null)
                    }
                })
                Text("Application Top Bar Demo Page", modifier = Modifier.padding(20.dp))
            }
        }
    }
}

@Composable
@Preview
private fun AppTopBarScreenPreview() {
    AppTopBarScreen()
}