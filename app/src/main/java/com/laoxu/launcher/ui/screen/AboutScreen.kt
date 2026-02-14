package com.laoxu.launcher.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.laoxu.launcher.config.AboutInfo

@Composable
fun AboutScreen(onBack: () -> Unit) {
    LaoxuTheme {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Button(onClick = onBack) { Text("Back") }
            Spacer(modifier = Modifier.height(16.dp))
            Text(AboutInfo.title, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(AboutInfo.content, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
