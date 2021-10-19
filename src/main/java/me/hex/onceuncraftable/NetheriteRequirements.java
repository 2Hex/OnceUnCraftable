package me.hex.onceuncraftable;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class NetheriteRequirements implements Listener {
    private final OnceUnCraftable plugin;

    public NetheriteRequirements(OnceUnCraftable plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onTableClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        if (player.getOpenInventory().getType() != InventoryType.SMITHING)
            return;

        ItemStack[] smithingTableSlot = {player.getOpenInventory().getItem(0),
                player.getOpenInventory().getItem(1), player.getOpenInventory().getItem(2)};

        if ((e.getSlot() != 2) || (smithingTableSlot[0] == null) || (smithingTableSlot[1] == null) || (smithingTableSlot[2] == null) ||
                (smithingTableSlot[0].getType() == Material.AIR) || (smithingTableSlot[1].getType() == Material.AIR) ||
                (smithingTableSlot[2].getType() == Material.AIR)) {
            return;
        }
        int materialReq = plugin.getConfig().getInt("netherite-upgrade-req");

        if (smithingTableSlot[1].getAmount() < materialReq) {
            e.setCancelled(true);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou need " + materialReq + " to craft this item"));
        } else {
            smithingTableSlot[1].setAmount(smithingTableSlot[1].getAmount() - (materialReq - 1));
        }
    }
}


