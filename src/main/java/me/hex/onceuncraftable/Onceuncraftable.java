package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.ChangeConfig;
import me.hex.onceuncraftable.events.Mineable;
import org.bukkit.plugin.java.JavaPlugin;

public final class Onceuncraftable extends JavaPlugin {
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Mineable(this), this);
        getCommand("mineablespawners").setExecutor(new ChangeConfig(this));
        getCommand("craftenchants").setExecutor(new ChangeConfig(this));
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new RecipesManager(this), this);

    }
}


