package com.example.d2l

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

/**
 * Home Screen
 * Uses MenuScreen for layout/styling
 */


class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                MenuScreen(
                    title = "Home",
                    underlineWidthDp = 90,
                    options = listOf(
                        MenuOption(label = "Start Here", filled = true) {
                            this@HomeActivity.startActivity(
                                Intent(this@HomeActivity, StartHereActivity::class.java)
                            )
                        },
                        MenuOption(label = "Learning Modules", filled = false) {
                            this@HomeActivity.startActivity(
                                Intent(this@HomeActivity, ModuleListActivity::class.java)
                            )
                        }
                    )
                )
            }
        }
    }
}