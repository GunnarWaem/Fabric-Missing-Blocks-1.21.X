package net.gsaurus.missingblocks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gsaurus.missingblocks.MissingBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties.strength(2f).requiresTool()));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties.strength(2f).requiresTool()));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties.strength(2f).requiresTool()));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties.strength(2f).requiresTool()));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(properties.strength(2.0f).requiresTool()));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(properties.strength(2.0f).requiresTool()));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(properties.strength(1.5f).requiresTool()));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(properties.strength(1.5f).requiresTool()));
    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(properties.strength(1.5f).requiresTool()));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(properties.strength(2.0f).requiresTool()));


    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MissingBlocks.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(MissingBlocks.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MissingBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MissingBlocks.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        MissingBlocks.LOGGER.info("Registering Mod Blocks for " + MissingBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
