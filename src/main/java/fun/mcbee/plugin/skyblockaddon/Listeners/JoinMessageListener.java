package fun.mcbee.plugin.skyblockaddon.Listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinMessageListener implements Listener {
// implements Listener -> It starts on server startup mostly ussed for (Events)

    @EventHandler
    private void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.of("#738291")+"» "+ ChatColor.of("#FFBF00")+ p.getDisplayName()+ ChatColor.of("#F28C28")+ " joined ");
        Location l = p.getWorld().getSpawnLocation();
        p.teleport(l);

    }

    @EventHandler
    private void onLeave(PlayerQuitEvent e1){
        Player p = e1.getPlayer();
        e1.setQuitMessage(ChatColor.of("#738291")+"» "+ChatColor.of("#FFBF00")+ p.getDisplayName()+ ChatColor.of("#F28C28")+ " left! ");
    }
}
