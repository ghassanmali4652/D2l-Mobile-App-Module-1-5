package com.example.d2l

/**
 * Module 1 screen
 * Hosts ModuleScreen
 * Content defined in ModuleData.CourseModules.module1
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

class Module1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                ModuleScreen(module = CourseModules.module1, onBack = { finish() })
            }
        }
    }
}
