package com.ravish.compose.customuilibrary

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.ravish.compose.customuilibrary.theme.ThemeColor

@Composable
fun Button(
    onClick: () -> Unit = {},
    modifier: Modifier? = Modifier,
    enabled: Boolean = true,
    text: String,
    style: Style = Style.DEFAULT,
    colors: ButtonColors? = null,
    image: ImageVector? = null
) {
    MaterialTheme {
        val color = when (style) {
            Style.DEFAULT -> {
                ButtonDefaults.buttonColors(
                    backgroundColor = ThemeColor,
                    contentColor = Color.White
                )
            }
            Style.TEXT -> {
                ButtonDefaults.buttonColors(
                    backgroundColor = Transparent,
                    contentColor = ThemeColor
                )
            }
            Style.OUTLINED -> {
                // TODO: 31-12-2021 update styling
                ButtonDefaults.buttonColors(
                    backgroundColor = Transparent,
                    contentColor = ThemeColor,
                )
            }
        }
        Button(onClick = onClick, modifier ?: Modifier, enabled, colors = colors ?: color) {
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
}

enum class Style {
    DEFAULT,
    TEXT,
    OUTLINED
}

@Composable
@Preview
fun ButtonPreview() {
    Button(text = "Submit", style = Style.DEFAULT)
}