package com.example.d2l

/**
 * Content for Learning Modules 6–13
 *
 * URLs are the placeholder links
 */
object CourseModulesExtended {
    val module6 = ModulePage(
        title = "L6: App Navigation",
        titleSizeSp = 28,
        underlineWidthDp = 190,
        lessons = listOf(
            Lesson("L6 Slides - Navigation Principles", "https://example.com/slides/l6"),
            Lesson("Sample App: AndroidTrivia-Starter", "https://github.com/example/android-trivia"),
            Lesson("L6 Video: Navigating in Compose", "https://youtube.com/example/l6-video")
        )
    )

    val module7 = ModulePage(
        title = "L7: Activity & Fragment Lifecycle",
        titleSizeSp = 22,
        underlineWidthDp = 300,
        lessons = listOf(
            Lesson("L7 Slides - Lifecycles", "https://example.com/slides/l7"),
            Lesson("L7 Lab: Lifecycle Logger", "https://example.com/labs/l7")
        )
    )

    val module8 = ModulePage(
        title = "L8: App Architecture (UI Layer)",
        titleSizeSp = 22,
        underlineWidthDp = 290,
        lessons = listOf(
            Lesson("L8 Slides", "https://example.com/slides/l8"),
            Lesson("Sample App: Unscramble", "https://github.com/example/unscramble"),
            Lesson("Android App Architecture (UI)", "https://example.com/docs/l8-arch")
        )
    )

    val module9 = ModulePage(
        title = "L9: App Architecture (Persistence Layer)",
        titleSizeSp = 20,
        underlineWidthDp = 320,
        lessons = listOf(
            Lesson("L9 Slides", "https://example.com/slides/l9"),
            Lesson("Sample App: Juice Tracker", "https://github.com/example/juice-tracker"),
            Lesson("Lecture: App Architecture", "https://youtube.com/example/l9-arch"),
            Lesson("Lecture: Persistence Layer", "https://youtube.com/example/l9-persist")
        )
    )

    val module10 = ModulePage(
        title = "L10: Advanced RecyclerView",
        titleSizeSp = 24,
        underlineWidthDp = 250,
        lessons = listOf(
            Lesson("L10 Slides", "https://example.com/slides/l10"),
            Lesson("Sample App: RecyclerView", "https://github.com/example/recyclerview"),
            Lesson("Quiz on RecyclerView", "https://example.com/quiz/l10")
        )
    )

    val module11 = ModulePage(
        title = "L11: Connect to the Internet",
        titleSizeSp = 24,
        underlineWidthDp = 260,
        lessons = listOf(
            Lesson("L11 Slides", "https://example.com/slides/l11"),
            Lesson("Sample App: MarsRealEstate", "https://github.com/example/mars-real-estate"),
            Lesson("Lecture Video P1", "https://youtube.com/example/l11-p1"),
            Lesson("Lecture Video P2", "https://youtube.com/example/l11-p2")
        )
    )

    val module12 = ModulePage(
        title = "L12: Repository Pattern and WorkManager",
        titleSizeSp = 20,
        underlineWidthDp = 320,
        lessons = listOf(
            Lesson("L12 Slides", "https://example.com/slides/l12"),
            Lesson("WorkManager Docs", "https://developer.android.com/workmanager"),
            Lesson("Lecture: Repository Pattern", "https://youtube.com/example/l12-repo"),
            Lesson("Lecture: WorkManager", "https://youtube.com/example/l12-work")
        )
    )

    val module13 = ModulePage(
        title = "L13: Final Project & Wrap-up",
        titleSizeSp = 24,
        underlineWidthDp = 260,
        lessons = listOf(
            Lesson("Final Project Guidelines", "https://example.com/docs/final-project"),
            Lesson("Submission Portal", "https://example.com/submit")
        )
    )
}