package com.example.pikstudio.presentation.studio

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.Log
import android.view.GestureDetector.OnDoubleTapListener
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.studio.components.*
import com.example.pikstudio.ui.theme.*


@Composable
fun StudioScreen() {

    val haptics = LocalHapticFeedback.current

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            TitleBar(
                Modifier.fillMaxWidth()
            )
            ToolsTabs(
                Modifier
                    .fillMaxWidth()
                    .height(96.dp)
                    .padding(horizontal = 16.dp)
            )
        }
        //_________________--
        var scale by remember { mutableStateOf(1f) }
        var rotation by remember { mutableStateOf(0f) }
        var offset by remember { mutableStateOf(Offset.Zero) }
        val state = rememberTransformableState { zoomChange, offsetChange, rotationChange ->
            scale *= zoomChange
            rotation += rotationChange
            offset += offsetChange
        }

        Box(
            Modifier
                .clip(RoundedCornerShape(0))
                .fillMaxWidth()
                .aspectRatio(1f)
        ) {

            Box(
                Modifier
                    .fillMaxSize()
                    .graphicsLayer(
                        scaleX = scale,
                        scaleY = scale,
                        rotationZ = rotation,
                        translationX = offset.x,
                        translationY = offset.y
                    )
                    .transformable(state = state)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onDoubleTap = {
                                haptics.performHapticFeedback(HapticFeedbackType.LongPress)

                                scale = 1f
                                rotation = 0f
                                offset = Offset.Zero

                            }
                        )
                    }
            ) {
                val bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888)
                val canvas = Canvas(bitmap)

                canvas.drawPixel(0, 0, Red)
                canvas.drawPixel(0, 1, Color.Green)
                canvas.drawPixel(0, 2, Blu)
                canvas.drawPixel(0, 3, Color.Black)


                canvas.drawPixel(1, 0, Color.Green)
                canvas.drawPixel(2, 0, Blu)
                canvas.drawPixel(3, 0, Color.Black)

                Image(
                    modifier = Modifier.fillMaxSize(),
                    bitmap = bitmap.asImageBitmap(),
                    contentDescription = null
                )

                Canvas(Modifier.fillMaxSize()) {
                    Grid(40, 40)
                }
            }
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
    p.setColor(color.toArgb())
    this.drawRect(x, y, x + 10f, y + 10f, p)
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    PiKStudioTheme {
        StudioScreen()
    }
}