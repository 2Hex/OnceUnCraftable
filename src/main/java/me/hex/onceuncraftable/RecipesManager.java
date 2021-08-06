package me.hex.onceuncraftable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class RecipesManager {



    public void addRecipes() {


        ShapedRecipe recipe = new ShapedRecipe(getZombieKey(), new ItemStack(Material.ZOMBIE_SPAWN_EGG));

        recipe.shape("RDR", "DZD", "RDR");

        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('R', Material.ROTTEN_FLESH);
        recipe.setIngredient('Z', Material.ZOMBIE_HEAD);


        Bukkit.addRecipe(recipe);
        //---------------------------------------------------------


        ShapedRecipe recipe1 = new ShapedRecipe(getSkeletonKey(), new ItemStack(Material.SKELETON_SPAWN_EGG));
        recipe1.shape("BDB", "DSD", "BDB");

        recipe1.setIngredient('D', Material.DIAMOND);
        recipe1.setIngredient('B', Material.BONE_BLOCK);
        recipe1.setIngredient('S', Material.SKELETON_SKULL);

        Bukkit.addRecipe(recipe1);
        //-------------------------------------------------------------


        ShapedRecipe recipe2 = new ShapedRecipe(getCreeperKey(), new ItemStack(Material.CREEPER_SPAWN_EGG));
        recipe2.shape("TDT", "DCD", "TDT");

        recipe2.setIngredient('D', Material.DIAMOND);
        recipe2.setIngredient('T', Material.TNT);
        recipe2.setIngredient('C', Material.CREEPER_HEAD);

        Bukkit.addRecipe(recipe2);
        //------------------------------------------------------------------

        ShapedRecipe recipe3 = new ShapedRecipe(getEndermanKey(), new ItemStack(Material.ENDERMAN_SPAWN_EGG));
        recipe3.shape("CYC", "YNY", "CYC");

        recipe3.setIngredient('C', Material.ENDER_CHEST);
        recipe3.setIngredient('Y', Material.ENDER_EYE);
        recipe3.setIngredient('N', Material.NETHERITE_SCRAP);

        Bukkit.addRecipe(recipe3);
        //------------------------------------------------------------------


        ShapedRecipe recipe4 = new ShapedRecipe(getEvokerKey(), new ItemStack(Material.EVOKER_SPAWN_EGG));
        recipe4.shape("NEN", "DTD", "GEG");

        recipe4.setIngredient('E', Material.EMERALD_BLOCK);
        recipe4.setIngredient('N', Material.NETHERITE_BLOCK);
        recipe4.setIngredient('G', Material.GOLD_BLOCK);
        recipe4.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe4.setIngredient('T', Material.TOTEM_OF_UNDYING);

        Bukkit.addRecipe(recipe4);
        //------------------------------------------------------------------


        ShapedRecipe recipe5 = new ShapedRecipe(getVindicatorKey(), new ItemStack(Material.VINDICATOR_SPAWN_EGG));
        recipe5.shape("EEE", "EME", "EEE");

        recipe5.setIngredient('M', Material.EMERALD_BLOCK);
        recipe5.setIngredient('E', Material.IRON_BLOCK);

        Bukkit.addRecipe(recipe5);
        //------------------------------------------------------------------


        ShapedRecipe recipe6 = new ShapedRecipe(getShulkerKey(), new ItemStack(Material.SHULKER_SPAWN_EGG));
        recipe6.shape("SSS", "SES", "SSS");

        recipe6.setIngredient('S', Material.SHULKER_SHELL);
        recipe6.setIngredient('E', Material.ENDER_CHEST);

        Bukkit.addRecipe(recipe6);
        //------------------------------------------------------------------

        ShapedRecipe recipe7 = new ShapedRecipe(getPhantomKey(), new ItemStack(Material.PHANTOM_SPAWN_EGG));
        recipe7.shape("PPP", "PMP", "PPP");

        recipe7.setIngredient('M', Material.MAGENTA_BED);
        recipe7.setIngredient('P', Material.PHANTOM_MEMBRANE);

        Bukkit.addRecipe(recipe7);
        //------------------------------------------------------------------


        ShapedRecipe recipe8 = new ShapedRecipe(getSlimeKey(), new ItemStack(Material.SLIME_SPAWN_EGG));
        recipe8.shape("SES", "BDB", "SES");

        recipe8.setIngredient('B', Material.SLIME_BLOCK);
        recipe8.setIngredient('S', Material.SLIME_BALL);
        recipe8.setIngredient('D', Material.DIAMOND);
        recipe8.setIngredient('E', Material.GOLD_NUGGET);

        Bukkit.addRecipe(recipe8);
        //------------------------------------------------------------------


        ShapedRecipe recipe9 = new ShapedRecipe(getWitherKey(), new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG));
        recipe9.shape("CGC", "WWW", "CGC");

        recipe9.setIngredient('C', Material.COAL);
        recipe9.setIngredient('W', Material.WITHER_SKELETON_SKULL);
        recipe9.setIngredient('G', Material.GOLD_NUGGET);
        Bukkit.addRecipe(recipe9);
        //------------------------------------------------------------------

        ShapedRecipe recipe10 = new ShapedRecipe(getSquidKey(), new ItemStack(Material.SQUID_SPAWN_EGG));
        recipe10.shape("CIC", "III", "CIC");
        recipe10.setIngredient('I', Material.INK_SAC);
        recipe10.setIngredient('C', Material.COAL);

        Bukkit.addRecipe(recipe10);
        //------------------------------------------------------------------


        ShapedRecipe recipe11 = new ShapedRecipe(getSheepKey(), new ItemStack(Material.SHEEP_SPAWN_EGG));
        recipe11.shape("RPR", "PBP", "RPR");

        recipe11.setIngredient('R', Material.IRON_NUGGET);
        recipe11.setIngredient('B', Material.BROWN_WOOL);
        recipe11.setIngredient('P', Material.PINK_WOOL);
        Bukkit.addRecipe(recipe11);
        //------------------------------------------------------------------

        ShapedRecipe recipe12 = new ShapedRecipe(getSpawnerKey(), new ItemStack(Material.SPAWNER));
        recipe12.shape("CIC", "IDI", "CIC");

        recipe12.setIngredient('C', Material.CHAIN);
        recipe12.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe12.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe12);
        //------------------------------------------------------------------
        ShapedRecipe recipe13 = new ShapedRecipe(getDiamondHorseKey(), new ItemStack(Material.DIAMOND_HORSE_ARMOR));
        recipe13.shape("DND", "LDL", "DLD");


        recipe13.setIngredient('D', Material.DIAMOND);
        recipe13.setIngredient('L', Material.LEATHER);
        recipe13.setIngredient('N', Material.LEAD);
        Bukkit.addRecipe(recipe13);
