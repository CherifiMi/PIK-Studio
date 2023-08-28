package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.Orange
import com.example.pikstudio.ui.theme.Purple
import com.example.pikstudio.ui.theme.Red

@Composable
fun TitleBar(modifier: Modifier = Modifier) {
    Column(
        modifier
            .shadow(elevation = 23.dp)
            .background(Color.White)
    ) {

        Spacer(
            Modifier
                .windowInsetsTopHeight(
                    WindowInsets.statusBars
                )
        )

        Row(
            Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .width(30.dp)
                    .height(38.dp),
                painter = painterResource(id = com.example.pikstudio.R.drawable.pik_ic),
                contentDescription = null
            )

            Row(Modifier.wrapContentSize()) {
                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        tint = Purple,
                        painter = painterResource(id = com.example.pikstudio.R.drawable.fullscreen),
                        contentDescription = null
                    )
                }


                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        tint = Red,
                        painter = painterResource(id = com.example.pikstudio.R.drawable.save),
                        contentDescription = null
                    )
                }


                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        tint = Orange,
                        painter = painterResource(id = com.example.pikstudio.R.drawable.export),
                        contentDescription = null
                    )
                }

            }
        }
    }
}
