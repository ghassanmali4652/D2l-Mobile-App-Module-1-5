package com.example.d2l

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.d2l.ui.theme.D2lTheme

/**
 * App entry point.
 *
 * Handles the Welcome -> Sign In flow with simple Compose state
 * (no navigation graph needed for two screens). Once sign-in succeeds,
 * control is handed off to HomeActivity, which is the root of the
 * rest of the app's Activity-based navigation.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WelcomeToSignInFlow(
                        onSignInSuccess = {
                            startActivity(Intent(this, HomeActivity::class.java))
                            finish() // Don't keep Welcome/Sign In on the back stack
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun WelcomeToSignInFlow(onSignInSuccess: () -> Unit) {
    var showSignIn by remember { mutableStateOf(false) }

    if (!showSignIn) {
        OnboardingPage(onFinished = { showSignIn = true })
    } else {
        SignInPage(onSignInSuccess = onSignInSuccess)
    }
}
