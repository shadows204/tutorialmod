package com.github.shadows204.tutorialmod.item.custom;

import com.github.shadows204.tutorialmod.tag.ModBlockTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Consumer;

public class PickaxeAxeItem extends AxeItem {
    public PickaxeAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        return blockState.is(ModBlockTags.PICKAXE_AXE_MINABLE) ? 12.0f : 1.0f;
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack itemStack,BlockState blockState) {
        return blockState.is(ModBlockTags.PICKAXE_AXE_MINABLE);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
        boolean isShiftDown = false;
        try {
            Class<?> minecraftClass = Class.forName("net.minecraft.client.Minecraft");
            java.lang.reflect.Method getInstanceMethod = minecraftClass.getMethod("getInstance");
            Object minecraftInstance = getInstanceMethod.invoke(null);
            java.lang.reflect.Method hasShiftDownMethod = minecraftClass.getMethod("hasShiftDown");
            isShiftDown = (boolean) hasShiftDownMethod.invoke(minecraftInstance);
        } catch (Exception e) {
        }

        if (isShiftDown) {
            builder.accept(Component.translatable("tooltip.tutorialmod.pickaxe_axe.tooltip"));
        } else {
            builder.accept(Component.translatable("tooltip.tutorialmod.pickaxe_axe.tooltip.shift"));
        }
    }
}
