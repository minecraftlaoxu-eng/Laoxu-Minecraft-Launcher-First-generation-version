package com.laoxu.launcher.core

import android.content.Context
import com.laoxu.launcher.minecraft.MinecraftInstaller
import com.laoxu.launcher.bedrock.BedrockManager

class LauncherManager(private val context: Context) {

    private val mcInstaller = MinecraftInstaller(context)
    private val bedrockManager = BedrockManager(context)

    fun launchJava(version: String) {
        mcInstaller.launch(version)
    }

    fun launchBedrock() {
        if (bedrockManager.isInstalled()) {
            bedrockManager.launch()
        } else {
            bedrockManager.installAndLaunch()
        }
    }
}
