package com.ravish.compose.customuilibrary

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ravish.compose.customuilibrary.Style.*
import com.ravish.compose.customuilibrary.theme.ThemeColor

@Composable
fun Button(
    onClick: () -> Unit,
    text: String,
    enabled: Boolean = true,
    modifier: Modifier = Modifier.padding(5.dp),
    style: Style = DEFAULT,
    image: ImageVector? = null
) {
    MaterialTheme {
        when (style) {
            DEFAULT -> {
                val color = ButtonDefaults.buttonColors(
                    backgroundColor = ThemeColor,
                    contentColor = Color.White
                )
                RenderButton(onClick, modifier, enabled, color, image, text)
            }
            TEXT -> {
                TextButton(onClick, modifier, enabled, image, text)
            }
            OUTLINED -> {
                OutlinedButton(onClick, image, text, enabled, modifier)
            }
        }
    }
}

@Composable
private fun OutlinedButton(
    onClick: () -> Unit,
    image: ImageVector?,
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier.padding(5.dp)
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        border = BorderStroke(1.dp, if (enabled) ThemeColor else Gray),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Transparent,
            contentColor = ThemeColor
        )
    ) {
        image?.let {
            Icon(
                it,
                contentDescription = "Vector Image",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        }
        Text(text)
    }
}

@Composable
private fun RenderButton(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    color: ButtonColors,
    image: ImageVector?,
    text: String
) {
    Button(onClick = onClick, modifier, enabled, colors = color) {
        image?.let {
            Icon(
                it,
                contentDescription = "Vector Image",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        }
        Text(text)
    }
}

@Composable
private fun TextButton(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    image: ImageVector?,
    text: String
) {
    TextButton(onClick = onClick, modifier = modifier, enabled = enabled) {
        image?.let {
            Icon(
                it,
                contentDescription = "Vector Image",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        }
        if (enabled) Text(text, color = ThemeColor) else Text(text)
    }
}

/**
 * Different styles for Button.
 * Create new style and include it under Style to render button based on input
 *
 * @property DEFAULT filled button with an optional icon - default theme color #E91E63.
 * @property TEXT text button with an optional icon.
 * @property OUTLINED Outlined Button with an optional icon.
 * */
enum class Style {
    DEFAULT,
    TEXT,
    OUTLINED
}

@Composable
@Preview
private fun ButtonPreview() {
    Button({}, text = "Submit", style = TEXT, enabled = false)
}