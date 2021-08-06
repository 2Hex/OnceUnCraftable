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
    public void onMine(BlockBreakEvent e){

        if(plugin.getConfig().getBoolean("mine-spawners-with-silk-touch")){
            System.out.println("mine spawners is true.1");
        Material b = e.getBlock().getType();
            System.out.println("material is block 0");
        if(b == Material.SPAWNER){
            System.out.println("spawner is the block2");
            if(e.getPlayer().getInventory().getItemInMainHand() != null) {
                System.out.println("player is not holding null3");
                if (e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
                    System.out.println("player has silk touch4");
                    e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.SPAWNER, 1));
                    System.out.println("spawner is dropped5");
                    if (e.getBlock().getState() instanceof CreatureSpawner) {
                        System.out.println("block state is creature spawner7");
                        EntityType creature = ((CreatureSpawner) e.getBlock().getState()).getSpawnedType();
                        System.out.println("casted7");
                        String spawn = creature.name().toUpperCase().replace(" ", "_") + "_SPAWN_EGG";
                        System.out.println("spawn is creature.name8");
                        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(Material.getMaterial(spawn), 1));
                        System.out.println("spawn egg dropped9");
                    }


                }
            }
        }
           }
    }

       }
