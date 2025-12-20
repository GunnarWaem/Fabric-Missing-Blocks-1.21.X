package net.gsaurus.missingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gsaurus.missingblocks.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
            }
        };
    }

    @Override
    public String getName() {
        return "Missing Blocks Recipes";
    }
}
