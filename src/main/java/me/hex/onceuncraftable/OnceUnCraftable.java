package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.ChangeConfig;
import me.hex.onceuncraftable.events.Mineable;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class OnceUnCraftable extends JavaPlugin {
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
        ConfigurationSection section = customConfig.getConfigurationSection("recipes");
        if (section == null) return;
        for (String entry : section.getKeys(false)) {
            ConfigurationSection data = section.getConfigurationSection(entry);
            if(data == null) return;
            data.createSection("override");
            data.set("override", false);
        }
        getServer().getPluginManager().registerEvents(new RecipesManager(this), this);
        getServer().getPluginManager().registerEvents(new NetheriteRequirements(this), this);
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



