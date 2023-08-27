package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopTools(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(30.dp)
                    .height(38.dp)
                    .background(Color.Blue)
            )

            Row(Modifier.wrapContentSize()) {
                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Default.Face, contentDescription = null)
                }

                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }

                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(32.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .height(96.dp)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                IconButton(modifier = Modifier
                    .size(36.dp).clip(RoundedCornerShape(8.dp))
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        modifier = Modifier.size(16.dp),
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }

                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }

                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }

            }

            Box(
                Modifier
                    .padding(12.dp)
                    .height(30.dp)
                    .border(border = BorderStroke(3.dp, Color.Gray), RoundedCornerShape(100.dp))
            )

            Row {
                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }

                Spacer(modifier = Modifier.size(8.dp))

                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }
            }


            Box(
                Modifier
                    .padding(12.dp)
                    .height(30.dp)
                    .border(border = BorderStroke(3.dp, Color.Gray), RoundedCornerShape(100.dp))
            )


            Row {
                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }

                Spacer(modifier = Modifier.size(16.dp))

                IconButton(modifier = Modifier
                    .size(36.dp)
                    .background(Color.Gray),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = null,
                        tint = Color.Blue
                    )
                }
            }
        }
    }

}