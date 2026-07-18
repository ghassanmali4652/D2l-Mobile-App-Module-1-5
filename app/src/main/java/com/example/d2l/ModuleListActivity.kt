package com.example.d2l

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.d2l.ui.theme.D2lTheme

/**
 * Screen of the list of modules
 */

class ModuleListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            D2lTheme {
                ModuleListScreen(
                    entries = listOf(
                        ModuleListEntry("Learning Module 1", MainActivity::class.java),
                        ModuleListEntry("Learning Module 2", Module2Activity::class.java),
                        ModuleListEntry("Learning Module 3", Module3Activity::class.java),
                        ModuleListEntry("Learning Module 4", Module4Activity::class.java),
                        ModuleListEntry("Learning Module 5", Module5Activity::class.java)
                        // Will dd the rest as they get built
                        // Follow same layout as the ones above
                    ),
                    onSelect = { entry ->
                        startActivity(Intent(this, entry.activityClass))
                    },
                    onBack = { finish() }
                )
            }
        }
    }
}