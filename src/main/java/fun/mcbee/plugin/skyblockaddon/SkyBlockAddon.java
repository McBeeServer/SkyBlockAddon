package fun.mcbee.plugin.skyblockaddon;

import fun.mcbee.plugin.skyblockaddon.Listeners.JoinMessageListener;
import fun.mcbee.plugin.skyblockaddon.Listeners.ScoreBoard;
import fun.mcbee.plugin.skyblockaddon.commands.HatCommand;
import fun.mcbee.plugin.skyblockaddon.commands.SpawnCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlockAddon extends JavaPlugin {
        private static SkyBlockAddon instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new JoinMessageListener(), this);

        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("hat").setExecutor(new HatCommand());

    }

    @Override
    public void onDisable() {}

    public static SkyBlockAddon getInstance() {
        return instance;
    }
}
