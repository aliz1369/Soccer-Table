package com.aliz.soccertable.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aliz.soccertable.domain.table.TableData


@Composable
fun TableList(teams: List<TableData>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(vertical = 10.dp).padding(top = 28.dp)) {
        item {
            StandTableHeader()
        }
        items(teams) { team -> StandTableItem(team = team) }
    }
}