//-----------------------
        ShapedRecipe recipe14 = new ShapedRecipe(getGoldHorseKey(), new ItemStack(Material.GOLDEN_HORSE_ARMOR));
        recipe14.shape("GNG", "LGL", "GLG");


        recipe14.setIngredient('G', Material.GOLD_INGOT);
        recipe14.setIngredient('L', Material.LEATHER);
        recipe14.setIngredient('N', Material.LEAD);
        Bukkit.addRecipe(recipe14);
        //----------------------
        ShapedRecipe recipe15 = new ShapedRecipe(getDragonEgg(), new ItemStack(Material.DRAGON_EGG));
        recipe15.shape("NEN", "EHE", "NEN");


        recipe15.setIngredient('H', Material.DRAGON_HEAD);
        recipe15.setIngredient('N', Material.NETHERITE_BLOCK);
        recipe15.setIngredient('E', Material.END_CRYSTAL);
        Bukkit.addRecipe(recipe15);
        //-------------
        ShapedRecipe recipe16 = new ShapedRecipe(getSaddleKey(), new ItemStack(Material.SADDLE));
        recipe16.shape("LLL", "LLL", "LLL");

        recipe16.setIngredient('L', Material.LEATHER);
        Bukkit.addRecipe(recipe16);
        //-------------
        ShapedRecipe recipe17 = new ShapedRecipe(getIronHorseKey(), new ItemStack(Material.IRON_HORSE_ARMOR));
        recipe17.shape("INI", "LIL", "ILI");


        recipe17.setIngredient('I', Material.IRON_INGOT);
        recipe17.setIngredient('L', Material.LEATHER);
        recipe17.setIngredient('N', Material.LEAD);
        Bukkit.addRecipe(recipe17);
        //-----------------------------
        ShapedRecipe recipe18 = new ShapedRecipe(getExpKey(), new ItemStack(Material.EXPERIENCE_BOTTLE));
        recipe18.shape("EBE", "BLB", "EBE");


        recipe18.setIngredient('L', Material.LAPIS_BLOCK);
        recipe18.setIngredient('B', Material.GLASS_BOTTLE);
        recipe18.setIngredient('E', Material.EMERALD);
        Bukkit.addRecipe(recipe18);
        //-----------------------------
        ItemStack silk = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta silkmeta = (EnchantmentStorageMeta) silk.getItemMeta();
        if(silkmeta != null) {
            silkmeta.addStoredEnchant(Enchantment.SILK_TOUCH, 1, true);
            silk.setItemMeta(silkmeta);
        }
        ShapedRecipe recipe19 = new ShapedRecipe(getSilkKey(), silk);
        recipe19.shape("LEL", "GBG", "LEL");


        recipe19.setIngredient('L', Material.LAPIS_BLOCK);
        recipe19.setIngredient('G', Material.GLASS);
        recipe19.setIngredient('E', Material.EMERALD);
        recipe19.setIngredient('B', Material.BOOK);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe19);
        }
        //-----------------------------
        ItemStack eff = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta effmeta = (EnchantmentStorageMeta) eff.getItemMeta();
        if(effmeta != null) {
            effmeta.addStoredEnchant(Enchantment.DIG_SPEED, 1, true);
            eff.setItemMeta(effmeta);
        }
        ShapedRecipe recipe20 = new ShapedRecipe(getEffKey(), eff);
        recipe20.shape("LQL", "GBG", "LQL");


        recipe20.setIngredient('L', Material.LAPIS_LAZULI);
        recipe20.setIngredient('G', Material.QUARTZ_BLOCK);
        recipe20.setIngredient('B', Material.BOOK);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe20);
        }
        //-----------------------------
        ItemStack unb = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta unbmeta = (EnchantmentStorageMeta) unb.getItemMeta();
        if(unbmeta != null) {
            unbmeta.addStoredEnchant(Enchantment.DURABILITY, 1, true);
            unb.setItemMeta(unbmeta);
        }
        ShapedRecipe recipe21 = new ShapedRecipe(getUnbKey(), unb);
        recipe21.shape("LQL", "GBG", "LQL");


        recipe21.setIngredient('L', Material.LAPIS_LAZULI);
        recipe21.setIngredient('G', Material.OBSIDIAN);
        recipe21.setIngredient('B', Material.BOOK);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe21);
        }
        //-----------------------------
        ItemStack sh = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta shmeta = (EnchantmentStorageMeta) sh.getItemMeta();
        if(shmeta != null) {
            shmeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sh.setItemMeta(shmeta);
        }
        ShapedRecipe recipe22 = new ShapedRecipe(getShKey(), sh);
        recipe22.shape("LQL", "GBG", "LQL");


        recipe22.setIngredient('L', Material.LAPIS_LAZULI);
        recipe22.setIngredient('G', Material.GOLD_BLOCK);
        recipe22.setIngredient('B', Material.DIAMOND);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe22);
        }
        //-----------------------------
        ItemStack mn = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta mnmeta = (EnchantmentStorageMeta) mn.getItemMeta();
        if(mnmeta != null) {
            mnmeta.addStoredEnchant(Enchantment.MENDING, 1, true);
            mn.setItemMeta(mnmeta);
        }
        ShapedRecipe recipe23 = new ShapedRecipe(getMnKey(), mn);
        recipe23.shape("LQL", "GBG", "LQL");


        recipe23.setIngredient('L', Material.LAPIS_LAZULI);
        recipe23.setIngredient('G', Material.NETHERITE_SCRAP);
        recipe23.setIngredient('B', Material.NETHER_STAR);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe23);
        }
        //-----------------------------
        ItemStack sm = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta smmeta = (EnchantmentStorageMeta) sm.getItemMeta();
        if(smmeta != null) {
            smmeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 1, true);
            sm.setItemMeta(smmeta);
        }
        ShapedRecipe recipe24 = new ShapedRecipe(getSmKey(), sm);
        recipe24.shape("LQL", "GBG", "LQL");


        recipe24.setIngredient('L', Material.LAPIS_LAZULI);
        recipe24.setIngredient('G', Material.IRON_BLOCK);
        recipe24.setIngredient('B', Material.ROTTEN_FLESH);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe24);
        }
        //-----------------------------
        ItemStack sq = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sqmeta = (EnchantmentStorageMeta) sq.getItemMeta();
        if(sqmeta != null) {
            sqmeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, true);
            sq.setItemMeta(sqmeta);
        }
        ShapedRecipe recipe25 = new ShapedRecipe(getSqKey(), sq);
        recipe25.shape("LQL", "GBG", "LQL");


        recipe25.setIngredient('L', Material.LAPIS_LAZULI);
        recipe25.setIngredient('G', Material.IRON_BLOCK);
        recipe25.setIngredient('B', Material.SPIDER_EYE);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe25);
        }
        //-----------------------------
        ItemStack qr = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qrmeta = (EnchantmentStorageMeta) qr.getItemMeta();
        if(qrmeta != null) {
            qrmeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            qr.setItemMeta(qrmeta);
        }
        ShapedRecipe recipe26 = new ShapedRecipe(getQrKey(), qr);
        recipe26.shape("LQL", "GBG", "LQL");


        recipe26.setIngredient('L', Material.LAPIS_LAZULI);
        recipe26.setIngredient('G', Material.IRON_BLOCK);
        recipe26.setIngredient('B', Material.IRON_BARS);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe26);
        }
        //-----------------------------
        ItemStack bl = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta blmeta = (EnchantmentStorageMeta) bl.getItemMeta();
        if(blmeta != null) {
            blmeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, true);
            bl.setItemMeta(blmeta);
        }
        ShapedRecipe recipe27 = new ShapedRecipe(getBlKey(), bl);
        recipe27.shape("LQL", "GBG", "LQL");


        recipe27.setIngredient('L', Material.LAPIS_LAZULI);
        recipe27.setIngredient('G', Material.IRON_BLOCK);
        recipe27.setIngredient('B', Material.TNT);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe27);
        }
        //-----------------------------
        ItemStack qf = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qfmeta = (EnchantmentStorageMeta) qf.getItemMeta();
        if(qfmeta != null) {
            qfmeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 1, true);
            qf.setItemMeta(qfmeta);
        }
        ShapedRecipe recipe28 = new ShapedRecipe(getQfKey(), qf);
        recipe28.shape("LQL", "GBG", "LQL");


        recipe28.setIngredient('L', Material.LAPIS_LAZULI);
        recipe28.setIngredient('G', Material.IRON_BLOCK);
        recipe28.setIngredient('B', Material.IRON_BOOTS);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe28);
        }
        //-----------------------------
        ItemStack pf = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta pfmeta = (EnchantmentStorageMeta) pf.getItemMeta();
        if(pfmeta != null) {
            pfmeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 1, true);
            pf.setItemMeta(pfmeta);
        }
        ShapedRecipe recipe29 = new ShapedRecipe(getPfKey(), pf);
        recipe29.shape("LQL", "GBG", "LQL");


        recipe29.setIngredient('L', Material.LAPIS_LAZULI);
        recipe29.setIngredient('G', Material.IRON_BLOCK);
        recipe29.setIngredient('B', Material.FLINT_AND_STEEL);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe29);
        }
        //-----------------------------
        ItemStack qq = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta qqmeta = (EnchantmentStorageMeta) qq.getItemMeta();
        if(qqmeta != null) {
            qqmeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
            qq.setItemMeta(qqmeta);
        }
        ShapedRecipe recipe30 = new ShapedRecipe(getQqKey(), qq);
        recipe30.shape("LQL", "GBG", "LQL");


        recipe30.setIngredient('L', Material.LAPIS_LAZULI);
        recipe30.setIngredient('G', Material.IRON_BLOCK);
        recipe30.setIngredient('B', Material.ARROW);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe30);
        }
        //-----------------------------
        ItemStack af = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta afmeta = (EnchantmentStorageMeta) af.getItemMeta();
        if(afmeta != null) {
            afmeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 1, true);
            af.setItemMeta(afmeta);
        }
        ShapedRecipe recipe31 = new ShapedRecipe(getAfKey(), af);
        recipe31.shape("LQL", "GBG", "LQL");


        recipe31.setIngredient('L', Material.LAPIS_LAZULI);
        recipe31.setIngredient('G', Material.DIAMOND);
        recipe31.setIngredient('B', Material.FLINT_AND_STEEL);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe31);
        }
        //-----------------------------
        ShapedRecipe recipe32 = new ShapedRecipe(getEndKey(), new ItemStack(Material.END_ROD));
        recipe32.shape("   ", " B ", " D ");


        recipe32.setIngredient('D', Material.DIAMOND);
        recipe32.setIngredient('B', Material.BLAZE_ROD);
        Bukkit.addRecipe(recipe32);
        //-----------------------------
        ShapedRecipe recipe33 = new ShapedRecipe(getTridentKey(), new ItemStack(Material.TRIDENT));
        recipe33.shape("EEE", "DDD", " D ");


        recipe33.setIngredient('D', Material.DIAMOND);
        recipe33.setIngredient('E', Material.END_ROD);
        Bukkit.addRecipe(recipe33);
        //-----------------------------
        ItemStack ch = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta chmeta = (EnchantmentStorageMeta) ch.getItemMeta();
        if(chmeta != null) {
            chmeta.addStoredEnchant(Enchantment.CHANNELING, 1, true);
            ch.setItemMeta(chmeta);
        }
        ShapedRecipe recipe34 = new ShapedRecipe(getChKey(), ch);
        recipe34.shape("LGL", "GDG", "LGL");


        recipe34.setIngredient('L', Material.GOLD_INGOT);
        recipe34.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe34.setIngredient('G', Material.GLASS);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe34);
        }
        //-----------------------------
        ItemStack rp = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta rpmeta = (EnchantmentStorageMeta) rp.getItemMeta();
        if(rpmeta != null) {
            rpmeta.addStoredEnchant(Enchantment.RIPTIDE, 1, true);
            rp.setItemMeta(rpmeta);
        }
        ShapedRecipe recipe35 = new ShapedRecipe(getRpKey(), rp);
        recipe35.shape("IDI", "DBD", "IDI");


        recipe35.setIngredient('I', Material.ICE);
        recipe35.setIngredient('D', Material.DIAMOND);
        recipe35.setIngredient('B', Material.BOOK);
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
            Bukkit.addRecipe(recipe35);
        }
        //-----
        ShapedRecipe recipe36 = new ShapedRecipe(getSpongeKey(), new ItemStack(Material.SPONGE));
        recipe36.shape("SSS", "SSS", "SSS");


        recipe36.setIngredient('S', Material.PUFFERFISH);

        Bukkit.addRecipe(recipe36);
        //-----
        ShapedRecipe recipe37 = new ShapedRecipe(getCobKey(), new ItemStack(Material.COBWEB));
        recipe37.shape("S S", " S ", "S S");


        recipe37.setIngredient('S', Material.STRING);

        Bukkit.addRecipe(recipe37);
        //---
        ShapedRecipe recipe38 = new ShapedRecipe(getBmKey(), new ItemStack(Material.BROWN_MUSHROOM_BLOCK));
        recipe38.shape("SSS", "SSS", "SSS");


        recipe38.setIngredient('S', Material.BROWN_MUSHROOM);

        Bukkit.addRecipe(recipe38);
        //----
        ShapedRecipe recipe39 = new ShapedRecipe(getRmKey(), new ItemStack(Material.RED_MUSHROOM_BLOCK));
        recipe39.shape("SSS", "SSS", "SSS");


        recipe39.setIngredient('S', Material.RED_MUSHROOM);

        Bukkit.addRecipe(recipe39);
        //++
        ShapedRecipe recipe40 = new ShapedRecipe(getDragKey(), new ItemStack(Material.DRAGON_HEAD));
        recipe40.shape("EZE", "WGS", "ECE");


        recipe40.setIngredient('Z', Material.ZOMBIE_HEAD);
        recipe40.setIngredient('W', Material.WITHER_SKELETON_SKULL);
        recipe40.setIngredient('C', Material.CREEPER_HEAD);
        recipe40.setIngredient('E', Material.END_CRYSTAL);
        recipe40.setIngredient('G', Material.DRAGON_EGG);
        recipe40.setIngredient('S', Material.SKELETON_SKULL);


        Bukkit.addRecipe(recipe40);
        //dddddddddd
        ShapedRecipe recipe41 = new ShapedRecipe(getNwKey(), new ItemStack(Material.NETHER_WART));
        recipe41.shape("   ", " W ", " S ");


        recipe41.setIngredient('S', Material.SOUL_SAND);
        recipe41.setIngredient('W', Material.WHEAT_SEEDS);
        Bukkit.addRecipe(recipe41);
