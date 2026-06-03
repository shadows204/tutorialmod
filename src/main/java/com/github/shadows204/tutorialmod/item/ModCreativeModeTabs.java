package com.github.shadows204.tutorialmod.item;

import com.github.shadows204.tutorialmod.TutorialMod;
import com.github.shadows204.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> TUTORIAL_TAB = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"tutorialmod"));
    public static final CreativeModeTab TUTORIAL = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModItems.ICE_ETHER)).title(Component.translatable("itemGroup.tutorial")).displayItems((parameters, output) -> {
        output.accept(ModItems.ICE_ETHER);
        output.accept(ModItems.RAW_ICE_ETHER);
        output.accept(ModItems.CARDBOARD);

    }).build();

    public static final ResourceKey<CreativeModeTab> TUTORIAL_TAB2 = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"tutorialmod_blocks"));
    public static final CreativeModeTab TUTORIAL2 = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModBlocks.ICE_ETHER_ORE)).title(Component.translatable("itemGroup.tutorial2")).displayItems((parameters, output) -> {
        output.accept(ModBlocks.ICE_ETHER_BLOCK);
        output.accept(ModBlocks.RAW_ICE_ETHER_BLOCK);
        output.accept(ModBlocks.ICE_ETHER_ORE);

    }).build();


    public static void register(){
        TutorialMod.LOGGER.info("Registering Custom Creative Mode Tab for"+TutorialMod.MOD_ID);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB,TUTORIAL);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB2,TUTORIAL2);
    }
}
