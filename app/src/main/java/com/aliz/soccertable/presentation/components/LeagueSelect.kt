package com.aliz.soccertable.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aliz.soccertable.R

@Composable
fun LeagueSelect() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(38.dp)
            .background(color = Color(0xFFD52925)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.left_arrow),
            contentDescription = "left_arrow",
            modifier = Modifier.padding(start = 7.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(3.dp) ) {
            Image(
                painter = painterResource(id = R.drawable.brazilseriea1),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds, modifier = Modifier
                    .width(27.dp)
                    .height(27.dp)
            )
            Text(
                text = "Brazilian Serie A",
                style = TextStyle(
                    fontSize = 13.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Justify,
                ),
            )
        }

        Image(
            painter = painterResource(id = R.drawable.right_arrow),
            contentDescription = "right_arrow",
            modifier = Modifier.padding(end = 7.dp)
        )

    }

}
