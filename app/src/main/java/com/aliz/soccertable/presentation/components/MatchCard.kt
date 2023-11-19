package com.aliz.soccertable.presentation.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aliz.soccertable.R
import com.aliz.soccertable.domain.scheduled.ScheduledData
import java.time.format.DateTimeFormatter


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MatchCard(schedule: ScheduledData) {

    val formatterDate = DateTimeFormatter.ofPattern("dd.MM")
    val formatterHours = DateTimeFormatter.ofPattern("HH:mm")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(91.dp)
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .background(
                color = Color(0xFF3C444F),
                shape = RoundedCornerShape(size = 3.dp)
            ),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.fortalezalogo),
                contentDescription = "lll",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = schedule.homeTeamName, style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Justify,
                )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .width(107.dp)
                    .height(24.dp)
                    .background(color = Color(0xFF4B5665), shape = RoundedCornerShape(size = 2.dp)),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = formatterDate.format(schedule.matchDate),
                    style = TextStyle(
                        fontSize = 11.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFF597),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier.align(CenterVertically)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "VS",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF8490A0),

                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier.align(CenterVertically)
                )
            }
            Row(
                modifier = Modifier
                    .width(58.dp)
                    .height(20.dp)
                    .background(color = Color(0xFF4B5665), shape = RoundedCornerShape(size = 2.dp)),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = formatterHours.format(schedule.matchDate),
                    style = TextStyle(
                        fontSize = 11.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier.align(CenterVertically)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.fortalezalogo),
                contentDescription = "lll",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = schedule.awayTeamName, style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Justify,
                )
            )
        }
    }
}