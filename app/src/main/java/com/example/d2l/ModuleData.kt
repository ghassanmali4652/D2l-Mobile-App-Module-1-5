package com.example.d2l

data class Lesson(
    val title: String,
    val url: String
)

data class ModulePage(
    val title: String,
    val titleSizeSp: Int,
    val underlineWidthDp: Int,
    val lessons: List<Lesson>
)

object CourseModules {
    val module1 = ModulePage(
        title = "L1: Course Intro",
        titleSizeSp = 28,
        underlineWidthDp = 211,
        lessons = listOf(
            Lesson("Course Intros", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732932/View"),
            Lesson("Kotlin Basics", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732933/View"),
            Lesson("Lab", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732934/View"),
            Lesson("Introduction to Kotlin", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732968/View")
        )
    )

    val module2 = ModulePage(
        title = "L2: Functions",
        titleSizeSp = 28,
        underlineWidthDp = 183,
        lessons = listOf(
            Lesson("Slides", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732935/View"),
            Lesson("Lab", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732963/View"),
            Lesson("Function - Meetings and\nRecordings", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732969/View")
        )
    )

    val module3 = ModulePage(
        title = "L3: Class and Objects",
        titleSizeSp = 26,
        underlineWidthDp = 286,
        lessons = listOf(
            Lesson("Lecture Video - Classes &\nObjects", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732931/View"),
            Lesson("Slides", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732936/View"),
            Lesson("Lab", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732962/View")
        )
    )

    val module4 = ModulePage(
        title = "L4: Build your first Android App",
        titleSizeSp = 20,
        underlineWidthDp = 318,
        lessons = listOf(
            Lesson("Slides", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732937/View"),
            Lesson("Sample App: Dice Roller\nApp", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732938/View"),
            Lesson("Lab", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732961/View")
        )
    )

    val module5 = ModulePage(
        title = "L5: Layouts",
        titleSizeSp = 28,
        underlineWidthDp = 151,
        lessons = listOf(
            Lesson("Slides", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732939/View"),
            Lesson("Sample App: Tip Calculator", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732940/View"),
            Lesson("Lab", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/61732960/View"),
            Lesson("Layouts - Lecture Video Part 1", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/62109647/View"),
            Lesson("Layouts - Lecture Video Part 2", "https://kennesaw.view.usg.edu/d2l/le/content/3992019/viewContent/62109651/View")
        )
    )
}
