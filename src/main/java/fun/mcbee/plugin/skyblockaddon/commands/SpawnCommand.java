package fun.mcbee.plugin.skyblockaddon.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        Player player = (Player) sender;

        player.teleport(Bukkit.getWorld("world").getSpawnLocation());


        return false;
    }

}
