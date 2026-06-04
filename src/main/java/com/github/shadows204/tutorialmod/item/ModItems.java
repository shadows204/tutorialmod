package com.github.shadows204.tutorialmod.item;

import com.github.shadows204.tutorialmod.TutorialMod;
import com.github.shadows204.tutorialmod.item.custom.ProspectorItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    //Tools
    public static final Item PROSPECTOR = registerItems("prospector", ProspectorItem::new,new Item.Properties().durability(511));


    //Items
    public static final Item ICE_ETHER = registerItems("ice_ether");
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether");
    public static final Item CARDBOARD = registerItems("material/cardboard");

    //Foods
    public static final Item CORN = registerItems("corn",Item::new,new Item.Properties().food(ModFoods.CORN,ModConsumables.CORN));
    public static final Item STRAWBERRY = registerItems("strawberry",Item::new,new Item.Properties().food(ModFoods.STRAWBERRY,ModConsumables.STRAWBERRY));
    public static final Item CHEESE = registerItems("cheese",Item::new,new Item.Properties().food(ModFoods.CHEESE,ModConsumables.CHEESE));
    public static final Item CURSED_GOLDEN_APPLE = registerItems("cursed_golden_apple",Item::new,new Item.Properties().food(ModFoods.CURSED_GOLDEN_APPLE,ModConsumables.CURSED_GOLDEN_APPLE));


    //Fuels
    public static final Item ANTHRACITE = registerItems("anthracite");


    //Structure Function Definitions
    private static Item registerItems(final String name, final Function<Item.Properties,Item> itemFactory,final Item.Properties properties){
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID,name));
        Item item = (Item)itemFactory.apply(properties.setId(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK,item);
        }

        return Registry.register(BuiltInRegistries.ITEM,key,item);
    }
    private static Item registerItems(final String name, final Function<Item.Properties,Item> itemFactory){
        return registerItems(name,itemFactory,new Item.Properties());
    }
    private static Item registerItems(final String name){
        return registerItems(name,Item::new,new Item.Properties());
    }
    public static void register(){
        TutorialMod.LOGGER.info("Registering Mod Items for"+TutorialMod.MOD_ID);
    }

}
