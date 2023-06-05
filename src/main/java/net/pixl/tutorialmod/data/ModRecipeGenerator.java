package net.pixl.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.pixl.tutorialmod.block.ModBlocks;
import net.pixl.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 200, "citrine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.DECORATIONS,
                ModBlocks.CITRINE_BLOCK);

        // JUST AN EXAMPLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_CITRINE)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.CITRINE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_CITRINE)));


        // [[AMETHYST HELMET RECIPE]]
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AMETHYST_HELMET)));

        // [[AMETHYST CHESTPLATE RECIPE]]
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AMETHYST_CHESTPLATE)));

        // [[AMETHYST LEGGINGS RECIPE]]
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AMETHYST_LEGGINGS)));

        // [[AMETHYST BOOTS RECIPE]]
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_BOOTS)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AMETHYST_BOOTS)));
    }
}