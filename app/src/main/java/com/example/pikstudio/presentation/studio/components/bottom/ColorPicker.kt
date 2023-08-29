package com.example.pikstudio.ui.studio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pikstudio.ui.theme.*

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
                .background(LightGry, RoundedCornerShape(100)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                Modifier
                    .size(64.dp)
                    .background(Color5, RoundedCornerShape(100))
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
                ColorCell(Color5List[0], true)
                ColorCell(Color5List[1])
                ColorCell(Color5List[2])
                ColorCell(Color5List[3])
                ColorCell(Color5List[4])
                ColorCell(Color5List[5])
            }
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorCell(Color5List[6])
                ColorCell(Color5List[7])
                ColorCell(Color5List[8])
                ColorCell(Color5List[9])
                ColorCell(Color5List[10])
                ColorCell(Color5List[11])
            }
        }

        Column(
            Modifier
                .height(72.dp)
                .width(52.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            for (color in ColorWheel) {
                if (color == Color5)
                    Box(
                        Modifier
                            .width(28.dp)
                            .background(color)
                            .border(
                                1.dp,
                                LightBlack, 
                                RoundedCornerShape(20)
                            )
                            .weight(1f)
                            .clip(RoundedCornerShape(20))
                    )
                else
                    Box(
                        Modifier
                            .width(22.dp)
                            .background(color)
                            /*.border(
                                .5.dp,
                                Color.White,
                                RoundedCornerShape(20)
                            )*/
                            .weight(1f)
                            .clip(RoundedCornerShape(20))
                    )
            }
        }
    }
}


@Composable
fun ColorCell(color: Color, selected: Boolean = false) {
    Box(
        Modifier
            .size(26.dp)
            .background(color, RoundedCornerShape(100)),
        contentAlignment = Alignment.Center
    ){
        if (selected){
            Box(modifier = Modifier.size(23.dp).border(3.dp, Color.White,RoundedCornerShape(100)))
            Box(modifier = Modifier.size(26.dp).border(3.dp, LightBlack,RoundedCornerShape(100)))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ColorPickerPreview() {
    ColorPicker(
        Modifier
            .fillMaxWidth()
            .height(112.dp)
            .padding(horizontal = 16.dp)
    )
}