package com.example.d2l

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

/**
 * Start Here screen
 * Has 4 buttons (Welcome, Syllabus, Lab Report Instruction, Project Instuctions)
 * Uses MenuScreen for layout
 */

class StartHereActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                MenuScreen(
                    title = "Start Here",
                    underlineWidthDp = 130,
                    options = listOf(
                        MenuOption(label = "Welcome") {
                            this@StartHereActivity.startActivity(
                                Intent(this@StartHereActivity, WelcomeActivity::class.java)
                            )
                        },
                        MenuOption(label = "Syllabus") {
                            this@StartHereActivity.startActivity(
                                Intent(this@StartHereActivity, SyllabusActivity::class.java)
                            )
                        },
                        MenuOption(label = "Lab Report Instructions") {
                            this@StartHereActivity.startActivity(
                                Intent(this@StartHereActivity, LabReportInstructionsActivity::class.java)
                            )
                        },
                        MenuOption(label = "Project Instructions") {
                            this@StartHereActivity.startActivity(
                                Intent(this@StartHereActivity, ProjectInstructionsActivity::class.java)
                            )
                        }
                    ),
                    onBack = { finish() }
                )
            }
        }
    }
}