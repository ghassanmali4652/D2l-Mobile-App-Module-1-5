package com.example.courseapp.data.model

enum class LinkType {
    SLIDES, SAMPLE_APP, VIDEO, LAB, QUIZ
}

data class ResourceLink(
    val title: String,
    val url: String,
    val type: LinkType
)