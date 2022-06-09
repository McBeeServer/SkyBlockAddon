package fun.mcbee.plugin.skyblockaddon.Listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class DisabledMobs implements Listener {

    @EventHandler
    public void onPhantomSpawn(CreatureSpawnEvent e) {
        if (e.getEntityType() == EntityType.PHANTOM) {
            e.setCancelled(true);
        }
    }
}
