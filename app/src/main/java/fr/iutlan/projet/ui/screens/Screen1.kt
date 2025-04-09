package ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ui.components.BottomBar
import ui.components.NavigationButton
import ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text("Screen 1")
            NavigationButton(navController, "Next →", "screen2")
            NavigationButton(navController, "← Back", "home")
        }
    }
}
