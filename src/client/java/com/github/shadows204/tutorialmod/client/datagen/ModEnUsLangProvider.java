package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput,"en_us" , registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        //Tools
        translationBuilder.add(ModItems.PROSPECTOR,"Prospector");

        //Common Items
        translationBuilder.add(ModItems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(ModItems.RAW_ICE_ETHER,"Raw Ice Ether");
        translationBuilder.add(ModItems.CARDBOARD,"Cardboard");

        //Foods
        translationBuilder.add(ModItems.CORN,"Corn");
        translationBuilder.add(ModItems.STRAWBERRY,"Strawberry");
        translationBuilder.add(ModItems.CHEESE,"Cheese");
        translationBuilder.add(ModItems.CURSED_GOLDEN_APPLE,"Cursed Golden Apple");

        //Fuels
        translationBuilder.add(ModItems.ANTHRACITE,"Anthracite");

        //Common Blocks
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK,"Raw Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE,"Ice Ether Ore");

        //Stairs
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS,"Ice Ether Stairs");

        //Slabs
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB,"Ice Ether Slab");

        //Buttons
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON,"Ice Ether Button");

        //Plates
        translationBuilder.add(ModBlocks.ICE_ETHER_PLATE,"Ice Ether Pressure Plate");

        //Fences
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE,"Ice Ether Fence");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE,"Ice Ether Fence Gate");

        //Walls
        translationBuilder.add(ModBlocks.ICE_ETHER_WALL,"Ice Ether Wall");

        //Doors
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR,"Ice Ether Door");

        //TrapDoors
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR,"Ice Ether Trapdoor");

        //ItemGroup Tabs
        translationBuilder.add("itemGroup.tutorialmod","Tutorial Mod Items");
        translationBuilder.add("itemGroup.tutorialmod2","Tutorial Mod Items:Blocks");
        translationBuilder.add("itemGroup.tutorialmod_foods","Tutorial Mod Items:Foods");
        translationBuilder.add("itemGroup.tutorialmod_tools","Tutorial Mod Items:Tools");
    }
}
