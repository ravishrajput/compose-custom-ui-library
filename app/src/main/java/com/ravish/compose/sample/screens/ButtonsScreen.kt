package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ravish.compose.customuilibrary.Button
import com.ravish.compose.customuilibrary.theme.ThemeColor

@Composable
fun ButtonScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First Screen\n" +
                    "Click button to go to Second Screen",
            color = ThemeColor,
            style = TextStyle(textAlign = TextAlign.Center),
            modifier = Modifier.padding(24.dp)
        )
        Button(onClick = {}, text = "Navigate")
    }
}

@Composable
@Preview
private fun ProfilePreview() {
    ButtonScreen()
}