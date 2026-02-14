package com.laoxu.launcher.minecraft

import java.net.URL
import org.json.JSONObject

class VersionRepository {

    private val manifestUrl = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"

    private val legacyVersions = listOf(
        "preclassic-mc-161648",
        "classic-0.30",
        "indev-20100223",
        "infdev-20100630",
        "alpha-v1.0.0",
        "beta-1.0",
        "1.0", "1.1", "1.2.5", "1.3.2",
        "1.4.7","1.5.2","1.6.4","1.7.10","1.8.9",
        "1.9.4","1.10.2","1.11.2","1.12.2",
        "1.13.2","1.14.4","1.15.2","1.16.5",
        "1.17.1","1.18.2","1.19.4","1.20.6",
        "1.21.11"
    )

    fun fetchVersionList(): List<String> {
        val versionList = mutableListOf<String>()
        versionList.addAll(legacyVersions)

        try {
            val jsonText = URL(manifestUrl).readText()
            val json = JSONObject(jsonText)
            val versionsArray = json.getJSONArray("versions")
            for (i in 0 until versionsArray.length()) {
                val id = versionsArray.getJSONObject(i).getString("id")
                if (!versionList.contains(id)) versionList.add(id)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return versionList
    }
}
