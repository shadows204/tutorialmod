package com.github.shadows204.tutorialmod.tag;

import com.github.shadows204.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> ORES = create("ores");
    public static final TagKey<Block> PICKAXE_AXE_MINABLE = create("pick_axe_mineable");

    private static TagKey<Block> create(final String name){
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,name));
    }
}
