package com.laoxu.launcher.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.laoxu.launcher.ui.theme.LaoxuTheme

@Composable
fun HomeScreen(context: Context) {
    LaoxuTheme {
        var currentScreen by remember { mutableStateOf("home") }

        when (currentScreen) {
            "home" -> Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text("Laoxu Minecraft Launcher", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(24.dp))
                Button(onClick = { currentScreen = "java" }) {
                    Text("Java Edition")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { currentScreen = "bedrock" }) {
                    Text("Bedrock Edition")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { currentScreen = "about" }) {
                    Text("About")
                }
            }
            "java" -> JavaScreen(onBack = { currentScreen = "home" })
            "bedrock" -> BedrockScreen(onBack = { currentScreen = "home" }, context = context)
            "about" -> AboutScreen(onBack = { currentScreen = "home" })
        }
    }
}
