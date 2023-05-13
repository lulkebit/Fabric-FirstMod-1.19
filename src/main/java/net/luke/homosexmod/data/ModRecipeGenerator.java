package net.luke.homosexmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.luke.homosexmod.block.ModBlocks;
import net.luke.homosexmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(
                exporter,
                List.of(ModItems.RAW_CITRINE),
                RecipeCategory.MISC,
                ModItems.CITRINE,
                0.7f,
                200,
                "citrine"
        );

        offerReversibleCompactingRecipes(
                exporter,
                RecipeCategory.BUILDING_BLOCKS,
                ModItems.CITRINE,
                RecipeCategory.DECORATIONS,
                ModBlocks.CITRINE_BLOCK
        );
    }
}
