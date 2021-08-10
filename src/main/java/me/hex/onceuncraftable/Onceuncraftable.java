package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.ChangeConfig;
import me.hex.onceuncraftable.events.Mineable;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class Onceuncraftable extends JavaPlugin {
    private File customConfigFile;
    private FileConfiguration customConfig;
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Mineable(this), this);
        getCommand("mineablespawners").setExecutor(new ChangeConfig(this));
        getCommand("craftenchants").setExecutor(new ChangeConfig(this));
        getCommand("onceuncraftable").setExecutor(new ChangeConfig(this));
        saveDefaultConfig();
        createCustomConfig();
        getServer().getPluginManager().registerEvents(new RecipesManager(this), this);


    }

    public FileConfiguration getCustomConfig() {
        return this.customConfig;
    }

    private void createCustomConfig() {
        customConfigFile = new File(getDataFolder(), "recipes.yml");
        if (!customConfigFile.exists()) {
            customConfigFile.getParentFile().mkdirs();
            saveResource("recipes.yml", false);
        }

        customConfig = new YamlConfiguration();
        try {
            customConfig.load(customConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    }



