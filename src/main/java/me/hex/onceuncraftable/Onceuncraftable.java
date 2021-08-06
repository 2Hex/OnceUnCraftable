package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.Changeconfig;
import me.hex.onceuncraftable.events.Mineable;
import org.bukkit.plugin.java.JavaPlugin;

public final class Onceuncraftable extends JavaPlugin {
    @Override
    public void onEnable() {


        getServer().getPluginManager().registerEvents(new Mineable(this), this);
        getCommand("mineablespawners").setExecutor(new Changeconfig());
        getCommand("craftenchants").setExecutor(new Changeconfig());
        saveDefaultConfig();

    }
}


