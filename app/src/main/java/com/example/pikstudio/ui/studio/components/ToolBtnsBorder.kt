package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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