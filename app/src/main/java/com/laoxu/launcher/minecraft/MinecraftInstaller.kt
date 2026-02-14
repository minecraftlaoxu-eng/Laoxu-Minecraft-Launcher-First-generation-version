package com.laoxu.launcher.minecraft

import android.content.Context

class MinecraftInstaller(private val context: Context) {
    fun launch(version: String) {
        // TODO: 检查 .minecraft/versions/version 是否存在
        // 若不存在可提示用户先安装或自动下载
    }
}
