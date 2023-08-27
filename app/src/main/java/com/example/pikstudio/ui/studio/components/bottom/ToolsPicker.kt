package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ToolsPicker(modifier: Modifier = Modifier) {
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
