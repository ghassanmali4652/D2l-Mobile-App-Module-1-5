package com.example.d2l

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

data class OnboardingPage (
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)

@Composable
fun OnboardingPage(onFinished: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFFFFFFFF))
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_welcome_gradient),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().fillMaxHeight(0.55f),
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.TopCenter
        )
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(120.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_ksu_owl),
            contentDescription = "KSU Owl Logo",
            modifier = Modifier.size(384.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Welcome",
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E2202)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Lorem ipsum dolor sit amet consectetur. Lorem id sit",
                fontSize = 16.sp,
                color = Color(0xFFC5BFAF),
                lineHeight = 22.sp
            )

            Spacer(modifier = Modifier.height(56.dp))

            Button(
                onClick = { onFinished() },
                modifier = Modifier.align(Alignment.End).wrapContentWidth().height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFE089))
            ) {
                Text(
                    text = "Continue",
                    color = Color(0xFF000000),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingPagePreview() {
    // We pass an empty lambda {} because we don't need real navigation functionality just to preview the design
    OnboardingPage(onFinished = {})
}