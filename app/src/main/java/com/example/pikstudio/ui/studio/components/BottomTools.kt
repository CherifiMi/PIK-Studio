package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.PiKStudioTheme


@Composable
fun BottomTools(modifier: Modifier = Modifier) {
    Column(modifier) {
        FirstBottomRow(
            Modifier
                .fillMaxWidth()
                .height(88.dp)
                .padding(horizontal = 16.dp)
        )

        SecondBottomRow(
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


@Composable
fun FirstBottomRow(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row {
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}
        }

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp) {}

    }

}

@Composable
fun SecondBottomRow(modifier: Modifier = Modifier) {
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

        Box(Modifier.size(64.dp))

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
fun BottomToolsPreview() {
    PiKStudioTheme {
        BottomTools(Modifier.fillMaxWidth())
    }
}