package com.example.pikstudio.presentation.studio.components.canvas

import android.graphics.Bitmap
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalHapticFeedback
import com.example.pikstudio.presentation.studio.drawPixel
import com.example.pikstudio.presentation.studio.thing
import com.example.pikstudio.ui.studio.components.Grid
import com.example.pikstudio.ui.theme.Blu
import com.example.pikstudio.ui.theme.Red
import kotlin.math.roundToInt

@Composable
fun DrawingCanvas() {

    val haptics = LocalHapticFeedback.current

    var size by remember { mutableStateOf(0) }

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
            .onSizeChanged {
                size = it.height
            }
            .fillMaxSize()
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale,
                rotationZ = rotation,
                translationX = offset.x,
                translationY = offset.y
            )
            .transformable(state = state, enabled = thing.value)
            .pointerInput(Unit) {
                detectDragGestures { change, _ ->
                    Log.d(
                        "",
                        "${(change.position.x / size * 40).roundToInt()}  ${(change.position.y / size * 40).roundToInt()}"
                    )
                }
            }
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
        val canvas = android.graphics.Canvas(bitmap)

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

        androidx.compose.foundation.Canvas(Modifier.fillMaxSize()) {
            Grid(40, 40)
        }
    }

}