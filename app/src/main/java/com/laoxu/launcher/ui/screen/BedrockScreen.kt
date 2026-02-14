package com.laoxu.launcher.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.laoxu.launcher.bedrock.BedrockManager
import com.laoxu.launcher.ui.components.InstallButton

@Composable
fun BedrockScreen(onBack: () -> Unit, context: Context) {
    val bedrockManager = remember { BedrockManager(context) }
    var installed by remember { mutableStateOf(bedrockManager.isInstalled()) }

    LaoxuTheme {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Button(onClick = onBack) { Text("Back") }
            Spacer(modifier = Modifier.height(16.dp))
            if (installed) {
                InstallButton("Launch Bedrock") { bedrockManager.launch() }
            } else {
                InstallButton("Install & Launch") {
                    bedrockManager.installAndLaunch()
                    installed = true
                }
            }
        }
    }
}
