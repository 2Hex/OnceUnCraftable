package me.hex.onceuncraftable.commands;

import me.hex.onceuncraftable.Onceuncraftable;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Changeconfig implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("mineablespawners")) {

            if (!sender.hasPermission("once.mineable")) {
                sender.sendMessage("You don't have access to this command!. you need the permission 'once.mineable'.");
                return false;
            }
            if (args.length > 0) {

                if (args[0].equals("true")) {
                    Onceuncraftable.INSTANCE.getConfig().set("mine-spawners-with-silk-touch", true);
                    sender.sendMessage(ChatColor.GREEN + "Mineable spawners is turned on!");
                    Onceuncraftable.INSTANCE.saveConfig();

                }
                if (Onceuncraftable.INSTANCE.getConfig().getBoolean("mine-spawners-with-silk-touch")) {
                    sender.sendMessage(ChatColor.GREEN + "It's already true!");

                }

                if (args[0].equals("false")) {

                    Onceuncraftable.INSTANCE.getConfig().set("mine-spawners-with-silk-touch", false);
                    sender.sendMessage(ChatColor.GREEN + "Mineable spawners is turned off!");
                    Onceuncraftable.INSTANCE.saveConfig();

                }
                if (!Onceuncraftable.INSTANCE.getConfig().getBoolean("mine-spawners-with-silk-touch")) {
                    sender.sendMessage(ChatColor.GREEN + "It's already false!");

                }
                if (!(args[0].equalsIgnoreCase("true") || !(args[0].equalsIgnoreCase("false")))) {

                    sender.sendMessage("You can only set mineable spawners to 'true' or 'false'!");

                }
                return true;
            }
        }
        if (command.getName().equals("craftenchants")) {
            if (!sender.hasPermission("once.craftenchants")) {
                sender.sendMessage("You don't have access to this command!. you need the permission 'once.craftenchants'.");
                return true;
            }
            if (args.length > 0) {
                if (args[0].equals("true")) {
                    if (!Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
                        Onceuncraftable.INSTANCE.getConfig().set("craft-enchants", true);
                        sender.sendMessage(ChatColor.GREEN + "Craft enchanted is turned on!");
                        Onceuncraftable.INSTANCE.saveConfig();
                        return true;
                    }
                    sender.sendMessage(ChatColor.GREEN + "It's Already true!");


                }


                if (args[0].equals("false")) {
                    if (Onceuncraftable.INSTANCE.getConfig().getBoolean("craft-enchants")) {
                        Onceuncraftable.INSTANCE.getConfig().set("craft-enchants", false);
                        sender.sendMessage(ChatColor.GREEN + "Craft enchanted is turned off!");
                        Onceuncraftable.INSTANCE.saveConfig();
                        return true;
                    }
                    sender.sendMessage(ChatColor.GREEN + "It's Already false!");

                }

                if (!(args[0].equalsIgnoreCase("true") || !(args[0].equalsIgnoreCase("false")))) {

                    sender.sendMessage("You can only set craftable enchants to 'true' or 'false'!");
                }
            }

            return true;
        }
        return true;
    }
}







