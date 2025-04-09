// ui/components/NavigationButton.kt
package ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun NavigationButton(
    navController: NavController,
    label: String,
    destination: String
) {
    Button(onClick = { navController.navigate(destination) }) {
        Text(text = label)
    }
}
