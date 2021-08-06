package me.hex.onceuncraftable;

import me.hex.onceuncraftable.commands.Changeconfig;
import me.hex.onceuncraftable.events.Mineable;
import me.hex.onceuncraftable.events.onJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Onceuncraftable extends JavaPlugin  {
    final RecipesManager recipes = new RecipesManager(this);
    public static Onceuncraftable INSTANCE;
    @Override
    public void onEnable() {
        INSTANCE = this;

        recipes.addRecipes();
        getServer().getPluginManager().registerEvents(new onJoin(recipes), this);
        getServer().getPluginManager().registerEvents(new Mineable(), this);
        getCommand("mineablespawners").setExecutor(new Changeconfig());
        getCommand("craftenchants").setExecutor(new Changeconfig());

        saveDefaultConfig();

    }
        }


