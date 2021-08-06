package me.hex.onceuncraftable.events;

import me.hex.onceuncraftable.Onceuncraftable;
import me.hex.onceuncraftable.RecipesManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class onJoin implements Listener {
    private final RecipesManager recipes;

    public onJoin(RecipesManager recipes) {
    this.recipes = recipes;
    }
@EventHandler
    public void onJoinEvent(PlayerJoinEvent e){
        e.getPlayer().discoverRecipe(recipes.getZombieKey());
        e.getPlayer().discoverRecipe(recipes.getDiamondHorseKey());
        e.getPlayer().discoverRecipe(recipes.getGoldHorseKey());
        e.getPlayer().discoverRecipe(recipes.getDragonEgg());
        e.getPlayer().discoverRecipe(recipes.getCreeperKey());
        e.getPlayer().discoverRecipe(recipes.getSheepKey());
        e.getPlayer().discoverRecipe(recipes.getSkeletonKey());
        e.getPlayer().discoverRecipe(recipes.getEndermanKey());
        e.getPlayer().discoverRecipe(recipes.getSlimeKey());
        e.getPlayer().discoverRecipe(recipes.getEndKey());
        e.getPlayer().discoverRecipe(recipes.getPhantomKey());
        e.getPlayer().discoverRecipe(recipes.getEvokerKey());
        e.getPlayer().discoverRecipe(recipes.getTridentKey());
        e.getPlayer().discoverRecipe(recipes.getSquidKey());
        e.getPlayer().discoverRecipe(recipes.getSpawnerKey());
        e.getPlayer().discoverRecipe(recipes.getWitherKey());
        e.getPlayer().discoverRecipe(recipes.getVindicatorKey());
        e.getPlayer().discoverRecipe(recipes.getShulkerKey());
        e.getPlayer().discoverRecipe(recipes.getIronHorseKey());
        e.getPlayer().discoverRecipe(recipes.getSaddleKey());
        if(Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")){
            e.getPlayer().discoverRecipe(recipes.getUnbKey());
            e.getPlayer().discoverRecipe(recipes.getShKey());
            e.getPlayer().discoverRecipe(recipes.getSilkKey());
            e.getPlayer().discoverRecipe(recipes.getMnKey());
            e.getPlayer().discoverRecipe(recipes.getEffKey());
            e.getPlayer().discoverRecipe(recipes.getSmKey());
            e.getPlayer().discoverRecipe(recipes.getQqKey());
            e.getPlayer().discoverRecipe(recipes.getBlKey());
            e.getPlayer().discoverRecipe(recipes.getQfKey());
            e.getPlayer().discoverRecipe(recipes.getQrKey());
            e.getPlayer().discoverRecipe(recipes.getPfKey());
            e.getPlayer().discoverRecipe(recipes.getSqKey());
            e.getPlayer().discoverRecipe(recipes.getAfKey());
            e.getPlayer().discoverRecipe(recipes.getChKey());
            e.getPlayer().discoverRecipe(recipes.getRpKey());
            e.getPlayer().discoverRecipe(recipes.getRmKey());
            e.getPlayer().discoverRecipe(recipes.getBmKey());
            e.getPlayer().discoverRecipe(recipes.getSpongeKey());
            e.getPlayer().discoverRecipe(recipes.getCobKey());
            e.getPlayer().discoverRecipe(recipes.getDragKey());
            e.getPlayer().discoverRecipe(recipes.getNwKey());


        } else {
            System.out.println("craft-enchants in Config.yml of OnceUnCraftable is set to false!");
        }


    if(e.getPlayer().hasDiscoveredRecipe(recipes.getZombieKey())){
    System.out.println("[onceuncraftable]: Player has the recipe, no need to give again.");
} else {
        e.getPlayer().discoverRecipe(recipes.getDragKey());
        e.getPlayer().discoverRecipe(recipes.getRmKey());
        e.getPlayer().discoverRecipe(recipes.getBmKey());
        e.getPlayer().discoverRecipe(recipes.getNwKey());
        e.getPlayer().discoverRecipe(recipes.getSpongeKey());
        e.getPlayer().discoverRecipe(recipes.getCobKey());
        e.getPlayer().discoverRecipe(recipes.getZombieKey());
    e.getPlayer().discoverRecipe(recipes.getTridentKey());
    e.getPlayer().discoverRecipe(recipes.getIronHorseKey());
    e.getPlayer().discoverRecipe(recipes.getDiamondHorseKey());
    e.getPlayer().discoverRecipe(recipes.getGoldHorseKey());
    e.getPlayer().discoverRecipe(recipes.getDragonEgg());
    e.getPlayer().discoverRecipe(recipes.getCreeperKey());
    e.getPlayer().discoverRecipe(recipes.getSheepKey());
        e.getPlayer().discoverRecipe(recipes.getEndKey());
        e.getPlayer().discoverRecipe(recipes.getSkeletonKey());
    e.getPlayer().discoverRecipe(recipes.getEndermanKey());
    e.getPlayer().discoverRecipe(recipes.getSlimeKey());
    e.getPlayer().discoverRecipe(recipes.getPhantomKey());
    e.getPlayer().discoverRecipe(recipes.getEvokerKey());
    e.getPlayer().discoverRecipe(recipes.getSquidKey());
    e.getPlayer().discoverRecipe(recipes.getSpawnerKey());
    e.getPlayer().discoverRecipe(recipes.getWitherKey());
    e.getPlayer().discoverRecipe(recipes.getVindicatorKey());
    e.getPlayer().discoverRecipe(recipes.getShulkerKey());
    e.getPlayer().discoverRecipe(recipes.getSaddleKey());
}
    }
}
