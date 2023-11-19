package com.aliz.soccertable.presentation.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aliz.soccertable.domain.scheduled.ScheduledData

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ScheduledList(schedules: List<ScheduledData>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(vertical = 10.dp).padding(top = 28.dp)) {
        items(schedules) { schedule -> MatchCard(schedule = schedule) }
    }
}