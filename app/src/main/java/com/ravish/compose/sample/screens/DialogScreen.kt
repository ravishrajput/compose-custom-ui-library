package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.DialogProperties
import com.ravish.compose.customuilibrary.AppDialog
import com.ravish.compose.customuilibrary.Button
import com.ravish.compose.customuilibrary.theme.ComposeCustomUILibraryTheme

@Composable
fun DialogScreen() {
    ComposeCustomUILibraryTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(modifier = Modifier.fillMaxSize()) {
                val openDialogState = remember { mutableStateOf(false) }
                Button(onClick = {
                    openDialogState.value = true
                }, text = "Show Dialog")
                if (openDialogState.value) {
                    AppDialog(
                        openDialogState = openDialogState,
                        title = "Alert",
                        message = "This is Alert Dialog Demo",
                        DialogProperties(false, false)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun DialogScreenPreview() {
    DialogScreen()
}