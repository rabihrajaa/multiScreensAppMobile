package ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import ui.components.NavigationButton
import ui.components.TopBar
import ui.components.BottomBar
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBar(navController) },
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text("Home Screen")
            NavigationButton(navController, "Go to Screen 1", "screen1")
        }
    }
}
