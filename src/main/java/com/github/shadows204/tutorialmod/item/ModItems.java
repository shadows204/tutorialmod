package com.github.shadows204.tutorialmod.item;

import com.github.shadows204.tutorialmod.TutorialMod;
import com.github.shadows204.tutorialmod.item.custom.PickaxeAxeItem;
import com.github.shadows204.tutorialmod.item.custom.ProspectorItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {
    //Tools
    public static final Item PROSPECTOR = registerItems("prospector", ProspectorItem::new,new Item.Properties().durability(511));

    public static final Item FIRE_ETHER_SWORD = registerItems("fire_ether_sword",Item::new,new Item.Properties().sword(ModToolMaterials.FIRE_ETHER,4,-2.0f).fireResistant());
    public static final Item FIRE_ETHER_PICKAXE = registerItems("fire_ether_pickaxe",Item::new,new Item.Properties().pickaxe(ModToolMaterials.FIRE_ETHER,1.8f,-2.8f).fireResistant());
    public static final Item FIRE_ETHER_SHOVEL = registerItems("fire_ether_shovel",p->new ShovelItem(ModToolMaterials.FIRE_ETHER,2.0f,-2.8f,p),new Item.Properties().fireResistant());
    public static final Item FIRE_ETHER_AXE = registerItems("fire_ether_axe",p->new AxeItem(ModToolMaterials.FIRE_ETHER,6.0f,-2.8f,p),new Item.Properties().fireResistant());
    public static final Item FIRE_ETHER_HOE = registerItems("fire_ether_hoe",p->new HoeItem(ModToolMaterials.FIRE_ETHER,-3.5f,0.8f,p),new Item.Properties().fireResistant());
    //public static final Item FIRE_ETHER_PICKAXE_AXE = registerItems("fire_ether_pickaxe_axe",Item::new,new Item.Properties().tool(ModToolMaterials.FIRE_ETHER,ModBlockTags.PICKAXE_AXE_MINABLE,5.0f,-3.0f,0.0f));
    public static final Item FIRE_ETHER_PICKAXE_AXE = registerItems("fire_ether_pickaxe_axe",p->new PickaxeAxeItem(ModToolMaterials.FIRE_ETHER,5.0f,-3.0f,p));

    //Items
    public static final Item ICE_ETHER = registerItems("ice_ether");
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether");
    public static final Item CARDBOARD = registerItems("material/cardboard");
    public static final Item FIRE_ETHER = registerItems("fire_ether");

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
