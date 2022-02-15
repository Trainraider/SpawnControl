// SPDX-License-Identifier: GPL-2.0-only
// Full license at https://spdx.org/licenses/GPL-2.0.html

package com.gmail.trainraider7.spawncontrol

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class SpawnControl : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        println("Hello world")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}