package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output,registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ICE_ETHER_BLOCK)
                .add(ModBlocks.ICE_ETHER_ORE)
                .add(ModBlocks.ICE_ETHER_FENCE_GATE)
                .add(ModBlocks.ICE_ETHER_STAIRS)
                .add(ModBlocks.ICE_ETHER_SLAB)
                .add(ModBlocks.ICE_ETHER_BUTTON)
                .add(ModBlocks.ICE_ETHER_PLATE)
                .add(ModBlocks.ICE_ETHER_WALL)
                .add(ModBlocks.ICE_ETHER_DOOR)
                .add(ModBlocks.ICE_ETHER_TRAPDOOR);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ICE_ETHER_ORE);

        //Ores
        valueLookupBuilder(ModBlockTags.ORES)
                .add(ModBlocks.ICE_ETHER_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.IRON_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.NETHER_GOLD_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE)
                .add(Blocks.ANCIENT_DEBRIS)
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE);

        //Fences & Walls
        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.ICE_ETHER_WALL);

        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ICE_ETHER_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ICE_ETHER_FENCE_GATE);

        //Drop Ways
        valueLookupBuilder(ModBlockTags.PICKAXE_AXE_MINABLE)
                .forceAddTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .forceAddTag(BlockTags.MINEABLE_WITH_AXE);
    }
}
