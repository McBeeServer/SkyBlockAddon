package fun.mcbee.plugin.skyblockaddon;

import fun.mcbee.plugin.skyblockaddon.Listeners.ScoreBoard;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlockAddon extends JavaPlugin {
        private static SkyBlockAddon instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);

    }

    @Override
    public void onDisable() {}

    public static SkyBlockAddon getInstance() {
        return instance;
    }
}
