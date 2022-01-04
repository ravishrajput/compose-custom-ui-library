package com.ravish.compose.customuilibrary.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = ThemeColor,
    primaryVariant = ThemeColor,
    secondary = Teal200,
    background = Gray,
    surface = Gray,
)

private val LightColorPalette = lightColors(
    primary = ThemeColor,
    primaryVariant = ThemeColor,
    secondary = Teal200,
    background = White,
    surface = White
)

@Composable
fun ComposeCustomUILibraryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}