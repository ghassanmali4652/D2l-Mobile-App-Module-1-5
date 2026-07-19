package com.example.courseapp.data.model

data class CourseModule(
    val id: String,          // e.g., "L6"
    val title: String,       // e.g., "App Navigation"
    val resources: List<ResourceLink>
)