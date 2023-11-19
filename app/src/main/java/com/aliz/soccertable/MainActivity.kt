package com.aliz.soccertable

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.aliz.soccertable.navigation.Screen
import com.aliz.soccertable.navigation.SetupNavGraph
import com.aliz.soccertable.ui.theme.SoccerTableTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoccerTableTheme {
                val navController = rememberNavController()
                SetupNavGraph(startDestination = Screen.Home.route, navController = navController)
            }
        }
    }
}