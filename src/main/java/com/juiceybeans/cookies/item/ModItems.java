package com.juiceybeans.cookies.item;

import com.juiceybeans.cookies.AlyxCookies;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        AlyxCookies.LOGGER.info("Registered " + name + "!");
        return Registry.register(Registries.ITEM, new Identifier(AlyxCookies.MOD_ID, name), item);
    }

    public static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void addItemsToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.addBefore(Items.COOKIE, ModItems.COOKIE_BASE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.addAfter(Items.COOKIE, ModItems.JUMALU_COOKIE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.addAfter(Items.COOKIE, ModItems.LILI_COOKIE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.addAfter(Items.COOKIE, ModItems.ROBYN_COOKIE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.addAfter(Items.DRAGON_BREATH, ModItems.COOKIE_REAGENT));
        AlyxCookies.LOGGER.info("Added cookies to item groups!");

    }

    public static void registerModItems() {
        addItemsToItemGroup();
        AlyxCookies.LOGGER.info("Finished adding all cookies!");
    }
    public static final Item JUMALU_COOKIE = registerItem("jumalu_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.JUMALU_COOKIE).rarity(Rarity.UNCOMMON).maxCount(8)));
    public static final Item LILI_COOKIE = registerItem("lili_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.LILI_COOKIE).rarity(Rarity.UNCOMMON).maxCount(8)));
    public static final Item ROBYN_COOKIE = registerItem("robyn_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.ROBYN_COOKIE).rarity(Rarity.UNCOMMON).maxCount(8)));
    public static final Item COOKIE_REAGENT = registerItem("cookie_reagent", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COOKIE_BASE = registerItem("cookie_base", new Item(new FabricItemSettings().food(ModFoodComponents.COOKIE_BASE).rarity(Rarity.UNCOMMON)));
}
