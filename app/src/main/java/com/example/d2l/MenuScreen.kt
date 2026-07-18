package com.example.d2l

import androidx.activity.compose.BackHandler
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Reusable menu screen: title with gold underline, stacked list of buttons,
 * and back link at the bottom of the page
 *
 * Styling only lives here
 */

private val PageBackground = Color.White
private val MainText = Color(0xFF1A1A1A)
private val AccentYellow = Color(0xFFF4C542)
private val LegacyBlack = Color(0xFF2D2926)

data class MenuOption(
    val label: String,
    val filled: Boolean = true,
    val onClick: () -> Unit
)

@Composable
fun MenuScreen(
    title: String,
    titleSizeSp: Int = 28,
    underlineWidthDp: Int = 130,
    options: List<MenuOption>,
    onBack: (() -> Unit)? = null
) {
    onBack?.let { BackHandler(onBack = it) }

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
        ) {
            Text(
                text = title,
                color = MainText,
                fontSize = titleSizeSp.sp,
                lineHeight = 34.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )

            Box(
                modifier = Modifier
                    .width(underlineWidthDp.dp)
                    .height(8.dp)
                    .background(AccentYellow)
            )

            Spacer(modifier = Modifier.height(25.dp))

            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                options.forEach { option -> MenuButtonRow(option) }
            }
        }

        if (onBack != null) {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .clickable(onClick = onBack)
                    .padding(vertical = 4.dp, horizontal = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "←", color = Color(0xFF2C2C2C), fontSize = 28.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Back", color = Color(0xFF2C2C2C), fontSize = 20.sp, fontWeight = FontWeight.Normal)
            }
        }
    }
}

@Composable
private fun MenuButtonRow(option: MenuOption) {
    val backgroundColor = if (option.filled) LegacyBlack else PageBackground
    val textColor = if (option.filled) AccentYellow else MainText

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeightIn(min = 56.dp)
            .background(backgroundColor, RoundedCornerShape(10.dp))
            .let { base ->
                if (!option.filled) base.border(2.dp, MainText, RoundedCornerShape(10.dp)) else base
            }
            .clickable(onClick = option.onClick)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = option.label,
            color = textColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
