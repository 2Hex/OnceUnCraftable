package me.hex.onceuncraftable.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class ItemStacks {
    public static ItemStack createBookStack(Enchantment enchantment) {
        ItemStack enchant = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta = (EnchantmentStorageMeta) enchant.getItemMeta();
        if (meta != null) {
            meta.addStoredEnchant(enchantment, 1, true);
            enchant.setItemMeta(meta);
        }
        return enchant;
    }
}

