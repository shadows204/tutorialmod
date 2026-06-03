package com.github.shadows204.tutorialmod.client.datagen;


import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTablesProvider extends FabricBlockLootSubProvider{

    public ModBlockLootTablesProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.ICE_ETHER_BLOCK);
        dropSelf(ModBlocks.RAW_ICE_ETHER_BLOCK);
        add(ModBlocks.ICE_ETHER_ORE, createIceEtherOreDrop(ModBlocks.ICE_ETHER_ORE, ModItems.RAW_ICE_ETHER));
    }

    public LootTable.Builder createIceEtherOreDrop(final Block block, Item item) {
       HolderLookup.RegistryLookup<Enchantment> enchantment = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
       return this.createSilkTouchDispatchTable(
               block,
               (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                       block,
                       LootItem.lootTableItem(item)
                                 .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                 .apply(ApplyBonusCount.addOreBonusCount(enchantment.getOrThrow(Enchantments.FORTUNE)))
               )
       );
    }
}
