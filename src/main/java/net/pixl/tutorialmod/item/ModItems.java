package net.pixl.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.pixl.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pixl.tutorialmod.block.ModBlocks;
import net.pixl.tutorialmod.entity.ModEntities;
import net.pixl.tutorialmod.item.custom.AmethystArmorItem;
import net.pixl.tutorialmod.item.custom.AnimatedBlockItem;
import net.pixl.tutorialmod.item.custom.AnimatedItem;

public class ModItems {
    // [[CITRINE ITEMS]]
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));

    // [[TIGER  SPAWN WGG]]
    public static final Item TIGER_SPAWN_EGG = registerItem("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    // [[ANIMATED ITEMS / BLOCKS]]
    public static final Item ANIMATED_ITEM = registerItem("animated_item",
            new AnimatedItem(new FabricItemSettings()));
    public static final Item ANIMATED_BLOCK_ITEM = registerItem("animated_block",
            new AnimatedBlockItem(ModBlocks.ANIMATED_BLOCK, new FabricItemSettings()));

    // [[AMETHYST ARMOR]]
    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);

        addToItemGroup(ModItemGroup.CITRINE, CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, RAW_CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, TIGER_SPAWN_EGG);
        addToItemGroup(ModItemGroup.CITRINE, ANIMATED_ITEM);
        addToItemGroup(ModItemGroup.CITRINE, ANIMATED_BLOCK_ITEM);

        addToItemGroup(ModItemGroup.CITRINE, AMETHYST_HELMET);
        addToItemGroup(ModItemGroup.CITRINE, AMETHYST_CHESTPLATE);
        addToItemGroup(ModItemGroup.CITRINE, AMETHYST_LEGGINGS);
        addToItemGroup(ModItemGroup.CITRINE, AMETHYST_BOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}