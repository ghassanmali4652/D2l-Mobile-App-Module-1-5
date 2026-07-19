package com.example.courseapp.data.repository

import com.example.courseapp.data.model.CourseModule
import com.example.courseapp.data.model.LinkType
import com.example.courseapp.data.model.ResourceLink

object ModuleRepository {
    private val modules = listOf(
        CourseModule(
            id = "L6",
            title = "App Navigation",
            resources = listOf(
                ResourceLink("L6 Slides - Navigation Principles", "https://example.com/slides/l6", LinkType.SLIDES),
                ResourceLink("Sample App: AndroidTrivia-Starter", "https://github.com/example/android-trivia", LinkType.SAMPLE_APP),
                ResourceLink("L6 Video: Navigating in Compose", "https://youtube.com/example/l6-video", LinkType.VIDEO)
            )
        ),
        CourseModule(
            id = "L7",
            title = "Activity & Fragment Lifecycle",
            resources = listOf(
                ResourceLink("L7 Slides - Lifecycles", "https://example.com/slides/l7", LinkType.SLIDES),
                ResourceLink("L7 Lab: Lifecycle Logger", "https://example.com/labs/l7", LinkType.LAB)
            )
        ),

        CourseModule(
            id = "L8",
            title = "App Architecture (UI Layer)",
            resources = listOf(
                ResourceLink("L8 Slides", "https://example.com/slides/l8", LinkType.SLIDES),
                ResourceLink("Sample App: Unscramble", "https://github.com/example/unscramble", LinkType.SAMPLE_APP),
                ResourceLink("Android App Architecture (UI)", "https://example.com/docs/l8-arch", LinkType.VIDEO)
            )
        ),
        CourseModule(
            id = "L9",
            title = "App Architecture (Persistence Layer)",
            resources = listOf(
                ResourceLink("L9 Slides", "https://example.com/slides/l9", LinkType.SLIDES),
                ResourceLink("Sample App: Juice Tracker", "https://github.com/example/juice-tracker", LinkType.SAMPLE_APP),
                ResourceLink("Lecture: App Architecture", "https://youtube.com/example/l9-arch", LinkType.VIDEO),
                ResourceLink("Lecture: Persistence Layer", "https://youtube.com/example/l9-persist", LinkType.VIDEO)
            )
        ),
        CourseModule(
            id = "L10",
            title = "Advanced RecyclerView",
            resources = listOf(
                ResourceLink("L10 Slides", "https://example.com/slides/l10", LinkType.SLIDES),
                ResourceLink("Sample App: RecyclerView", "https://github.com/example/recyclerview", LinkType.SAMPLE_APP),
                ResourceLink("Quiz on RecyclerView", "https://example.com/quiz/l10", LinkType.QUIZ)
            )
        ),
        CourseModule(
            id = "L11",
            title = "Connect to the Internet",
            resources = listOf(
                ResourceLink("L11 Slides", "https://example.com/slides/l11", LinkType.SLIDES),
                ResourceLink("Sample App: MarsRealEstate", "https://github.com/example/mars-real-estate", LinkType.SAMPLE_APP),
                ResourceLink("Lecture Video P1", "https://youtube.com/example/l11-p1", LinkType.VIDEO),
                ResourceLink("Lecture Video P2", "https://youtube.com/example/l11-p2", LinkType.VIDEO)
            )
        ),
        CourseModule(
            id = "L12",
            title = "Repository Pattern and WorkManager",
            resources = listOf(
                ResourceLink("L12 Slides", "https://example.com/slides/l12", LinkType.SLIDES),
                ResourceLink("WorkManager Docs", "https://developer.android.com/workmanager", LinkType.SAMPLE_APP),
                ResourceLink("Lecture: Repository Pattern", "https://youtube.com/example/l12-repo", LinkType.VIDEO),
                ResourceLink("Lecture: WorkManager", "https://youtube.com/example/l12-work", LinkType.VIDEO)
            )
        ),
        CourseModule(
            id = "L13",
            title = "Final Project & Wrap-up",
            resources = listOf(
                ResourceLink("Final Project Guidelines", "https://example.com/docs/final-project", LinkType.SLIDES),
                ResourceLink("Submission Portal", "https://example.com/submit", LinkType.LAB)
            )
        )
    )

    fun getAllModules(): List<CourseModule> = modules

    fun getModuleById(id: String): CourseModule? {
        return modules.find { it.id.equals(id, ignoreCase = true) }
    }
}