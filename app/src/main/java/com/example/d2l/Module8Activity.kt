package com.example.d2l

/**
 * Module 8 screen
 * Hosts ModuleScreen
 * Content defined in CourseModulesExtended.module8
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

class Module8Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                ModuleScreen(module = CourseModulesExtended.module8, onBack = { finish() })
            }
        }
    }
}