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
        translationBuilder.add(ModItems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(ModItems.RAW_ICE_ETHER,"Raw Ice Ether");
        translationBuilder.add(ModItems.CARDBOARD,"Cardboard");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK,"Raw Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE,"Ice Ether Ore");

        translationBuilder.add("itemGroup.tutorialmod","Tutorial Mod Items");
        translationBuilder.add("itemGroup.tutorialmod2","Tutorial Mod Items:Blocks");
    }
}
