package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


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


@Composable
fun PenSlider(modifier: Modifier = Modifier, name: String) {
    Column(modifier) {
        Text(text = name)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Slider(value = 1f, onValueChange = {}, modifier = Modifier.weight(.7f))
            Text(text = "100px", modifier = Modifier.weight(.3f), textAlign = TextAlign.End)
        }
    }
}