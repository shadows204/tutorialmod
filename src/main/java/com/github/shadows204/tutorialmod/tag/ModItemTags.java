package com.github.shadows204.tutorialmod.tag;

import com.github.shadows204.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> SUGARS = bind("sugars");

    public static final TagKey<Item> FIRE_ETHER_TOOL_MATERIALS = bind("fire_ether_tool_materials");

    private static TagKey<Item> bind(final String name){
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,name));
    }
}
