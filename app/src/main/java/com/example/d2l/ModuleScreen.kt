package com.example.d2l

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.d2l.ui.theme.D2lTheme

private val PageBackground = Color.White
private val MainText = Color(0xFF1A1A1A)
private val LessonBackground = Color(0xFFF1F0EB)
private val LessonBorder = Color(0xFF1D1D1D)
private val AccentYellow = Color(0xFFF4C542)

@Composable
fun ModuleScreen(
    module: ModulePage,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    BackHandler(onBack = onBack)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PageBackground)
            .navigationBarsPadding()
            .padding(start = 42.dp, top = 32.dp, end = 42.dp, bottom = 48.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
                .verticalScroll(rememberScrollState())
                .padding(bottom = 72.dp)
        ) {
            Text(
                text = module.title,
                color = MainText,
                fontSize = module.titleSizeSp.sp,
                lineHeight = 34.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )

            Box(
                modifier = Modifier
                    .width(module.underlineWidthDp.dp)
                    .height(8.dp)
                    .background(AccentYellow)
            )

            Spacer(modifier = Modifier.height(25.dp))

            Column(verticalArrangement = Arrangement.spacedBy(22.dp)) {
                module.lessons.forEach { lesson ->
                    LessonCard(
                        lesson = lesson,
                        onClick = {
                            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(lesson.url))
                            context.startActivity(browserIntent)
                        }
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .clickable(onClick = onBack)
                .padding(vertical = 4.dp, horizontal = 2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "←",
                color = Color(0xFF2C2C2C),
                fontSize = 28.sp
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Back",
                color = Color(0xFF2C2C2C),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
private fun LessonCard(
    lesson: Lesson,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeightIn(min = 72.dp)
            .background(LessonBackground, RoundedCornerShape(12.dp))
            .border(2.dp, LessonBorder, RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(start = 12.dp, top = 12.dp, end = 16.dp, bottom = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DocumentIcon(
            modifier = Modifier
                .width(29.dp)
                .height(34.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = lesson.title,
            color = MainText,
            fontSize = 18.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun DocumentIcon(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val outerStroke = Stroke(width = 2.4.dp.toPx())
        val pagePath = Path().apply {
            moveTo(size.width * 0.18f, size.height * 0.06f)
            lineTo(size.width * 0.59f, size.height * 0.06f)
            lineTo(size.width * 0.83f, size.height * 0.27f)
            lineTo(size.width * 0.83f, size.height * 0.94f)
            lineTo(size.width * 0.18f, size.height * 0.94f)
            close()
        }

        drawPath(pagePath, color = Color.Black, style = outerStroke)

        val detailWidth = 2.2.dp.toPx()
        drawLine(
            color = Color.Black,
            start = Offset(size.width * 0.59f, size.height * 0.06f),
            end = Offset(size.width * 0.59f, size.height * 0.29f),
            strokeWidth = detailWidth
        )
        drawLine(
            color = Color.Black,
            start = Offset(size.width * 0.59f, size.height * 0.29f),
            end = Offset(size.width * 0.83f, size.height * 0.29f),
            strokeWidth = detailWidth
        )
        drawLine(
            color = Color.Black,
            start = Offset(size.width * 0.31f, size.height * 0.51f),
            end = Offset(size.width * 0.69f, size.height * 0.51f),
            strokeWidth = detailWidth
        )
        drawLine(
            color = Color.Black,
            start = Offset(size.width * 0.31f, size.height * 0.68f),
            end = Offset(size.width * 0.69f, size.height * 0.68f),
            strokeWidth = detailWidth
        )
    }
}

@Preview(showBackground = true, widthDp = 412, heightDp = 917)
@Composable
private fun ModuleOnePreview() {
    D2lTheme {
        ModuleScreen(module = CourseModules.module1, onBack = {})
    }
}
