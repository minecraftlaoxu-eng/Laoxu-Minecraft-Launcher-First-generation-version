package com.laoxu.launcher.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.laoxu.launcher.core.LauncherManager
import com.laoxu.launcher.minecraft.VersionRepository
import com.laoxu.launcher.ui.components.GameCard
import com.laoxu.launcher.ui.components.InstallButton
import android.content.Context
import kotlinx.coroutines.*

@Composable
fun JavaScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val launcher = LauncherManager(context)
    var versions by remember { mutableStateOf(listOf<String>()) }

    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            versions = VersionRepository().fetchVersionList()
        }
    }

    LaoxuTheme {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Button(onClick = onBack) { Text("Back") }
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(versions) { version ->
                    GameCard(version = version) {
                        launcher.launchJava(version)
                    }
                }
            }
        }
    }
}
