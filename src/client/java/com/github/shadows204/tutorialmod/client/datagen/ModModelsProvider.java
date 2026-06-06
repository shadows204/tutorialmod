package com.github.shadows204.tutorialmod.client.datagen;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //Common Items
        itemModelGenerators.generateFlatItem(ModItems.ICE_ETHER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ICE_ETHER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CARDBOARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER,ModelTemplates.FLAT_ITEM);

        //Foods
        itemModelGenerators.generateFlatItem(ModItems.CORN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STRAWBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHEESE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CURSED_GOLDEN_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ANTHRACITE, ModelTemplates.FLAT_ITEM);

        //Tools
        itemModelGenerators.generateFlatItem(ModItems.PROSPECTOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FIRE_ETHER_PICKAXE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);

    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //Common Blocks
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_ICE_ETHER_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.ICE_ETHER_ORE);

        //Constructure Families
        //Noticing that one block's constructure blocks family includes that block
        blockModelGenerators.family(ModBlocks.ICE_ETHER_BLOCK)
                .stairs(ModBlocks.ICE_ETHER_STAIRS)
                .slab(ModBlocks.ICE_ETHER_SLAB)
                .button(ModBlocks.ICE_ETHER_BUTTON)
                .pressurePlate(ModBlocks.ICE_ETHER_PLATE)
                .fence(ModBlocks.ICE_ETHER_FENCE)
                .fenceGate(ModBlocks.ICE_ETHER_FENCE_GATE)
                .wall(ModBlocks.ICE_ETHER_WALL);

        //Door Types
        blockModelGenerators.createDoor(ModBlocks.ICE_ETHER_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.ICE_ETHER_TRAPDOOR);
    }

}
