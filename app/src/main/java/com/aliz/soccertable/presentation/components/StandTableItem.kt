package com.aliz.soccertable.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aliz.soccertable.R
import com.aliz.soccertable.domain.table.TableData

@Composable
fun StandTableItem(
    team: TableData, modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(16.dp)
            .background(color = Color(0xFF3C444F)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = modifier
                .weight(1f)
                .padding(start = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {
            Text(
                text = team.ranking.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                ),
                modifier = Modifier.padding(end = 15.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.fortalezalogo),
                contentDescription = "fff",
                modifier = modifier
                    .background(color = Color(0xFFFFF597))
                    .padding(start = 2.dp, end = 2.dp)
            )
            Text(
                text = team.teamName,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                ),
                modifier = modifier.padding(start = 10.dp)
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
                text = team.mp.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.w.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.d.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.l.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.gf.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.ga.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.gd.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),

                    )
            )
            Text(
                text = team.pts.toString(),
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )

        }
    }


}