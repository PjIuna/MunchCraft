package com.munchcraft;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FoodCommand implements CommandExecutor, TabCompleter {
    private final MunchCraftPlugin plugin;

    public FoodCommand(MunchCraftPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (args.length < 2 || !args[0].equalsIgnoreCase("give")) {
            player.sendMessage(Component.text("Usage: /munchcraft give <food_id|all> [amount]", NamedTextColor.YELLOW));
            return true;
        }

        int amount = 1;
        if (args.length >= 3) {
            try {
                amount = Math.max(1, Integer.parseInt(args[2]));
            } catch (NumberFormatException ex) {
                player.sendMessage(Component.text("Amount must be a number.", NamedTextColor.RED));
                return true;
            }
        }

        if (args[1].equalsIgnoreCase("all")) {
            Arrays.stream(CustomFood.values()).forEach(food -> player.getInventory().addItem(food.createItem(plugin.foodKey(), 1)));
            player.sendMessage(Component.text("You received one of each custom food item.", NamedTextColor.GREEN));
            return true;
        }

        CustomFood.fromInput(args[1]).ifPresentOrElse(food -> {
            player.getInventory().addItem(food.createItem(plugin.foodKey(), amount));
            player.sendMessage(Component.text("Given " + amount + "x " + food.displayName(), NamedTextColor.GREEN));
        }, () -> player.sendMessage(Component.text("Unknown food. Try tab completion or /munchcraft give all", NamedTextColor.RED)));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return List.of("give");
        }
        if (args.length == 2 && args[0].equalsIgnoreCase("give")) {
            return Arrays.stream(CustomFood.values())
                .map(Enum::name)
                .map(name -> name.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());
        }
        return List.of();
    }
}
