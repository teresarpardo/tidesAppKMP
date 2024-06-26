
import androidx.compose.runtime.Composable
import di.appModule
import nav.DashboardNavHost
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import theme.Theme

@Composable
@Preview
fun App() {
    KoinApplication(
        application = { modules(appModule()) }
    ) {
        Theme {
            DashboardNavHost()
        }
    }
}
