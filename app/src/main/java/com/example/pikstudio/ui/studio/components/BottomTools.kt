package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                .background(Color.Blue)
                .height(64.dp)
                .padding(horizontal = 16.dp)
        )

        ThirdBottomRow(
            Modifier
                .fillMaxWidth()
                .background(Color.Green)
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
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}
        }

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}

        ToolBtnsBorder()

        ToolBtn(Icons.Default.Face, 40.dp, 18.dp){}

    }

}

@Composable
fun SecondBottomRow(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

    }
}

@Composable
fun ThirdBottomRow(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

    }
}


@Preview(showBackground = true)
@Composable
fun BottomToolsPreview() {
    PiKStudioTheme {
        BottomTools(Modifier.fillMaxWidth())
    }
}