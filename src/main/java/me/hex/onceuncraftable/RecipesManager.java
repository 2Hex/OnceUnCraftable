package me.hex.onceuncraftable;

import me.hex.onceuncraftable.utils.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.util.HashMap;
import java.util.Map;

public class RecipesManager implements Listener {

    /**
     * Enum of all recipes
     */
    private final Map<NamespacedKey, ShapedRecipe> recipes = new HashMap<>();

    public RecipesManager(Onceuncraftable plugin) {

        RecipesManager.plugin = plugin;

        ConfigurationSection section = plugin.getCustomConfig().getConfigurationSection("recipes");
        if (section == null) return;

        for (String entry : section.getKeys(false)) {

            ConfigurationSection data = section.getConfigurationSection(entry);
            if (data == null) {
                plugin.getLogger().warning("Malformed Recipe for(data) " + entry);
                continue;
            }

            NamespacedKey key = new NamespacedKey(RecipesManager.plugin, entry.toLowerCase());

            String material = data.getString("itemStack");
            String[] matrix = data.getStringList("matrix").toArray(new String[0]);
            String order = data.getString("order");
            String[] items = data.getStringList("items").toArray(new String[0]);

            if (order == null) {
                plugin.getLogger().warning("Malformed(order) Recipe for " + entry);
                continue;
            }
            if(material == null) {
                plugin.getLogger().warning("Malformed(material) Recipe for " + entry);
                continue;
            }

            if (order != null && order.length() != items.length) {
                plugin.getLogger().warning("Malformed(length) Recipe for " + entry);
                continue;
            }
            ItemStack itemStack;

            if (entry.contains("ench_")) {
                itemStack = ItemStacks.createBookStack(Enchantment.getByKey(NamespacedKey.minecraft(material.toLowerCase())));
            } else {
                Material matchMat = Material.matchMaterial(material);
                if (matchMat == null)
                    continue;
                itemStack = new ItemStack(matchMat);
            }

            ShapedRecipe recipe = new ShapedRecipe(key, itemStack);

            recipe.shape(matrix);
            if (order != null){
                for (int i = 0; i < order.length(); i++) {
                    Material matchitems = Material.matchMaterial(items[i]);
                    if (matchitems != null) {
                        recipe.setIngredient(order.charAt(i), matchitems);
                    }
                }
        }
                if(key == null)
                    continue;

            recipes.put(key, recipe);
            Bukkit.addRecipe(recipe);
        }
    }

    private static Onceuncraftable plugin;


    /**
     * Set all recipes as discovered for the Player.
     *
     * @param event
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        for (NamespacedKey recipe : recipes.keySet()) {
            if (!plugin.getCustomConfig().getBoolean("craft-enchants") && recipe.getKey().contains("ench_"))
                continue;
            player.discoverRecipe(recipe);
        }
    }
}