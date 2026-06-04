package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<ItemLike> ICE_ETHER_LIST = List.of(ModItems.RAW_ICE_ETHER, ModBlocks.ICE_ETHER_ORE);

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider,recipeOutput) {
            @Override
            public void buildRecipes() {
                //Smelting Recipes
                oreSmelting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC,ModItems.ICE_ETHER, 0.7f, 200,"ice_ether");
                oreBlasting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC,ModItems.ICE_ETHER, 0.7f, 100,"ice_ether");

                oreSmelting(List.of(Items.COAL), RecipeCategory.MISC, CookingBookCategory.MISC,ModItems.ANTHRACITE, 0.1f, 500,"anthracite");
                oreBlasting(List.of(Items.COAL), RecipeCategory.MISC, CookingBookCategory.MISC,ModItems.ANTHRACITE, 0.1f, 50,"anthracite");


                //9 to 1 Block Recipes
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);


                //Cooking Recipes
                simpleCookingRecipe("campfire_cooking", CampfireCookingRecipe::new, 600,ModItems.RAW_ICE_ETHER,ModItems.ICE_ETHER,0.35f);


                //Shaped Recipes
                shaped(RecipeCategory.MISC, Items.SUGAR,3)
                        .pattern("###")
                        .define('#', Items.BEETROOT)
                        .unlockedBy("has_item", has(Items.BEETROOT))
                        .save(recipeOutput);

                shaped(RecipeCategory.FOOD,ModItems.CURSED_GOLDEN_APPLE,1)
                        .pattern("RRR")
                        .pattern("RAR")
                        .pattern("RRR")
                        .define('R', Items.ROTTEN_FLESH)
                        .define('A', Items.APPLE)
                        .unlockedBy("has_item_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .unlockedBy("has_item_apple", has(Items.APPLE))
                        .save(recipeOutput);

                shaped(RecipeCategory.MISC,ModItems.CARDBOARD,1)
                        .pattern("##")
                        .define('#', Items.PAPER)
                        .unlockedBy("has_item", has(Items.PAPER))
                        .save(recipeOutput);

                shaped(RecipeCategory.TOOLS,ModItems.PROSPECTOR,1)
                        .pattern("DCD")
                        .pattern("CIC")
                        .pattern("DCD")
                        .define('D', Items.DIAMOND)
                        .define('I',Items.IRON_BLOCK)
                        .define('C',ModItems.CARDBOARD)
                        .unlockedBy("has_item",has(Items.DIAMOND))
                        .unlockedBy("has_item_iron_block", has(Items.IRON_BLOCK))
                        .unlockedBy("has_item_cardboard", has(ModItems.CARDBOARD))
                        .save(recipeOutput);

                //Shapeless Recipes
                shapeless(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ICE_ETHER_ORE)
                        .requires(ModItems.RAW_ICE_ETHER)
                        .requires(Items.STONE)
                        .unlockedBy("has_item",has(ModItems.RAW_ICE_ETHER))
                        .unlockedBy("has_item_stone", has(Items.STONE))
                        .save(recipeOutput);

                shapeless(RecipeCategory.BUILDING_BLOCKS,ModItems.RAW_ICE_ETHER,9)
                        .requires(ModBlocks.RAW_ICE_ETHER_BLOCK)
                        .unlockedBy("has_item",has(ModBlocks.RAW_ICE_ETHER_BLOCK))
                        .save(recipeOutput);
            }
        };
    }

    @Override
    public String getName() {
        return "recipe generator";
    }
}
