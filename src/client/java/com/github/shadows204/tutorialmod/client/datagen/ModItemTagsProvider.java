package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.item.ModItems;
import com.github.shadows204.tutorialmod.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output,registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ModItemTags.FIRE_ETHER_TOOL_MATERIALS)
                .add(ModItems.FIRE_ETHER_SWORD)
                .add(ModItems.FIRE_ETHER_PICKAXE)
                .add(ModItems.FIRE_ETHER_SHOVEL)
                .add(ModItems.FIRE_ETHER_AXE)
                .add(ModItems.FIRE_ETHER_HOE);
    }
}
