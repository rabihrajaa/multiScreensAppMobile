package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost as ComposeNavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ui.screens.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // Correct usage of NavHost here
    ComposeNavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("screen1") { Screen1(navController) }
        composable(
            "screen2/{param}",
            arguments = listOf(navArgument("param") { type = NavType.StringType })
        ) { backStackEntry ->
            Screen2(navController, backStackEntry)
        }
        composable("screen3") { Screen3(navController) }
    }
}
