package com.example.d2l

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Scrollable lis screen that shows every Learning Module as row
 * Takes a list of ModuleListEntry
 * List supplied by (ModuleListActivity)
 */

private val PageBackground = Color.White
private val MainText = Color(0xFF1A1A1A)
private val RowBackground = Color(0xFFF1F0EB)

// Is one row of the module list
data class ModuleListEntry(
    val label: String,
    val activityClass: Class<out android.app.Activity>
)

@Composable
fun ModuleListScreen(
    entries: List<ModuleListEntry>,
    onSelect: (ModuleListEntry) -> Unit,
    onBack: () -> Unit
) {
    BackHandler(onBack = onBack)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PageBackground)
            .navigationBarsPadding()
            .padding(start = 42.dp, top = 32.dp, end = 42.dp, bottom = 48.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Back link at the top of the screen
            Row(
                modifier = Modifier
                    .clickable(onClick = onBack)
                    .padding(vertical = 4.dp, horizontal = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "←", color = Color(0xFF2C2C2C), fontSize = 24.sp)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Back", color = Color(0xFF2C2C2C), fontSize = 18.sp, fontWeight = FontWeight.Normal)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                entries.forEach { entry ->
                    ModuleRow(entry = entry, onClick = { onSelect(entry) })
                }
            }
        }
    }
}

@Composable
private fun ModuleRow(entry: ModuleListEntry, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeightIn(min = 68.dp)
            .background(RowBackground, RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        FolderIcon(modifier = Modifier.width(26.dp).height(22.dp))
        Spacer(modifier = Modifier.width(14.dp))
        Text(
            text = entry.label,
            color = MainText,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun FolderIcon(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val path = Path().apply {
            moveTo(w * 0.05f, h * 0.30f)
            lineTo(w * 0.42f, h * 0.30f)
            lineTo(w * 0.52f, h * 0.44f)
            lineTo(w * 0.95f, h * 0.44f)
            lineTo(w * 0.95f, h * 0.88f)
            lineTo(w * 0.05f, h * 0.88f)
            close()
        }
        drawPath(path, color = Color.Black)
    }
}