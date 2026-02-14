package com.laoxu.launcher.runtime

class RuntimeManager {
    fun getRuntime(version: String): String {
        return RuntimeSelector.selectRuntime(version)
    }
}
