package ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import ui.components.BottomBar
import ui.components.NavigationButton
import ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavController, backStackEntry: NavBackStackEntry) {
    val value = backStackEntry.arguments?.getString("param")?.toIntOrNull() ?: 0

    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text("Screen 2 — Param: $value")
            NavigationButton(navController, "Next →", "screen3")
            NavigationButton(navController, "← Back", "screen1")
        }
    }
}
