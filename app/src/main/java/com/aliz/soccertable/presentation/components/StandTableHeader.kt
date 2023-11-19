package com.aliz.soccertable.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StandTableHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(23.dp)
            .background(color = Color(0xFF4B5665), shape = RoundedCornerShape(size = 3.dp)),
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "TEAM",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )

        }
        Row(
            modifier = modifier
                .weight(1f)
                .padding(start = 4.dp, end = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "MP",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "W",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "D",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "L",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "GF",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "GA",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "GD",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )
            Text(
                text = "Pts",
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFE500),

                    )
            )

        }
    }
}