package me.hex.onceuncraftable.events;

import me.hex.onceuncraftable.Onceuncraftable;
import me.hex.onceuncraftable.RecipesManager;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Mineable implements Listener {
    private static JavaPlugin plugin;

    public Mineable(Onceuncraftable plugin) {

        Mineable.plugin = plugin;
    }

    @EventHandler
    public void onMine(BlockBreakEvent e) {
        if (plugin.getConfig().getBoolean("mine-spawners-with-silk-touch")) {
            Material b = e.getBlock().getType();

            if (b == Material.SPAWNER) {
                if (e.getPlayer().getInventory().getItemInMainHand() != null) {
                    if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.SPAWNER, 1));
                        if (e.getBlock().getState() instanceof CreatureSpawner) {

                            EntityType creature = ((CreatureSpawner) e.getBlock().getState()).getSpawnedType();
                            String spawn = creature.name().toUpperCase().replace(" ", "_") + "_SPAWN_EGG";
                            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.getMaterial(spawn), 1));
                        }
                    }
                }
            }
        }
    }
}
