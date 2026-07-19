package com.example.d2l

/**
 * Module 12 screen
 * Hosts ModuleScreen
 * Content defined in CourseModulesExtended.module12.
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

class Module12Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                ModuleScreen(module = CourseModulesExtended.module12, onBack = { finish() })
            }
        }
    }
}