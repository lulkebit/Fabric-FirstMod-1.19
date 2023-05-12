package net.luke.homosexmod;

import net.fabricmc.api.ModInitializer;
import net.luke.homosexmod.block.ModBlocks;
import net.luke.homosexmod.item.ModItemGroup;
import net.luke.homosexmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomosexMod implements ModInitializer {
	public static final String MOD_ID = "homosexmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
