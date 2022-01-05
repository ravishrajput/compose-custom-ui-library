package com.ravish.compose.customuilibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItemView(
    image: Painter,
    title: String,
    subTitle: String = "",
    description: String = ""
) {
    Surface(color = MaterialTheme.colors.background) {
        Row(Modifier.padding(5.dp)) {
            Image(
                painter = image,
                modifier = Modifier
                    .size(80.dp),
                contentScale = ContentScale.Inside,
                contentDescription = "List Item Image"
            )
            Column(Modifier.fillMaxWidth()) {
                Text(
                    text = title,
                    modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = subTitle,
                    modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                    fontSize = 10.sp
                )
                Text(
                    text = description,
                    modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
@Preview
private fun ListItemViewPreview() {
    ListItemView(
        painterResource(id = R.drawable.jetpack_compose),
        "Title",
        "SubTitle",
        "This is Dummy description text..."
    )
}