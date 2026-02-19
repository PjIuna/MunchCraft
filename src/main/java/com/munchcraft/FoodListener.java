package com.munchcraft;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class FoodListener implements Listener {
    private final NamespacedKey foodKey;

    public FoodListener(NamespacedKey foodKey) {
        this.foodKey = foodKey;
    }

    @EventHandler(ignoreCancelled = true)
    public void onCustomFoodUse(PlayerInteractEvent event) {
        if (event.getHand() != EquipmentSlot.HAND || !event.getAction().isRightClick()) {
            return;
        }

        ItemStack item = event.getItem();
        if (item == null || !item.hasItemMeta()) {
            return;
        }

        ItemMeta meta = item.getItemMeta();
        String id = meta.getPersistentDataContainer().get(foodKey, PersistentDataType.STRING);
        if (id == null) {
            return;
        }

        CustomFood.byId(id).ifPresent(food -> {
            event.setCancelled(true);
            Player player = event.getPlayer();
            if (player.getFoodLevel() >= 20) {
                player.sendMessage(Component.text("You're already full!", NamedTextColor.GRAY));
                return;
            }

            player.setFoodLevel(Math.min(20, player.getFoodLevel() + food.hunger()));
            player.setSaturation(Math.min(20f, player.getSaturation() + food.saturation()));
            player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EAT, 1f, 1f);

            item.setAmount(item.getAmount() - 1);
        });
    }
}
