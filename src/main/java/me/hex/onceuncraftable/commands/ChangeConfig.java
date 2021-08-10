package me.hex.onceuncraftable.commands;

import me.hex.onceuncraftable.OnceUnCraftable;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ChangeConfig implements CommandExecutor {
    private final JavaPlugin plugin;

    public ChangeConfig(OnceUnCraftable plugin) {

        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("mineablespawners")) {
            if (!sender.hasPermission("once.mineable")) {
                sender.sendMessage("You don't have access to this command!. you need the permission 'once.mineable'.");
                return false;
            }

            if (!(args.length > 0)) {
                return false;
            }

            if (args[0].equals("true")) {

                if (plugin.getConfig().getBoolean("mine-spawners-with-silk-touch")) {
                    sender.sendMessage(ChatColor.GREEN + "It's already true!");
                    return true;

                }
                plugin.getConfig().set("mine-spawners-with-silk-touch", true);
                sender.sendMessage(ChatColor.GREEN + "Mineable spawners is turned on!");
                plugin.saveConfig();
                return true;
            }

            if (args[0].equals("false")) {
                if (!plugin.getConfig().getBoolean("mine-spawners-with-silk-touch")) {
                    sender.sendMessage(ChatColor.GREEN + "It's already false!");
                    return true;
                }
                plugin.getConfig().set("mine-spawners-with-silk-touch", false);
                sender.sendMessage(ChatColor.GREEN + "Mineable spawners is turned off!");
                plugin.saveConfig();
                return true;


            }
            if (!args[0].contains("true") && !args[0].contains("false")) {

                sender.sendMessage("You can only set mineable spawners to 'true' or 'false'!");

            }
            return true;
        }

        if (command.getName().equals("craftenchants")) {
            if (!sender.hasPermission("once.craftenchants")) {
                sender.sendMessage("You don't have access to this command!. you need the permission 'once.craftenchants'.");
                return true;
            }

            if (!(args.length > 0)) {
                sender.sendMessage("/craftwnchants true/false");
                return false;
            }

            if (args[0].equals("true")) {
                if (plugin.getConfig().getBoolean("craft-enchants")) {
                    sender.sendMessage(ChatColor.GREEN + "It's Already true!");
                    return true;
                }

                plugin.getConfig().set("craft-enchants", true);
                sender.sendMessage(ChatColor.GREEN + "Craft enchanted is turned on!");
                plugin.saveConfig();
                return true;
            }


            if (args[0].equals("false")) {
                if (!plugin.getConfig().getBoolean("craft-enchants")) {
                    sender.sendMessage(ChatColor.GREEN + "It's Already false!");
                    return true;
                }

                plugin.getConfig().set("craft-enchants", false);
                sender.sendMessage(ChatColor.GREEN + "Craft enchanted is turned off!");
                plugin.saveConfig();
                return true;
            }

            if (!(args[0].equalsIgnoreCase("true") || !(args[0].equalsIgnoreCase("false")))) {

                sender.sendMessage("You can only set craftable enchants to 'true' or 'false'!");
            }
            return true;
        }
        if(command.getName().equals("onceuncraftable")){
            if(!sender.hasPermission("once.reload")){
                sender.sendMessage(ChatColor.RED+ "You do not have required permissions. (once.reload)!");
                return true;
            }
            if(args.length == 0){
                return false;
            }
            if(!args[0].equals("reload")){
                sender.sendMessage(ChatColor.RED + "Use /onceuncraftable reload to reload the config!");
                sender.sendMessage(ChatColor.GREEN + "Or /help onceuncraftable");
                return true;
            }
            sender.sendMessage(ChatColor.GREEN + "Done! Reloaded config.yml!");
            plugin.reloadConfig();
        }
        return true;
    }
}