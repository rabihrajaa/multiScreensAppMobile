package ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavController) {
    TopAppBar(
        title = { Text("MultiScreens App") },
        actions = {
            TextButton(onClick = { navController.navigate("home") }) {
                Text("Home", color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    )
}
