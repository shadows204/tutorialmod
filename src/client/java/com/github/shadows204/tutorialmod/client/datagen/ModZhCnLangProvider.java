package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput,"zh_cn" , registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        //Tools
        translationBuilder.add(ModItems.PROSPECTOR,"简易探矿器");

        //Items
        translationBuilder.add(ModItems.ICE_ETHER,"冰乙醚");
        translationBuilder.add(ModItems.RAW_ICE_ETHER,"粗冰乙醚");
        translationBuilder.add(ModItems.CARDBOARD,"纸板");

        //Foods
        translationBuilder.add(ModItems.CORN,"玉米");
        translationBuilder.add(ModItems.STRAWBERRY,"草莓");
        translationBuilder.add(ModItems.CHEESE,"奶酪");
        translationBuilder.add(ModItems.CURSED_GOLDEN_APPLE,"负魔金苹果");

        //Fuels
        translationBuilder.add(ModItems.ANTHRACITE,"无烟煤");

        //Blocks
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"冰乙醚方块");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK,"粗冰乙醚方块");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE,"冰乙醚矿石");

        //ItemGroup Tabs
        translationBuilder.add("itemGroup.tutorialmod","Tutorial模组物品");
        translationBuilder.add("itemGroup.tutorialmod2","Tutorial:方块");
        translationBuilder.add("itemGroup.tutorialmod_foods","Tutorial:食物");
        translationBuilder.add("itemGroup.tutorialmod_tools","Tutorial:实用工具");
    }
}
