package com.example.courseapp.ui.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.courseapp.data.repository.ModuleRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(onModuleClick: (String) -> Unit) {
    val modules = ModuleRepository.getAllModules()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Course Modules") })
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(modules) { module ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onModuleClick(module.id) }
                        .padding(vertical = 8.dp)
                ) {
                    Text(
                        text = "${module.id}: ${module.title}",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                        Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(4.dp)
                            .background(Color(0xFFFFC107))
                    )
                }
            }
        }
    }
}