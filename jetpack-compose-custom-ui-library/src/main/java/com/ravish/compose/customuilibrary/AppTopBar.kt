package com.ravish.compose.customuilibrary

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppTopBar(
    title: String,
    navigationIcon: ImageVector = Icons.Filled.Menu,
    navigationOnClick: () -> Unit,
    actions: @Composable RowScope.() -> Unit
) {
    TopAppBar(
        elevation = 4.dp,
        title = { Text(title) },
        backgroundColor = MaterialTheme.colors.primary,
        navigationIcon = {
            IconButton(onClick = navigationOnClick) {
                Icon(navigationIcon, null)
            }
        }, actions = actions
    )
}

@Composable
@Preview
private fun AppTopBarPreview() {
    AppTopBar("My App TopBar", navigationOnClick = {}, actions = {
        IconButton(onClick = {}) {
            Icon(Icons.Filled.Settings, null)
        }
    })
}