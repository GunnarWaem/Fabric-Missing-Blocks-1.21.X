package net.gsaurus.missingblocks;

import net.fabricmc.api.ModInitializer;

import net.gsaurus.missingblocks.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MissingBlocks implements ModInitializer {
	public static final String MOD_ID = "missingblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}