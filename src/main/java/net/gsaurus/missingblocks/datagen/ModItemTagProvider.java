package net.gsaurus.missingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gsaurus.missingblocks.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(net.minecraft.registry.tag.ItemTags.WALLS)
                .add(ModBlocks.STONE_WALL.asItem())
                .add(ModBlocks.POLISHED_GRANITE_WALL.asItem())
                .add(ModBlocks.POLISHED_ANDESITE_WALL.asItem())
                .add(ModBlocks.POLISHED_DIORITE_WALL.asItem())
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL.asItem())
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.asItem())
                .add(ModBlocks.PRISMARINE_BRICK_WALL.asItem())
                .add(ModBlocks.DARK_PRISMARINE_WALL.asItem())
                .add(ModBlocks.PURPUR_WALL.asItem())
                .add(ModBlocks.SMOOTH_QUARTZ_WALL.asItem());

    }
}
