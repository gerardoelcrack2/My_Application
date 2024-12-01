package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.data.database.AppDatabase
import com.example.myapplication.data.database.DatabaseProvider
import com.example.myapplication.ui.screens.ComponentsScreen
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.screens.LoginScreen
import com.example.myapplication.ui.screens.ManageServiceScreen
import com.example.myapplication.ui.screens.MenuScreen

class MainActivity : ComponentActivity() {
    lateinit var database: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            database = DatabaseProvider.getDatabase(this)
            Log.d("DB", "Database loaded succesfully")
        } catch (exception: Exception) {
            Log.d("DB", "error $exception")
        }
        enableEdgeToEdge()
        setContent {
            ComposeMultiScreenApp()
        }
    }
}

@Composable
fun ComposeMultiScreenApp() {
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("components") { ComponentsScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("manage-service/{serviceId}") { backStackEntry ->
            val serviceId = backStackEntry.arguments?.getString("serviceId")
            ManageServiceScreen(navController, serviceId = serviceId)
        }
    }
}