package com.cdevoogd.spawnstop;

import org.bukkit.plugin.java.JavaPlugin;

public class SpawnStop extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SpawnListener(), this);
    }
}