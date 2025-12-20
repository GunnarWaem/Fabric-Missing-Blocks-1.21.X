package net.gsaurus.missingblocks.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.gsaurus.missingblocks.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool prismarineBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);

        stonePool.wall(ModBlocks.STONE_WALL);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        prismarineBricksPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        purpurPool.wall(ModBlocks.PURPUR_WALL);
        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
