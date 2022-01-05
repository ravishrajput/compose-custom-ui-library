package com.ravish.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ravish.compose.customuilibrary.ListItemView
import com.ravish.compose.customuilibrary.R
import com.ravish.compose.customuilibrary.theme.ComposeCustomUILibraryTheme

@Composable
fun ListItemViewScreen() {
    ComposeCustomUILibraryTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(text = "List Item View: ", Modifier.padding(20.dp))
                LazyColumn {
                    items(20) { i ->
                        ListItemView(
                            painterResource(id = R.drawable.jetpack_compose),
                            "Title $i",
                            "SubTitle",
                            "This is Dummy description text..."
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun ListItemViewPreview() {
    ListItemViewScreen()
}