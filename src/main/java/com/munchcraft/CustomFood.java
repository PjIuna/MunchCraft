package com.munchcraft;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public enum CustomFood {
    DRAGONFRUIT("Dragonfruit", 5, 0.6f),
    PUMPKIN_PIE_DELUXE("Pumpkin Pie Deluxe", 6, 0.8f),
    GLAZED_DONUT("Glazed Donut", 7, 1.0f),
    CRISPY_BACON("Crispy Bacon", 8, 1.2f),
    AVOCADO_TOAST("Avocado Toast", 9, 1.4f),
    CHOCOLATE_CROISSANT("Chocolate Croissant", 10, 0.6f),
    SUSHI_ROLL("Sushi Roll", 11, 0.8f),
    SPICY_RAMEN("Spicy Ramen", 5, 1.0f),
    CHEESEBURGER("Cheeseburger", 6, 1.2f),
    GRILLED_CHEESE("Grilled Cheese", 7, 1.4f),
    APPLE_TART("Apple Tart", 8, 0.6f),
    BLUEBERRY_MUFFIN("Blueberry Muffin", 9, 0.8f),
    HONEY_GLAZED_HAM("Honey Glazed Ham", 10, 1.0f),
    CARROT_CAKE("Carrot Cake", 11, 1.2f),
    STRAWBERRY_SHORTCAKE("Strawberry Shortcake", 5, 1.4f),
    GARLIC_BREAD("Garlic Bread", 6, 0.6f),
    PANCAKES_WITH_SYRUP("Pancakes with Syrup", 7, 0.8f),
    MAPLE_WAFFLES("Maple Waffles", 8, 1.0f),
    FRIED_CHICKEN("Fried Chicken", 9, 1.2f),
    BUFFALO_WINGS("Buffalo Wings", 10, 1.4f),
    VEGGIE_WRAP("Veggie Wrap", 11, 0.6f),
    CAESAR_SALAD("Caesar Salad", 5, 0.8f),
    CAPRESE_SALAD("Caprese Salad", 6, 1.0f),
    TOMATO_SOUP("Tomato Soup", 7, 1.2f),
    BEEF_STEW("Beef Stew", 8, 1.4f),
    CHICKEN_POT_PIE("Chicken Pot Pie", 9, 0.6f),
    MACARONI_AND_CHEESE("Macaroni and Cheese", 10, 0.8f),
    FISH_AND_CHIPS("Fish and Chips", 11, 1.0f),
    CHOCOLATE_CAKE("Chocolate Cake", 5, 1.2f),
    LEMON_TART("Lemon Tart", 6, 1.4f),
    PEANUT_BUTTER_SANDWICH("Peanut Butter Sandwich", 7, 0.6f),
    NUTELLA_CREPE("Nutella Crepe", 8, 0.8f),
    TACO_SUPREME("Taco Supreme", 9, 1.0f),
    QUESADILLA("Quesadilla", 10, 1.2f),
    NACHOS_WITH_CHEESE("Nachos with Cheese", 11, 1.4f),
    STUFFED_PEPPERS("Stuffed Peppers", 5, 0.6f),
    MASHED_POTATOES("Mashed Potatoes", 6, 0.8f),
    CORN_ON_THE_COB("Corn on the Cob", 7, 1.0f),
    GRILLED_SALMON("Grilled Salmon", 8, 1.2f),
    SHRIMP_COCKTAIL("Shrimp Cocktail", 9, 1.4f),
    CLAM_CHOWDER("Clam Chowder", 10, 0.6f),
    SPAGHETTI_BOLOGNESE("Spaghetti Bolognese", 11, 0.8f),
    LASAGNA("Lasagna", 5, 1.0f),
    MEATBALL_SUB("Meatball Sub", 6, 1.2f),
    HOT_DOG("Hot Dog", 7, 1.4f),
    ICE_CREAM_SUNDAE("Ice Cream Sundae", 8, 0.6f),
    MILKSHAKE("Milkshake", 9, 0.8f),
    FRUIT_SMOOTHIE("Fruit Smoothie", 10, 1.0f),
    COCONUT_RICE("Coconut Rice", 11, 1.2f),
    MANGO_STICKY_RICE("Mango Sticky Rice", 5, 1.4f),
    CHOCOLATE_CHIP_COOKIE("Chocolate Chip Cookie", 6, 0.6f),
    BROWNIE("Brownie", 7, 0.8f),
    CHEESECAKE("Cheesecake", 8, 1.0f),
    PECAN_PIE("Pecan Pie", 9, 1.2f),
    APPLE_CRUMBLE("Apple Crumble", 10, 1.4f),
    GARLIC_BUTTER_NOODLES("Garlic Butter Noodles", 11, 0.6f),
    SIZZLING_FAJITAS("Sizzling Fajitas", 5, 0.8f),
    STUFFED_MUSHROOMS("Stuffed Mushrooms", 6, 1.0f),
    GOLDEN_APPLE_PIE("Golden Apple Pie", 7, 1.2f),
    SLIMEBERRY_TART("Slimeberry Tart", 8, 1.4f),
    NETHER_WART_CAKE("Nether Wart Cake", 9, 0.6f),
    ENDERFRUIT_SALAD("Enderfruit Salad", 10, 0.8f),
    MAGMA_MELON_SLICE("Magma Melon Slice", 11, 1.0f),
    CREEPER_CRUNCH_CEREAL("Creeper Crunch Cereal", 5, 1.2f),
    GHASTLY_COTTON_CANDY("Ghastly Cotton Candy", 6, 1.4f),
    BLAZE_BISCUIT("Blaze Biscuit", 7, 0.6f),
    OBSIDIAN_CHOCOLATE_BAR("Obsidian Chocolate Bar", 8, 0.8f),
    REDSTONE_JELLY("Redstone Jelly", 9, 1.0f),
    PUMPKIN_SEED_BRITTLE("Pumpkin Seed Brittle", 10, 1.2f),
    CARROT_CUPCAKE("Carrot Cupcake", 11, 1.4f),
    BAKED_POTATO_SUPREME("Baked Potato Supreme", 5, 0.6f),
    MUSHROOM_RISOTTO("Mushroom Risotto", 6, 0.8f),
    HONEY_GLAZED_CARROTS("Honey Glazed Carrots", 7, 1.0f),
    GOLDEN_CARROT_TART("Golden Carrot Tart", 8, 1.2f),
    RABBIT_STEW_DELUXE("Rabbit Stew Deluxe", 9, 1.4f),
    FISH_PIE("Fish Pie", 10, 0.6f),
    SALMON_SUSHI("Salmon Sushi", 11, 0.8f),
    SEAWEED_WRAP("Seaweed Wrap", 5, 1.0f),
    SHRIMP_TEMPURA("Shrimp Tempura", 6, 1.2f),
    CHICKEN_SKEWERS("Chicken Skewers", 7, 1.4f),
    SPICY_CHILI_BOWL("Spicy Chili Bowl", 8, 0.6f),
    BEEF_TACO("Beef Taco", 9, 0.8f),
    PORK_RIBS("Pork Ribs", 10, 1.0f),
    LAMB_CHOPS("Lamb Chops", 11, 1.2f),
    FALAFEL_WRAP("Falafel Wrap", 5, 1.4f),
    VEGGIE_BURGER("Veggie Burger", 6, 0.6f),
    TOFU_STIR_FRY("Tofu Stir Fry", 7, 0.8f),
    EGGPLANT_PARMESAN("Eggplant Parmesan", 8, 1.0f),
    SPINACH_QUICHE("Spinach Quiche", 9, 1.2f),
    STUFFED_EGGPLANT("Stuffed Eggplant", 10, 1.4f),
    GARLIC_SHRIMP_PASTA("Garlic Shrimp Pasta", 11, 0.6f),
    LOBSTER_ROLL("Lobster Roll", 5, 0.8f),
    CRAB_CAKES("Crab Cakes", 6, 1.0f),
    CLAM_PIZZA("Clam Pizza", 7, 1.2f),
    CHEESE_FONDUE("Cheese Fondue", 8, 1.4f),
    CHOCOLATE_FONDUE("Chocolate Fondue", 9, 0.6f),
    STRAWBERRY_MILKSHAKE("Strawberry Milkshake", 10, 0.8f),
    BANANA_SPLIT("Banana Split", 11, 1.0f),
    CARAMEL_PUDDING("Caramel Pudding", 5, 1.2f),
    VANILLA_PUDDING("Vanilla Pudding", 6, 1.4f),
    MANGO_SORBET("Mango Sorbet", 7, 0.6f),
    BERRY_PARFAIT("Berry Parfait", 8, 0.8f),
    DRAGONFRUIT_SMOOTHIE("Dragonfruit Smoothie", 9, 1.0f),
    EMERALD_FRUIT_SALAD("Emerald Fruit Salad", 10, 1.2f),
    PUMPKIN_SPICE_LATTE("Pumpkin Spice Latte", 11, 1.4f),
    HOT_CHOCOLATE_WITH_MARSHMALLOWS("Hot Chocolate with Marshmallows", 5, 0.6f),
    WITCH_S_BREW_SOUP("Witch's Brew Soup", 6, 0.8f),
    POTION_OF_HUNGER_STEW("Potion of Hunger Stew", 7, 1.0f);

    private static final Material DISPLAY_MATERIAL = Material.COOKIE;

    private final String displayName;
    private final int hunger;
    private final float saturation;

    CustomFood(String displayName, int hunger, float saturation) {
        this.displayName = displayName;
        this.hunger = hunger;
        this.saturation = saturation;
    }

    public ItemStack createItem(NamespacedKey key, int amount) {
        ItemStack item = new ItemStack(DISPLAY_MATERIAL, amount);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(displayName, NamedTextColor.GOLD));
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, name());
        meta.lore(Arrays.asList(
            Component.text("Custom Food", NamedTextColor.DARK_PURPLE),
            Component.text("Hunger: +" + hunger, NamedTextColor.GREEN),
            Component.text("Saturation: +" + saturation, NamedTextColor.AQUA)
        ));
        item.setItemMeta(meta);
        return item;
    }

    public static Optional<CustomFood> byId(String id) {
        try {
            return Optional.of(CustomFood.valueOf(id));
        } catch (IllegalArgumentException ex) {
            return Optional.empty();
        }
    }

    public static Optional<CustomFood> fromInput(String input) {
        String normalized = input.trim().replace('-', '_').replace(' ', '_').toUpperCase(Locale.ROOT);
        return byId(normalized);
    }

    public String displayName() {
        return displayName;
    }

    public int hunger() {
        return hunger;
    }

    public float saturation() {
        return saturation;
    }
}
