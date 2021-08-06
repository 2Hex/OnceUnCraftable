package me.hex.onceuncraftable.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class ItemStacks {
    public static ItemStack silk() {
        ItemStack silk = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta silkmeta = (EnchantmentStorageMeta) silk.getItemMeta();
        if (silkmeta != null) {
            silkmeta.addStoredEnchant(Enchantment.SILK_TOUCH, 1, true);
            silk.setItemMeta(silkmeta);

        }
        return silk;
    }
    public static ItemStack eff() {
        ItemStack eff = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta effmeta = (EnchantmentStorageMeta) eff.getItemMeta();
        if(effmeta != null) {
            effmeta.addStoredEnchant(Enchantment.DIG_SPEED, 1, true);
            eff.setItemMeta(effmeta);
        }
        return eff;
    }
    public static ItemStack unb(){
        ItemStack unb = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta unbmeta = (EnchantmentStorageMeta) unb.getItemMeta();
        if(unbmeta != null) {
            unbmeta.addStoredEnchant(Enchantment.DURABILITY, 1, true);
            unb.setItemMeta(unbmeta);
        }
        return unb;

    }
    public static ItemStack sh(){
        ItemStack sh = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta shmeta = (EnchantmentStorageMeta) sh.getItemMeta();
        if(shmeta != null) {
            shmeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sh.setItemMeta(shmeta);
        }
        return sh;

    }
    public static ItemStack mn(){
        ItemStack mn = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta mnmeta = (EnchantmentStorageMeta) mn.getItemMeta();
        if(mnmeta != null) {
            mnmeta.addStoredEnchant(Enchantment.MENDING, 1, true);
            mn.setItemMeta(mnmeta);
        }
        return mn;

    }
    public static ItemStack sm(){
        ItemStack sm = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta smmeta = (EnchantmentStorageMeta) sm.getItemMeta();
        if(smmeta != null) {
            smmeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 1, true);
            sm.setItemMeta(smmeta);
        }
        return sm;

    }
    public static ItemStack sq() {
        ItemStack sq = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sqmeta = (EnchantmentStorageMeta) sq.getItemMeta();
        if(sqmeta != null) {
            sqmeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, true);
            sq.setItemMeta(sqmeta);
        }
        return sq;
    }
    public static ItemStack qr() {
        ItemStack qr = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qrmeta = (EnchantmentStorageMeta) qr.getItemMeta();
        if(qrmeta != null) {
            qrmeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            qr.setItemMeta(qrmeta);
        }
        return qr;
    }
    public static ItemStack bl() {
        ItemStack bl = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta blmeta = (EnchantmentStorageMeta) bl.getItemMeta();
        if(blmeta != null) {
            blmeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, true);
            bl.setItemMeta(blmeta);
        }
        return  bl;
    }

    public static ItemStack qf() {
        ItemStack qf = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qfmeta = (EnchantmentStorageMeta) qf.getItemMeta();
        if(qfmeta != null) {
            qfmeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 1, true);
            qf.setItemMeta(qfmeta);
        }
        return qf;
    }
    public static ItemStack pf() {
        ItemStack pf = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta pfmeta = (EnchantmentStorageMeta) pf.getItemMeta();
        if(pfmeta != null) {
            pfmeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 1, true);
            pf.setItemMeta(pfmeta);
        }

        return pf;
    }
    public static ItemStack qq() {
        ItemStack qq = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qqmeta = (EnchantmentStorageMeta) qq.getItemMeta();
        if(qqmeta != null) {
            qqmeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
            qq.setItemMeta(qqmeta);
        }
        return qq;
    }
    public static ItemStack af() {
        //-----------------------------
        ItemStack af = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta afmeta = (EnchantmentStorageMeta) af.getItemMeta();
        if(afmeta != null) {
            afmeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 1, true);
            af.setItemMeta(afmeta);
        }
        return af;
    }
        public static ItemStack ch(){
            ItemStack ch = new ItemStack(Material.ENCHANTED_BOOK);
            EnchantmentStorageMeta chmeta = (EnchantmentStorageMeta) ch.getItemMeta();
            if(chmeta != null) {
                chmeta.addStoredEnchant(Enchantment.CHANNELING, 1, true);
                ch.setItemMeta(chmeta);
            }
            return ch;

        }

}

