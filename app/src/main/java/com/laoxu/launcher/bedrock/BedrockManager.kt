package com.laoxu.launcher.bedrock

import android.content.Context
import android.content.Intent

class BedrockManager(private val context: Context) {

    fun isInstalled(): Boolean {
        return try {
            context.packageManager.getPackageInfo("com.mojang.minecraftpe", 0)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun launch() {
        val intent: Intent? = context.packageManager.getLaunchIntentForPackage("com.mojang.minecraftpe")
        intent?.let { context.startActivity(it) }
    }

    fun installAndLaunch() {
        // TODO: 调用 apk 安装脚本并安装 Bedrock
        // 安装完成后调用 launch()
    }
}
