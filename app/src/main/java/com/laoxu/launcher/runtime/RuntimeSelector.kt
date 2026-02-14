package com.laoxu.launcher.runtime

object RuntimeSelector {
    fun selectRuntime(version: String): String {
        return when {
            version.startsWith("1.") -> "Java 17"           // Release
            version.startsWith("b") -> "Java 8"            // Beta
            version.startsWith("a") -> "Java 7"            // Alpha
            version.contains("preclassic") -> "Java 6"
            version.matches(Regex("\\d{2}w\\d{2}[a-z]?")) -> "Java 21"  // Snapshot
            else -> "Java 17"
        }
    }
}
