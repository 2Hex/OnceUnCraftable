package me.hex.onceuncraftable;

import me.hex.onceuncraftable.utils.ItemStacks;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class RecipesManager implements Listener {

    /**
     * Enum of all recipes
     */
    public enum Keys {
        ZOMBIE(new ItemStack(Material.ZOMBIE_SPAWN_EGG),
                "RDR", "DZD", "RDR",
                "DRZ", new Material[] {Material.DIAMOND, Material.ROTTEN_FLESH, Material.ZOMBIE_HEAD}),
        SKELETON(new ItemStack(Material.SKELETON_SPAWN_EGG),
                "BDB", "DSD", "BDB",
                "DBS", new Material[] {Material.DIAMOND, Material.BONE_BLOCK, Material.SKELETON_SKULL}),
        CREEPER(new ItemStack(Material.CREEPER_SPAWN_EGG),
                "TDT", "DCD", "TDT",
                "DTC", new Material[] {Material.DIAMOND, Material.TNT, Material.CREEPER_HEAD}),
        ENDERMAN(new ItemStack(Material.ENDERMAN_SPAWN_EGG),
                "CYC", "YNY", "CYC",
                "CYN", new Material[] {Material.ENDER_CHEST, Material.ENDER_EYE, Material.NETHERITE_SCRAP}),
        EVOKER(new ItemStack(Material.EVOKER_SPAWN_EGG),
                "NEN", "DTD", "GEG",
                "ENGDT", new Material[] {Material.EMERALD_BLOCK, Material.NETHERITE_BLOCK, Material.GOLD_BLOCK, Material.DIAMOND_BLOCK, Material.TOTEM_OF_UNDYING}),
        VINDICATOR(new ItemStack(Material.VINDICATOR_SPAWN_EGG),
                "EEE", "EME", "EEE",
                "ME", new Material[] {Material.EMERALD_BLOCK, Material.IRON_BLOCK}),
        SHULKER(new ItemStack(Material.SHULKER_SPAWN_EGG),
                "SSS", "SES", "SSS",
                "SE", new Material[] {Material.SHULKER_SHELL, Material.ENDER_CHEST}),
        PHANTOM(new ItemStack(Material.PHANTOM_SPAWN_EGG),
                "PPP", "PMP", "PPP",
                "MP", new Material[] {Material.MAGENTA_BED, Material.PHANTOM_MEMBRANE}),
        SLIME(new ItemStack(Material.SLIME_SPAWN_EGG),
                "SES", "BDB", "SES",
                "BSDE", new Material[] {Material.SLIME_BLOCK, Material.SLIME_BALL, Material.DIAMOND, Material.GOLD_NUGGET}),
        WITHER(new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG),
                "CGC", "WWW", "CGC",
                "CWG", new Material[] {Material.COAL, Material.WITHER_SKELETON_SKULL, Material.GOLD_NUGGET}),
        SQUID(new ItemStack(Material.SQUID_SPAWN_EGG),
                "CIC", "III", "CIC",
                "IC", new Material[] {Material.INK_SAC, Material.COAL}),
        SHEEP(new ItemStack(Material.SHEEP_SPAWN_EGG),
                "RPR", "PBP", "RPR",
                "RBP", new Material[] {Material.IRON_NUGGET, Material.BROWN_WOOL, Material.PINK_WOOL}),
        DIAMOND_HORSE(new ItemStack(Material.DIAMOND_HORSE_ARMOR),
                "DND", "LDL", "DLD",
                "DLN", new Material[] {Material.DIAMOND, Material.LEATHER, Material.LEAD}),
        GOLD_HORSE(new ItemStack(Material.GOLDEN_HORSE_ARMOR),
                "DND", "LDL", "DLD",
                "DLN", new Material[] {Material.GOLD_INGOT, Material.LEATHER, Material.LEAD}),
        DRAGON_EGG(new ItemStack(Material.DRAGON_EGG),
                "NEN", "EHE", "NEN",
                "HEN", new Material[] {Material.DRAGON_EGG, Material.NETHERITE_BLOCK, Material.END_CRYSTAL}),
        SADDLE(new ItemStack(Material.SADDLE),
                "LLL", "LLL", "LLL",
                "L", new Material[] {Material.LEATHER}),
        IRON_HORSE(new ItemStack(Material.IRON_HORSE_ARMOR),
                "INI", "LIL", "ILI",
                "ILN", new Material[] {Material.IRON_INGOT, Material.LEATHER, Material.LEAD}),
        EXP(new ItemStack(Material.EXPERIENCE_BOTTLE),
                "EBE", "BLB", "EBE",
                "LEB", new Material[] {Material.LAPIS_BLOCK, Material.GLASS_BOTTLE, Material.EMERALD}),
        ENCH_SILK(ItemStacks.silk(),
                "LEL", "GBG", "LEL",
                "LGEB", new Material[] {Material.LAPIS_BLOCK, Material.GLASS_BOTTLE, Material.EMERALD, Material.BOOK}),
        ENCH_EFF(ItemStacks.eff(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.QUARTZ_BLOCK, Material.BOOK}),
        ENCH_UNB(ItemStacks.unb(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.OBSIDIAN, Material.BOOK}),
        ENCH_SHA(ItemStacks.sh(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.GOLD_INGOT, Material.DIAMOND}),
        ENCH_MN(ItemStacks.mn(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.NETHERITE_SCRAP, Material.NETHER_STAR}),
        ENCH_SM(ItemStacks.sm(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.ROTTEN_FLESH}),
        ENCH_SQ(ItemStacks.sq(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.SPIDER_EYE}),
        ENCH_QR(ItemStacks.qr(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.IRON_BARS}),
        ENCH_BL(ItemStacks.bl(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.TNT}),
        ENCH_QF(ItemStacks.qf(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.IRON_BOOTS}),
        ENCH_PF(ItemStacks.pf(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.FLINT_AND_STEEL}),
        ENCH_QQ(ItemStacks.qq(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.IRON_BLOCK, Material.ARROW}),
        ENCH_AF(ItemStacks.af(),
                "LGL", "GBG", "LGL",
                "LGB", new Material[] {Material.LAPIS_BLOCK, Material.DIAMOND, Material.FLINT_AND_STEEL}),
        END_ROD(new ItemStack(Material.END_ROD),
                "   ", " B ", " D ",
                "DB", new Material[] {Material.DIAMOND, Material.BLAZE_ROD}),
        ENCH_CH(ItemStacks.ch(),
                "IDI", "DBD", "IDI",
                "IDB", new Material[] {Material.ICE, Material.DIAMOND, Material.BOOK}),
        SPONGE(new ItemStack(Material.SPONGE),
                "SSS", "SSS", "SSS",
                "S", new Material[] {Material.PUFFERFISH}),
        COBWEB(new ItemStack(Material.COBWEB),
                "S S", " S ", "S S",
                "S", new Material[] {Material.STRING}),
        BROWN_MUSHROOM(new ItemStack(Material.BROWN_MUSHROOM_BLOCK),
                "SSS", "SSS", "SSS",
                "S", new Material[] {Material.BROWN_MUSHROOM}),
        RED_MUSHROOM(new ItemStack(Material.RED_MUSHROOM_BLOCK),
                "SSS", "SSS", "SSS",
                "S", new Material[] {Material.RED_MUSHROOM}),
        DRAGON_HEAD(new ItemStack(Material.DRAGON_HEAD),
                "EZE", "WGS", "ECE",
                "ZWCEGS", new Material[] {Material.ZOMBIE_HEAD, Material.WITHER_SKELETON_SKULL, Material.CREEPER_HEAD, Material.END_CRYSTAL, Material.DRAGON_EGG, Material.SKELETON_SKULL}),
        NETHER_WART(new ItemStack(Material.NETHER_WART),
                "   ", " W ", " S ",
                "WS", new Material[] {Material.WHEAT_SEEDS, Material.SOUL_SAND}),
        SPAWNER(new ItemStack(Material.SPAWNER),
                "CIC", "IDI", "CIC",
                "CDI", new Material[] {Material.CHAIN, Material.DIAMOND_BLOCK, Material.IRON_BARS});



        public final ItemStack itemStack;
        public final String[] matrix;
        public final String materialKey;
        public final Material[] materials;

        Keys(ItemStack item, String matrix1, String matrix2, String matrix3, String materialKey, Material[] materials) {

            matrix = new String[] {matrix1, matrix2, matrix3};
            this.materialKey = materialKey;
            this.materials = materials;
            this.itemStack = item;
        }

        public NamespacedKey getKey() {
            return NamespacedKey.fromString(name().toLowerCase(), RecipesManager.plugin);
        }
    }

    private static JavaPlugin plugin;

    public RecipesManager(JavaPlugin plugin) {

        RecipesManager.plugin = plugin;
        Arrays.stream(RecipesManager.Keys.values()).forEach(key -> new NamespacedKey(RecipesManager.plugin, key.name().toLowerCase()));
        addRecipes();
    }

    /**
     * Create and register the recipes with Bukkit.
     */


    private void addRecipes() {

        Arrays.stream(Keys.values()).forEach(data -> {

            if (plugin.getConfig().getStringList("disabled_recipes").contains(data.name()))
                return;
            if(!plugin.getConfig().getBoolean("craft-enchants") && data.name().contains("ENCH"))
                return;
            ShapedRecipe recipe = new ShapedRecipe(data.getKey(), data.itemStack);
            recipe.shape(data.matrix);

            if (data.materialKey.length() != data.materials.length) {
                plugin.getLogger().warning("Malformed Recipe for " + data.name());
                return;
            }

            for(int i = 0; i < data.materialKey.length(); i++) {
                recipe.setIngredient(data.materialKey.charAt(i), data.materials[i]);
            }
            Bukkit.addRecipe(recipe);
        });
    }

    /**
     * Set all recipes as discovered for the Player.
     *
     * @param event
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        for(Keys recipeKey: Keys.values()) {
            player.discoverRecipe(recipeKey.getKey());
        }
    }
}
