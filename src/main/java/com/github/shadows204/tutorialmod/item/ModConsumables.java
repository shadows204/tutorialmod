package com.github.shadows204.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ClearAllStatusEffectsConsumeEffect;

import java.util.List;

public class ModConsumables {
    public static final Consumable STRAWBERRY = Consumables.defaultFood()
                .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED,200),0.5f)).build();
    public static final Consumable CHEESE = Consumables.defaultFood()
                .onConsume(new ApplyStatusEffectsConsumeEffect(
                        List.of(
                                new MobEffectInstance(MobEffects.JUMP_BOOST,300),
                                new MobEffectInstance(MobEffects.FIRE_RESISTANCE,300)
                        ),0.5f
                )).build();
    public static final Consumable CORN = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SATURATION),300)).build();
    public static final Consumable CURSED_GOLDEN_APPLE = Consumables.defaultFood()
            .onConsume(ClearAllStatusEffectsConsumeEffect.INSTANCE)
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.BAD_OMEN,600,4),
                            new MobEffectInstance(MobEffects.HUNGER,300,9),
                            new MobEffectInstance(MobEffects.WEAKNESS,1200,3),
                            new MobEffectInstance(MobEffects.BLINDNESS,600,0),
                            new MobEffectInstance(MobEffects.DARKNESS,600,0),
                            new MobEffectInstance(MobEffects.INFESTED,600,4),
                            new MobEffectInstance(MobEffects.MINING_FATIGUE,1200,4),
                            new MobEffectInstance(MobEffects.NAUSEA,600,0),
                            new MobEffectInstance(MobEffects.OOZING,600,4),
                            new MobEffectInstance(MobEffects.POISON,600,4),
                            new MobEffectInstance(MobEffects.SLOWNESS,600,3),
                            new MobEffectInstance(MobEffects.UNLUCK,6000,4),
                            new MobEffectInstance(MobEffects.WITHER,600,4),
                            new MobEffectInstance(MobEffects.WEAVING,6000,0),
                            new MobEffectInstance(MobEffects.WIND_CHARGED,6000,4)
                    ),1.0f
            )).build();
}
