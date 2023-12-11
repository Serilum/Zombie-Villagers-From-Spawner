package com.natamus.zombievillagersfromspawner.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.zombievillagersfromspawner.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double isZombieVillagerChance = 0.1;

	public static void initConfig() {
		configMetaData.put("isZombieVillagerChance", Arrays.asList(
			"The chance a new zombie spawn from a spawner is of the villager variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}