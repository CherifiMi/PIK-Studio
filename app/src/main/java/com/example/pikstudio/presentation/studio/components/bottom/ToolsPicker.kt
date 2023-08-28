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
import androidx.compose.ui.res.painterResource
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
            ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}
            Spacer(modifier = Modifier.size(8.dp))
            ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}
        }

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}

        ToolBtnsBorder()

        ToolBtn(painterResource(id = R.drawable.pen), 40.dp, 18.dp, true) {}

    }
}
