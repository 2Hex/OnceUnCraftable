package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.ChangeConfig;
import me.hex.onceuncraftable.events.Mineable;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Onceuncraftable extends JavaPlugin {
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Mineable(this), this);
        getCommand("mineablespawners").setExecutor(new ChangeConfig(this));
        getCommand("craftenchants").setExecutor(new ChangeConfig(this));
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new RecipesManager(this), this);
        getCommand("onceuncraftable").setExecutor(new ChangeConfig(this));
        if(getConfig().getString("chance-to-spawn-spawner-eggs") == null){
            getConfig().createSection("chance-to-spawn-spawner-eggs");
            getConfig().set("chance-to-spawn-spawner-eggs", 100);
        }
        if(getConfig().getString("craft-enchants") == null) {
            getConfig().createSection("craft-enchants");
            getConfig().set("craft-enchants", true);
        }
        if(getConfig().getString("disabled_recipes") == null){
            getConfig().createSection("disabled_recipes:");
            for(int i = 0; i < 5; i++) {
                getConfig().set("disabled_recipes:.-", " ");
            }
        }
            saveConfig();
    }
}


