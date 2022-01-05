package com.ravish.compose.customuilibrary

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.window.DialogProperties

@Composable
fun AppDialog(
    openDialogState: MutableState<Boolean>,
    title: String,
    message: String,
    properties: DialogProperties
) {
    AlertDialog(
        onDismissRequest = {
            openDialogState.value = false
        },
        title = { Text(text = title) },
        text = { Text(message) },
        confirmButton = {
            Button(onClick = {
                openDialogState.value = false
            }, text = "Ok", style = Style.TEXT)
        },
        dismissButton = {
            Button(onClick = {
                openDialogState.value = false
            }, text = "Cancel", style = Style.TEXT)
        },
        properties = properties
    )
}