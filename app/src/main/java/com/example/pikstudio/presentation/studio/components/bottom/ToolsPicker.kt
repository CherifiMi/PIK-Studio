package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.R
import com.example.pikstudio.presentation.studio.components.ToolBtn
import com.example.pikstudio.presentation.studio.components.ToolBtnsBorder

@Composable
fun ToolsPicker(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row {
            ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(painterResource(id = R.drawable.pano), 40.dp, 18.dp, true) {}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(painterResource(id = R.drawable.line), 40.dp, 18.dp, true) {}
        }

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.hand), 40.dp, 18.dp, true) {}

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.star), 40.dp, 18.dp, true) {}

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.erase), 40.dp, 18.dp, true) {}

    }
}

@Preview(showBackground = true)
@Composable
fun ToolsPickerPrev() {
    ToolsPicker(
        Modifier
            .fillMaxWidth()
            .height(88.dp)
            .padding(horizontal = 16.dp)
    )
}