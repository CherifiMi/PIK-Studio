package com.example.pikstudio.presentation.studio

import android.graphics.Canvas
import android.graphics.Paint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pikstudio.presentation.studio.components.canvas.DrawingCanvas
import com.example.pikstudio.ui.studio.components.*
import com.example.pikstudio.ui.theme.PiKStudioTheme


val thing = mutableStateOf(true)

@Composable
fun StudioScreen(viewModel: StudioViewModel = hiltViewModel()) {

    val state = viewModel.state.value

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            TitleBar(
                Modifier
                    .fillMaxWidth()
                    .clickable { thing.value = !thing.value }
            )
            ToolsTabs(
                Modifier
                    .fillMaxWidth()
                    .height(96.dp)
                    .padding(horizontal = 16.dp)
            )
        }

        Box(
            Modifier
                .clip(RoundedCornerShape(0))
                .fillMaxWidth()
                .aspectRatio(1f)
        ) {
            DrawingCanvas()
        }

        Column(Modifier.fillMaxWidth()) {
            ToolsPicker(
                Modifier
                    .fillMaxWidth()
                    .height(88.dp)
                    .padding(horizontal = 16.dp)
            )
            SizeSmoothnessPicker(
                Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(horizontal = 16.dp)
            )
            ColorPicker(
                Modifier
                    .fillMaxWidth()
                    .height(112.dp)
                    .padding(horizontal = 16.dp)
            )
        }
    }
}

fun Canvas.drawPixel(x: Int, y: Int, color: Color) {
    val y = y * 10f
    val x = x * 10f

    val p = Paint()
    p.color = color.toArgb()
    this.drawRect(x, y, x + 10f, y + 10f, p)
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    PiKStudioTheme {
        StudioScreen()
    }
}