//e







    }

    private final JavaPlugin plugin;
    private final NamespacedKey goldhorse;
    private final NamespacedKey ironhorse;
    private final NamespacedKey qf;
    private final NamespacedKey skeleton;
    private final NamespacedKey zombie;
    private final NamespacedKey silk;
    private final NamespacedKey creeper;
    private final NamespacedKey af;
    private final NamespacedKey enderman;
    private final NamespacedKey evoker;
    private final NamespacedKey vindicator;
    private final NamespacedKey shulker;
    private final NamespacedKey phantom;
    private final NamespacedKey slime;
    private final NamespacedKey sm;
    private final NamespacedKey wither;
    private final NamespacedKey squid;
    private final NamespacedKey mn;
    private final NamespacedKey sheep;
    private final NamespacedKey bl;
    private final NamespacedKey nw;
    private final NamespacedKey end;
    private final NamespacedKey sh;
    private final NamespacedKey pf;
    private final NamespacedKey trident;
    private final NamespacedKey spawner;
    private final NamespacedKey diamondhorse;
    private final NamespacedKey dragonegg;
    private final NamespacedKey saddle;
    private final NamespacedKey qq;
    private final NamespacedKey exp;
    private final NamespacedKey eff;
    private final NamespacedKey unb;
    private final NamespacedKey sq;
    private final NamespacedKey rp;
    private final NamespacedKey ch;
    private final NamespacedKey draghead;
    private final NamespacedKey qr;
    private final NamespacedKey cob;
    private final NamespacedKey bm;
    private final NamespacedKey rm;
    private final NamespacedKey sponge;





    public RecipesManager(JavaPlugin plugin) {
        this.plugin = plugin;
        this.draghead = new NamespacedKey(plugin, "draghead");
        this.rm = new NamespacedKey(plugin, "rm");
        this.bm = new NamespacedKey(plugin, "bm");
        this.cob = new NamespacedKey(plugin, "cob");
        this.sponge = new NamespacedKey(plugin, "sponge");
        this.rp = new NamespacedKey(plugin, "rp");
        this.sq = new NamespacedKey(plugin, "sq");
        this.unb = new NamespacedKey(plugin, "unb");
        this.eff = new NamespacedKey(plugin, "eff");
        this.af = new NamespacedKey(plugin, "af");
        this.exp = new NamespacedKey(plugin, "exp");
        this.nw = new NamespacedKey(plugin, "nw");
        this.bl = new NamespacedKey(plugin, "bl");
        this.pf = new NamespacedKey(plugin, "pf");
        this.qf = new NamespacedKey(plugin, "qf");
        this.ch = new NamespacedKey(plugin, "ch");
        this.trident = new NamespacedKey(plugin, "trident");
        this.dragonegg = new NamespacedKey(plugin, "dragonegg");
        this.zombie = new NamespacedKey(plugin, "zombie");
        this.skeleton = new NamespacedKey(plugin, "skeleton");
        this.qq = new NamespacedKey(plugin, "qq");
        this.creeper = new NamespacedKey(plugin, "creeper");
        this.enderman = new NamespacedKey(plugin, "enderman");
        this.evoker = new NamespacedKey(plugin, "evoker");
        this.vindicator = new NamespacedKey(plugin, "vindicator");
        this.shulker = new NamespacedKey(plugin, "shulker");
        this.phantom = new NamespacedKey(plugin, "phantom");
        this.slime = new NamespacedKey(plugin, "slime");
        this.wither = new NamespacedKey(plugin, "wither");
        this.squid = new NamespacedKey(plugin, "squid");
        this.sheep = new NamespacedKey(plugin, "sheep");
        this.end = new NamespacedKey(plugin, "end");
        this.spawner = new NamespacedKey(plugin, "spawner");
        this.goldhorse = new NamespacedKey(plugin, "goldhorse");
        this.diamondhorse = new NamespacedKey(plugin, "diamondhorse");
        this.saddle = new NamespacedKey(plugin, "saddle");
        this.ironhorse = new NamespacedKey(plugin, "ironhorse");
        this.silk = new NamespacedKey(plugin, "silktouch");
        this.sh = new NamespacedKey(plugin, "sh");
        this.mn = new NamespacedKey(plugin, "mn");
        this.sm = new NamespacedKey(plugin, "sm");
        this.qr = new NamespacedKey(plugin, "qr");

    }

    public NamespacedKey getZombieKey() {
        return zombie;
    }
    public NamespacedKey getChKey() {
        return ch;
    }
    public NamespacedKey getDragKey() {
        return draghead;
    }
    public NamespacedKey getRmKey() {
        return rm;
    }
    public NamespacedKey getBmKey() {
        return bm;
    }
    public NamespacedKey getNwKey() {
        return nw;
    }
    public NamespacedKey getSpongeKey() {
        return sponge;
    }
    public NamespacedKey getCobKey() {
        return cob;
    }
    public NamespacedKey getQqKey() {
        return qq;
    }
    public NamespacedKey getBlKey() {
        return bl;
    }
    public NamespacedKey getRpKey() {
        return rp;
    }
    public NamespacedKey getEndKey() {
        return end;
    }
    public NamespacedKey getQfKey() {
        return qf;
    }
    public NamespacedKey getQrKey() {
        return qr;
    }
    public NamespacedKey getAfKey() {
        return af;
    }
    public NamespacedKey getSqKey() {
        return sq;
    }
    public NamespacedKey getTridentKey() {
        return trident;
    }
    public NamespacedKey getPfKey() {
        return pf;
    }
    public NamespacedKey getSmKey() {
        return sm;
    }
    public NamespacedKey getMnKey() {
        return mn;
    }
    public NamespacedKey getShKey() {
        return sh;
    }
    public NamespacedKey getUnbKey() {
        return unb;
    }
    public NamespacedKey getSilkKey() {
        return silk;
    }
    public NamespacedKey getEffKey() {
        return eff;
    }
    public NamespacedKey getExpKey() {
        return exp;
    }
    public NamespacedKey getSaddleKey() {
        return saddle;
    }
    public NamespacedKey getIronHorseKey() {
        return ironhorse;
    }
    public NamespacedKey getDragonEgg() {
        return dragonegg;
    }
    public NamespacedKey getGoldHorseKey() {
        return goldhorse;
    }
    public NamespacedKey getDiamondHorseKey() {
        return diamondhorse;
    }
    public NamespacedKey getSkeletonKey() {
        return skeleton;
    }
    public NamespacedKey getCreeperKey() {
        return creeper;
    }
    public NamespacedKey getEndermanKey() {
        return enderman;
    }
    public NamespacedKey getEvokerKey() {
        return evoker;
    }
    public NamespacedKey getVindicatorKey() {
        return vindicator;
    }
    public NamespacedKey getShulkerKey() {
        return shulker;
    }
    public NamespacedKey getPhantomKey() {
        return phantom;
    }
    public NamespacedKey getSlimeKey() {
        return slime;
    }
    public NamespacedKey getWitherKey() {
        return wither;
    }
    public NamespacedKey getSquidKey() {
        return squid;
    }
    public NamespacedKey getSheepKey() {
        return sheep;
    }
    public NamespacedKey getSpawnerKey() {
        return spawner;
    }
}
