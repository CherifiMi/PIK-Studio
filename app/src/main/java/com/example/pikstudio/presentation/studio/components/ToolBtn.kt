package com.example.pikstudio.presentation.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.DarkGry
import com.example.pikstudio.ui.theme.LightGry

@Composable
fun ToolBtn(icon: Painter, btnSize: Dp, iconSize: Dp, back: Boolean = false, tint: Color = DarkGry,click: () -> Unit) {
    Box(
        modifier = Modifier
            .size(btnSize)
            .clip(RoundedCornerShape(8.dp))
            .background(if (back) LightGry else Color.White)
            .clickable { click() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            painter = icon,
            contentDescription = null,
            tint = tint
        )
    }
}