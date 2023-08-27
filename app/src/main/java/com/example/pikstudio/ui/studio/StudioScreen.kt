package com.example.pikstudio.ui.studio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.PiKStudioTheme


@Composable
fun StudioScreen() {
    Box(Modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize().align(TopCenter)) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .height(38.dp)
                        .background(Color.Blue)
                )

                Row(Modifier.wrapContentSize()) {
                    IconButton(modifier = Modifier
                        .size(32.dp),
                        onClick = { /*TODO*/ }
                    ){
                        Icon(imageVector = Icons.Default.Face, contentDescription = null)
                    }

                    Spacer(modifier = Modifier.size(8.dp))

                    IconButton(modifier = Modifier
                        .size(32.dp),
                        onClick = { /*TODO*/ }
                    ){
                        Icon(imageVector = Icons.Default.Face, contentDescription = null)
                    }

                    Spacer(modifier = Modifier.size(8.dp))

                    IconButton(modifier = Modifier
                        .size(32.dp),
                        onClick = { /*TODO*/ }
                    ){
                        Icon(imageVector = Icons.Default.Face, contentDescription = null)
                    }
                }
            }
        }

        Box(
            Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .background(Color.Blue)
                .align(Center)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    PiKStudioTheme {
        StudioScreen()
    }
}