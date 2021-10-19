package me.hex.onceuncraftable.events;

import me.hex.onceuncraftable.OnceUnCraftable;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ThreadLocalRandom;

public class Mineable implements Listener {

    private final JavaPlugin plugin;

    public Mineable(OnceUnCraftable plugin) {

        this.plugin = plugin;
    }

    @EventHandler
    public void onMine(BlockBreakEvent e) {

        if (!plugin.getConfig().getBoolean("mine-spawners-with-silk-touch")) return;

        Material b = e.getBlock().getType();

        if (b != Material.SPAWNER) return;
        if (e.getPlayer().getInventory().getItemInMainHand().getType() == Material.AIR) return;
        if (!e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) return;

        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.SPAWNER, 1));
        if (!(e.getBlock().getState() instanceof CreatureSpawner)) return;

        EntityType creature = ((CreatureSpawner) e.getBlock().getState()).getSpawnedType();
        String spawnEgg = creature.name().toUpperCase().replace(" ", "_") + "_SPAWN_EGG";
        Material materialSpawnEgg = Material.getMaterial(spawnEgg);

        if (!plugin.getConfig().isConfigurationSection("chance-to-spawn-spawner-eggs")) {

            if (creature == EntityType.PIG) return;
            if (materialSpawnEgg == null) return;
            e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.getMaterial(spawnEgg), 1));
        }

        int chance = plugin.getConfig().getInt("chance-to-spawn-spawner-eggs");

        if (!(ThreadLocalRandom.current().nextInt(100) < chance)) return;
        if (creature == EntityType.PIG) return;
        if (plugin.getConfig().getInt("chance-to-spawn-spawner-eggs") == 0) return;

        if (materialSpawnEgg == null) return;

        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.getMaterial(spawnEgg), 1));
    }
}


