package com.munchcraft;

import org.bukkit.NamespacedKey;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class MunchCraftPlugin extends JavaPlugin {
    private NamespacedKey foodKey;

    @Override
    public void onEnable() {
        this.foodKey = new NamespacedKey(this, "custom_food_id");

        getServer().getPluginManager().registerEvents(new FoodListener(foodKey), this);

        PluginCommand command = getCommand("munchcraft");
        if (command != null) {
            FoodCommand foodCommand = new FoodCommand(this);
            command.setExecutor(foodCommand);
            command.setTabCompleter(foodCommand);
        }
    }

    public NamespacedKey foodKey() {
        return foodKey;
    }
}
