package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.sp
import com.example.pikstudio.ui.theme.Blu
import com.example.pikstudio.ui.theme.LightBlack


@Composable
fun SizeSmoothnessPicker(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        PenSlider(name = "Size", modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.size(8.dp))
        PenSlider(name = "Smoothness", modifier = Modifier.weight(1f))
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PenSlider(modifier: Modifier = Modifier, name: String) {

    val interactionSource = MutableInteractionSource()

    Column(modifier) {
        Text(text = name, color = LightBlack, fontSize = 12.sp, fontWeight = FontWeight.Light)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Slider(
                modifier = Modifier.weight(.7f),
                value = 1f,
                onValueChange = {},
                interactionSource = interactionSource,
                colors = SliderDefaults.colors(
                    thumbColor = Color.White,
                    disabledThumbColor = Color.White,
                    disabledActiveTrackColor = Blu,
                    activeTrackColor = Blu,
                    disabledInactiveTrackColor = Blu,
                    inactiveTrackColor = Blu
                ),
                thumb = {
                    SliderDefaults.Thumb(
                        interactionSource = interactionSource,
                        thumbSize = DpSize(28.dp, 28.dp),
                        colors = SliderDefaults.colors(
                            thumbColor = Color.White,
                            disabledThumbColor = Color.White
                        )
                    )
                })
            Text(
                text = "100px",
                modifier = Modifier.weight(.3f),
                textAlign = TextAlign.End,
                color = LightBlack,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light
            )
        }
    }
}