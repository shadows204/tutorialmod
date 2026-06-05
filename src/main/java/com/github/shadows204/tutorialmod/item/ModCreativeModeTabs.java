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
    public static final CreativeModeTab TUTORIAL = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModItems.ICE_ETHER)).title(Component.translatable("itemGroup.tutorialmod")).displayItems((parameters, output) -> {
        output.accept(ModItems.ICE_ETHER);
        output.accept(ModItems.RAW_ICE_ETHER);
        output.accept(ModItems.CARDBOARD);
        output.accept(ModItems.ANTHRACITE);

    }).build();

    public static final ResourceKey<CreativeModeTab> TUTORIAL_TAB2 = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"tutorialmod_blocks"));
    public static final CreativeModeTab TUTORIAL2 = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModBlocks.ICE_ETHER_ORE)).title(Component.translatable("itemGroup.tutorialmod2")).displayItems((parameters, output) -> {
        output.accept(ModBlocks.ICE_ETHER_BLOCK);
        output.accept(ModBlocks.RAW_ICE_ETHER_BLOCK);
        output.accept(ModBlocks.ICE_ETHER_ORE);
        output.accept(ModBlocks.ICE_ETHER_STAIRS);
        output.accept(ModBlocks.ICE_ETHER_SLAB);
        output.accept(ModBlocks.ICE_ETHER_BUTTON);
        output.accept(ModBlocks.ICE_ETHER_PLATE);
        output.accept(ModBlocks.ICE_ETHER_FENCE);
        output.accept(ModBlocks.ICE_ETHER_FENCE_GATE);
        output.accept(ModBlocks.ICE_ETHER_WALL);
        output.accept(ModBlocks.ICE_ETHER_DOOR);
        output.accept(ModBlocks.ICE_ETHER_TRAPDOOR);

    }).build();


    public static final ResourceKey<CreativeModeTab> TUTORIAL_TAB_FOODS = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"tutorialmod_foods"));
    public static final CreativeModeTab TUTORIAL3 = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModItems.CORN)).title(Component.translatable("itemGroup.tutorialmod_foods")).displayItems((parameters, output) -> {
        output.accept(ModItems.CORN);
        output.accept(ModItems.STRAWBERRY);
        output.accept(ModItems.CHEESE);
        output.accept(ModItems.CURSED_GOLDEN_APPLE);

    }).build();


    public static final ResourceKey<CreativeModeTab> TUTORIAL_TAB_TOOLS = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,"tutorialmod_tools"));
    public static final CreativeModeTab TUTORIAL4 = FabricCreativeModeTab.builder().icon(()->new ItemStack(ModItems.PROSPECTOR)).title(Component.translatable("itemGroup.tutorialmod_tools")).displayItems((parameters, output) -> {
        output.accept(ModItems.PROSPECTOR);

    }).build();


    public static void register(){
        TutorialMod.LOGGER.info("Registering Custom Creative Mode Tab for"+TutorialMod.MOD_ID);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB,TUTORIAL);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB2,TUTORIAL2);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB_FOODS,TUTORIAL3);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,TUTORIAL_TAB_TOOLS,TUTORIAL4);
    }
}
