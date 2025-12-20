package net.gsaurus.missingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gsaurus.missingblocks.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL);
    }
}
