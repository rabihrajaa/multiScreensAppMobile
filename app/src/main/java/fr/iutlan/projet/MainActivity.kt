import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}
