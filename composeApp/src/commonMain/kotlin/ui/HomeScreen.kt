package ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import nav.DashboardDirections

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the home weather screen")

        Button(
            onClick = { navController.navigate(DashboardDirections.DETAILS.name) }
        ) {
            Text("Navigate to weather details")
        }
    }
}
