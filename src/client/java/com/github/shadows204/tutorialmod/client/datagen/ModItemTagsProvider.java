package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.item.ModItems;
import com.github.shadows204.tutorialmod.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output,registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ModItemTags.FIRE_ETHER_TOOL_MATERIALS)
                .add(ModItems.FIRE_ETHER);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET)
                .add(ModItems.ICE_ETHER_CHESTPLATE)
                .add(ModItems.ICE_ETHER_LEGGINGS)
                .add(ModItems.ICE_ETHER_BOOTS);

        //Armor Types & Families
        valueLookupBuilder(ModItemTags.ICE_ETHER_ARMOR_MATERIALS)
                .add(ModItems.ICE_ETHER);
        valueLookupBuilder(ModItemTags.ICE_ETHER_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET)
                .add(ModItems.ICE_ETHER_CHESTPLATE)
                .add(ModItems.ICE_ETHER_LEGGINGS)
                .add(ModItems.ICE_ETHER_BOOTS);

        //Enchantments Giving
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.ICE_ETHER_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.ICE_ETHER_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.ICE_ETHER_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.ICE_ETHER_BOOTS);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.FIRE_ETHER_AXE);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.FIRE_ETHER_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.FIRE_ETHER_SHOVEL);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.FIRE_ETHER_HOE);
        valueLookupBuilder(ModItemTags.PICKAXE_AXE).add(ModItems.FIRE_ETHER_PICKAXE_AXE);
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.FIRE_ETHER_SWORD);
        valueLookupBuilder(ItemTags.AXES).addTag(ModItemTags.PICKAXE_AXE);valueLookupBuilder(ItemTags.PICKAXES).addTag(ModItemTags.PICKAXE_AXE);
        valueLookupBuilder(ItemTags.WEAPON_ENCHANTABLE).addTag(ModItemTags.PICKAXE_AXE).add(ModItems.FIRE_ETHER_AXE);
        valueLookupBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE).addTag(ModItemTags.PICKAXE_AXE).add(ModItems.FIRE_ETHER_AXE);
    }
}
