package com.example.d2l


/**
 * Content for Start Here sub-pages
 */

object StartHereModules {
    val welcome = ModulePage(
        title = "Welcome",
        titleSizeSp = 28,
        underlineWidthDp = 105,
        lessons = listOf(
            Lesson(
                "Welcome to the class",
                "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732924/View"
            )
        )
    )

    val syllabus = ModulePage(
        title = "Syllabus",
        titleSizeSp = 28,
        underlineWidthDp = 100,
        lessons = listOf(
            Lesson(
                "CS4322 Section02 Syllabus",
                "https://kennesaw.view.usg.edu/d2l/common/dialogs/quickLink/quickLink.d2l?ou=3992019&type=lti&rcode=usgq-37601663&srcou=6629&launchFramed=1&framedName=Syllabus"
            )
        )
    )

    val labReportInstructions = ModulePage(
        title = "Lab Report Instructions",
        titleSizeSp = 22,
        underlineWidthDp = 300,
        lessons = listOf(
            Lesson(
                "Lab Report Instructions",
                "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732927/View"
            )
        )
    )

    val projectInstructions = ModulePage(
        title = "Project Instructions",
        titleSizeSp = 24,
        underlineWidthDp = 280,
        lessons = listOf(
            Lesson(
                "Project_Instruction",
                "https://kennesaw.view.usg.edu/d2l/le/content/3992019/Home?itemIdentifier=D2L.LE.Content.ContentObject.ModuleCO-61732895"
            ),
            Lesson(
                "Project_Proposal",
                "https://kennesaw.view.usg.edu/d2l/le/content/3992019/Home?itemIdentifier=D2L.LE.Content.ContentObject.ModuleCO-61732895"
            )
        )
    )
}