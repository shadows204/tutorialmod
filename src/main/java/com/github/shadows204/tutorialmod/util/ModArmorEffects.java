package com.github.shadows204.tutorialmod.util;

import com.github.shadows204.tutorialmod.tag.ModItemTags;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.core.Holder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.Map;

public class ModArmorEffects {
    public static final Map<TagKey<Item>, List<Template>> EFFECTS = Map.of(ModItemTags.ICE_ETHER_ARMOR,List.of(
            new Template(MobEffects.REGENERATION,-1,0),
            new Template(MobEffects.HEALTH_BOOST,-1,1)
    ));

    private static boolean hasFullArmor(Player player, TagKey<Item> tag){
        return player.getItemBySlot(EquipmentSlot.HEAD).is(tag) && player.getItemBySlot(EquipmentSlot.CHEST).is(tag) && player.getItemBySlot(EquipmentSlot.LEGS).is(tag) && player.getItemBySlot(EquipmentSlot.FEET).is(tag);
    }

    private static void tickPlayer(Player player){
        for (Map.Entry<TagKey<Item>,List<Template>> entry:EFFECTS.entrySet()){
            if (hasFullArmor(player,entry.getKey())){
                applyEffects(player,entry.getValue());
                break;
            }else{
                for (Template t : entry.getValue()){
                    player.removeEffect(t.effect());
                }
            }
        }
    }

    private static void applyEffects(Player player,List<Template> effects){
        for (Template t : effects){
            MobEffectInstance effectInstance = new MobEffectInstance(t.effect(),t.duration(),t.amplifier(),false,false,false);
            if (!player.hasEffect(effectInstance.getEffect())){
                player.addEffect(effectInstance);
            }
        }
    }

    public static void register(){
        ServerTickEvents.END_LEVEL_TICK.register(serverLevel->{
            for (Player player:serverLevel.players()){
                tickPlayer(player);
            }
        });
    }

    public record Template(Holder<MobEffect> effect, int duration, int amplifier){

    }
}
