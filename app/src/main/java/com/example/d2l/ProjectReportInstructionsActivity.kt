package com.example.d2l

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

/**
 * Project Instructions Screen
 * Has two link cars: Project_Instructions and Project_Proposal
 */

class ProjectInstructionsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                ModuleScreen(module = StartHereModules.projectInstructions, onBack = { finish() })
            }
        }
    }
}