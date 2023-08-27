package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TitleBar(modifier: Modifier = Modifier) {
    Row(
        modifier,
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
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.Face,
                    contentDescription = null
                )
            }

            Spacer(modifier = Modifier.size(8.dp))

            IconButton(modifier = Modifier
                .size(32.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.Face,
                    contentDescription = null
                )
            }

            Spacer(modifier = Modifier.size(8.dp))

            IconButton(modifier = Modifier
                .size(32.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.Face,
                    contentDescription = null
                )
            }
        }
    }
}
