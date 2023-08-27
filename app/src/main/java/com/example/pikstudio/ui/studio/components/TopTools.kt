package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.PiKStudioTheme

@Composable
fun TopTools(modifier: Modifier = Modifier) {
    Column(modifier) {
        FirstTopRow(
            Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(horizontal = 16.dp)
                .shadow(elevation = (-20).dp)
        )
        SecondTopRow(
            Modifier
                .fillMaxWidth()
                .height(96.dp)
                .padding(horizontal = 16.dp)
        )
    }
}

@Composable
fun FirstTopRow(modifier: Modifier = Modifier) {
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

@Composable
fun SecondTopRow(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}
        }

        ToolBtnsBorder()

        Row {
            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}
        }

        ToolBtnsBorder()

        Row {
            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(Icons.Default.Face, 36.dp, 16.dp){}
        }
    }
}


@Composable
fun ToolBtn(icon: ImageVector, btnSize: Dp, iconSize: Dp, click: () -> Unit) {
    Box(
        modifier = Modifier
            .size(btnSize)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Gray)
            .clickable { click() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = icon,
            contentDescription = null,
            tint = Color.Blue
        )
    }
}

@Composable
fun ToolBtnsBorder() {
    Box(
        Modifier
            .padding(12.dp)
            .drawBehind {
                drawRoundRect(
                    color = Color.Gray,
                    size = Size(height = 30.dp.toPx(), width = 3.dp.toPx()),
                    cornerRadius = CornerRadius(100f, 100f)
                )
            }
            .height(30.dp)
            .border(border = BorderStroke(3.dp, Color.Gray), RoundedCornerShape(100.dp))
    )
}


@Preview(showBackground = true)
@Composable
fun TopToolsPreview() {
    PiKStudioTheme {
        TopTools(Modifier.fillMaxWidth())
    }
}