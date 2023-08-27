package com.example.pikstudio.ui.studio.components

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.Grid(h: Int, v: Int) {
    val barWidth = .5.dp.toPx()
    drawRect(Color.LightGray, style = Stroke(barWidth))

    val verticalLines = v
    val verticalSize = size.width / (verticalLines + 1)

    repeat(verticalLines) { i ->
        val startX = verticalSize * (i + 1)
        drawLine(
            Color.LightGray,
            start = Offset(startX, 0f),
            end = Offset(startX, size.height),
            strokeWidth = barWidth
        )
    }

    val horizontalLines = h
    val horizontalSize = size.height / (horizontalLines + 1)

    repeat(horizontalLines) { i ->
        val startY = horizontalSize * (i + 1)
        drawLine(
            Color.LightGray,
            start = Offset(0f, startY),
            end = Offset(size.width, startY),
            strokeWidth = barWidth
        )
    }
}