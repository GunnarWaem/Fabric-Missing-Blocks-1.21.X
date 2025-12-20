package net.gsaurus.missingblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gsaurus.missingblocks.MissingBlocks;
import net.gsaurus.missingblocks.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MISSING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MissingBlocks.MOD_ID, "missing_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.STONE_WALL))
                    .displayName(Text.translatable("itemgroup.missingblocks.missing_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);
                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                    }).build());

    public static void registerItemGroups() {
        MissingBlocks.LOGGER.info("Registering Item Groups for " + MissingBlocks.MOD_ID);
    }
}
