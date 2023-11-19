package com.aliz.soccertable.presentation.screens.home

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aliz.soccertable.domain.scheduled.lazySchedule
import com.aliz.soccertable.domain.table.lazyTable
import com.aliz.soccertable.presentation.components.Footer
import com.aliz.soccertable.presentation.components.Headers
import com.aliz.soccertable.presentation.components.LeagueSelect
import com.aliz.soccertable.presentation.components.ScheduledList
import com.aliz.soccertable.presentation.components.TableList

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(state: HomeUiState, viewModel: HomeViewModel) {
    val teamsData = lazyTable
    val scheduleData = lazySchedule
    Scaffold(
        topBar = { Headers() },
        bottomBar = { Footer(viewModel = viewModel, state = state) }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 66.dp)
                .background(color = Color(0xFF2F343A)),
        ) {
            LeagueSelect()
            when {
                state.table -> {
                    TableList(teams = teamsData)
                }

                state.schedule -> {
                    ScheduledList(schedules = scheduleData)
                }
            }
        }

    }
}
