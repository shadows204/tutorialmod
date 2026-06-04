package com.github.shadows204.tutorialmod;

import com.github.shadows204.tutorialmod.block.ModBlocks;
import com.github.shadows204.tutorialmod.item.ModCreativeModeTabs;
import com.github.shadows204.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.register();
		ModCreativeModeTabs.register();
		ModBlocks.register();

		//Register as Fuels
		FuelValueEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.CARDBOARD, 300);
			builder.add(ModItems.ANTHRACITE, 2000);
		});

		LOGGER.info("Hello Fabric world!");
	}
}