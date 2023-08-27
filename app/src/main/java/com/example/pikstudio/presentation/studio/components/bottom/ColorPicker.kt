package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.presentation.studio.StudioScreen
import com.example.pikstudio.ui.theme.*

@Composable
fun ColorPicker(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(70.dp)
                .background(Color.Black, RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                Modifier
                    .size(64.dp)
                    .background(Color.Red, RoundedCornerShape(100))
            )
        }

        Column(
            Modifier
                .width(208.dp)
                .height(64.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
            }
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
                ColorCell()
            }
        }

        Column(
            Modifier.height(72.dp).width(52.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            for (color in ColorWeel) {
                if (color == Color3)
                    Box(
                        Modifier
                            .width(20.dp)
                            .background(color)
                            .border(
                                1.dp,
                                Color.Black,
                                RoundedCornerShape(20)
                            )
                            .weight(1f)
                            .clip(RoundedCornerShape(20))
                    )
                else
                    Box(
                        Modifier
                            .width(18.dp)
                            .background(color)
                            .border(
                                .5.dp,
                                Color.White,
                                RoundedCornerShape(20)
                            )
                            .weight(1f)
                            .clip(RoundedCornerShape(20))
                    )
            }
        }
    }
}

@Composable
fun ColorCell() {
    Box(
        Modifier
            .size(26.dp)
            .background(Color.Gray, RoundedCornerShape(100))
    )
}

@Preview(showBackground = true)
@Composable
fun ColorPickerPreview() {
    ColorPicker(
        Modifier
            .fillMaxWidth()
            .height(112.dp)
            .padding(horizontal = 16.dp)
    )
}