package com.example.d2l

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon


@Composable
fun SignInPage(onSignInSuccess: () -> Unit) {
    var emailInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var viewPassword by remember { mutableStateOf(false) }
    var rememberMeChecked by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFFFFFFFF))
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_signin_gradient),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.45f),
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.TopCenter
        )

        Column(
            modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(80.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_ksu_wings),
                contentDescription = "KSU Wings Logo",
                modifier = Modifier.size(300.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Sign In",
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2e2202)
                )
                // Divider
                Box(
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 16.dp)
                        .width(65.dp)
                        .height(4.dp)
                        .background(Color(0xFFFFC629))
                )
                // Email Section
                Text(
                    text = "Email",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF000000)
                )
                Spacer(modifier = Modifier.height(4.dp))
                TextField(
                    value = emailInput,
                    onValueChange = { emailInput = it },
                    placeholder = { Text("example@domain.com", color = Color(0xFFA29E92)) },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_email),
                            contentDescription = "Email Icon",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFF534E3F),
                        unfocusedIndicatorColor = Color(0xFFC5BFAF)
                    ),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )

                Spacer(modifier = Modifier.height(16.dp))
                // Password Section
                Text(
                    text = "Password",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF000000)
                )
                Spacer(modifier = Modifier.height(4.dp))
                TextField(
                    value = passwordInput,
                    onValueChange = { passwordInput = it },
                    placeholder = { Text("Password", color = Color(0xFFA29E92)) },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_password_lock),
                            contentDescription = "Password Lock Icon",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    },
                    visualTransformation = if (viewPassword) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(onClick = { viewPassword = !viewPassword }) {
                            val iconId = if (viewPassword) R.drawable.ic_view_password else R.drawable.ic_hide_password

                            Icon(
                                painter = painterResource(id = iconId),
                                contentDescription = if (viewPassword) "Hide Password" else "Show Password",
                                modifier = Modifier.size(24.dp),
                                tint = Color.Unspecified
                            )
                        }
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color(0xFF534E3F),
                        unfocusedIndicatorColor = Color(0xFFC5BFAF)
                    ),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = rememberMeChecked,
                            onCheckedChange = { rememberMeChecked = it },
                            colors = CheckboxDefaults.colors(checkedColor = Color(0xFFA29E92))
                        )
                        Text(text = "Remember this device", fontSize = 12.sp, color = Color(0xFF2E2202))
                    }
                    TextButton(onClick = { }){
                        Text(text = "Forgot Password?", fontSize = 12.sp, color = Color(0xFFFFD560))
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { onSignInSuccess() },
                    modifier = Modifier.fillMaxWidth().height(54.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFE089))
                ) {
                    Text(
                        text = "Sign In",
                        color = Color(0xFF2E2202),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignInPagePreview() {
    // We pass an empty lambda {} because we don't need real navigation functionality just to preview the design
    SignInPage { }
}