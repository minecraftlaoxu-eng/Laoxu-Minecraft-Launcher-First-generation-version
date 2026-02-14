package com.laoxu.launcher.config

import android.content.Context
import java.io.File

object Config {

    // 启动器根目录
    fun getLauncherDir(context: Context): File {
        val dir = File(context.filesDir, "LaoxuLauncher")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    // 存放 Minecraft Java 版
    fun getMinecraftDir(context: Context): File {
        val dir = File(getLauncherDir(context), "mcj/.minecraft")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    // 存放 Minecraft Bedrock 版 APK
    fun getBedrockDir(context: Context): File {
        val dir = File(getLauncherDir(context), "mcb")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    // 存放不同 JDK 版本
    fun getJDKDir(context: Context): File {
        val dir = File(getLauncherDir(context), "jdk")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    // 用户缓存 / 临时数据
    fun getUserCacheDir(context: Context): File {
        val dir = File(getLauncherDir(context), "usr")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    // 存储用户偏好配置 (例如默认版本)
    var defaultJavaVersion: String = "1.20.4"
    var defaultBedrockInstalled: Boolean = false
}
