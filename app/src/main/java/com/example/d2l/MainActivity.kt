package com.example.d2l

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.d2l.ui.theme.D2lTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
                /*ModuleScreen(
                    module = CourseModules.module1,
                    onBack = { finish() }
                )*/
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            OnboardingPage(
                onFinished = {
                    navController.navigate("signin") {
                        popUpTo("welcome") { inclusive = true } // Keep the hardware back
                                                                        // button from returning to Onboarding Page
                    }
                }
            )
        }
        composable("signin") {
            SignInPage(
                onSignInSuccess = {
                    navController.navigate("home")
                }
            )
        }
    }
}
