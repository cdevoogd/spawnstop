package com.cdevoogd.spawnstop;

import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class SpawnListener implements Listener {
    
    @EventHandler (priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onEntitySpawn(EntitySpawnEvent event) {
        Location location = event.getLocation();
        Environment eventSpawnDimension = location.getWorld().getEnvironment();
        double eventSpawnHeight = location.getY();
        int safeZoneBottom = 127;
        int safeZoneTop = 137;
        
        if (eventSpawnDimension == World.Environment.NETHER && eventSpawnHeight >= safeZoneBottom && eventSpawnHeight <= safeZoneTop) {
            event.setCancelled(true);
            Bukkit.getLogger().info("Stopped spawn");
        }

        
    }
}
