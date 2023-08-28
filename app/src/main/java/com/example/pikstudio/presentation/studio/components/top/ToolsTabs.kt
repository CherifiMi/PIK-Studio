package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
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
import com.example.pikstudio.ui.theme.Blu

@Composable
fun ToolsTabs(modifier: Modifier = Modifier) {
    Row(
        modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp, true, Blu){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}
        }

        ToolBtnsBorder()

        Row {
            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}
        }

        ToolBtnsBorder()

        Row {
            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}

            Spacer(modifier = Modifier.size(8.dp))

            ToolBtn(painterResource(id = R.drawable.pen), 36.dp, 16.dp){}
        }
    }
}

