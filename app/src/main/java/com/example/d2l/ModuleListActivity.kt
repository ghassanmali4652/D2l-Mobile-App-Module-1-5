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
                        ModuleListEntry("Learning Module 1", Module1Activity::class.java),
                        ModuleListEntry("Learning Module 2", Module2Activity::class.java),
                        ModuleListEntry("Learning Module 3", Module3Activity::class.java),
                        ModuleListEntry("Learning Module 4", Module4Activity::class.java),
                        ModuleListEntry("Learning Module 5", Module5Activity::class.java),
                        ModuleListEntry("Learning Module 6", Module6Activity::class.java),
                        ModuleListEntry("Learning Module 7", Module7Activity::class.java),
                        ModuleListEntry("Learning Module 8", Module8Activity::class.java),
                        ModuleListEntry("Learning Module 9", Module9Activity::class.java),
                        ModuleListEntry("Learning Module 10", Module10Activity::class.java),
                        ModuleListEntry("Learning Module 11", Module11Activity::class.java),
                        ModuleListEntry("Learning Module 12", Module12Activity::class.java),
                        ModuleListEntry("Learning Module 13", Module13Activity::class.java)

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