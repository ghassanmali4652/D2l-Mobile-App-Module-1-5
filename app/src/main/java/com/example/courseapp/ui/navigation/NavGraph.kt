package com.example.courseapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.courseapp.ui.screens.dashboard.DashboardScreen
import com.example.courseapp.ui.screens.detail.ModuleDetailScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(
                onModuleClick = { moduleId ->
                    navController.navigate(Screen.ModuleDetail.createRoute(moduleId))
                }
            )
        }

        composable(
            route = Screen.ModuleDetail.route,
            arguments = listOf(navArgument("moduleId") { type = NavType.StringType })
        ) { backStackEntry ->
            val moduleId = backStackEntry.arguments?.getString("moduleId") ?: ""
            ModuleDetailScreen(
                moduleId = moduleId,
                onBackClick = {
                    navController.popBackStack() // Smoothly slides back to Dashboard
                }
            )
        }
    }
}