package com.example.pikstudio.ui.studio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.studio.components.BottomTools
import com.example.pikstudio.ui.studio.components.Canvas
import com.example.pikstudio.ui.studio.components.TopTools
import com.example.pikstudio.ui.theme.PiKStudioTheme


@Composable
fun StudioScreen() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        TopTools(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        )

        Canvas(
            Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )

        BottomTools(Modifier.fillMaxWidth())

    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    PiKStudioTheme {
        StudioScreen()
    }
}