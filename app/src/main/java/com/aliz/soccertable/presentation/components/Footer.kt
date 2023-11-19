package com.aliz.soccertable.presentation.components

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aliz.soccertable.R
import com.aliz.soccertable.presentation.screens.home.HomeUiState
import com.aliz.soccertable.presentation.screens.home.HomeViewModel

@Composable
fun Footer(viewModel: HomeViewModel, state: HomeUiState) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp)
            .background(color = Color(0xFF1E232A)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(color = Color(0xFF303741))
                .width(191.dp)
                .height(33.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.left_arrow),
                contentDescription = "left_arrow",
                modifier = Modifier
                    .align(
                        Alignment.CenterStart
                    )
                    .padding(start = 8.dp)
                    .clickable { viewModel.updateUi() }
            )
            Text(
                text = if (state.table) {
                    "Table"
                } else {
                    "Schedule"
                },
                style = TextStyle(
                    fontSize = 13.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Justify,
                ), modifier = Modifier.align(Alignment.Center)
            )
            Image(
                painter = painterResource(id = R.drawable.right_arrow),
                contentDescription = "right_arrow",
                modifier = Modifier
                    .align(
                        Alignment.CenterEnd
                    )
                    .padding(end = 8.dp)
                    .clickable { viewModel.updateUi() }
            )
        }
    }
}