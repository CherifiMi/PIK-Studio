package com.example.pikstudio.presentation.studio

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.studio.components.*
import com.example.pikstudio.ui.theme.*


@Composable
fun StudioScreen() {
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

        Box(
            Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        ){
            val bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888)
            val canvas =  Canvas(bitmap)
            val paint =  Paint()

            paint.setColor(Red.toArgb())
            canvas.drawRect(Rect(0, 0, 10, 10), paint)
            paint.setColor(Purple.toArgb())
            canvas.drawRect(Rect(10, 10, 20, 20), paint)
            paint.setColor(Orange.toArgb())
            canvas.drawRect(Rect(20, 20, 30, 30), paint)
            paint.setColor(Blu.toArgb())
            canvas.drawRect(Rect(30, 30, 40, 40), paint)

            bitmap.setPixel(20, 20, Red.toArgb())


            Image(modifier = Modifier.fillMaxSize(),bitmap = bitmap.asImageBitmap(), contentDescription = null)

            Canvas(Modifier.fillMaxSize()){
                Grid(40, 40)
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

@Preview(showBackground = true)
@Composable
fun Preview() {
    PiKStudioTheme {
        StudioScreen()
    }
}