// ui/components/BottomBar.kt
package ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {
    BottomAppBar {
        Button(onClick = { navController.navigate("home") }) {
            Text("Home")
        }
        Button(onClick = { navController.navigate("screen2") }) {
            Text("Screen 2")
        }
    }
}
