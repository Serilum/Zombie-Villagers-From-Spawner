package com.serilum.zombievillagersfromspawner;

import com.natamus.collective.objects.SAMObject;
import com.serilum.zombievillagersfromspawner.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.ZOMBIE, EntityTypes.ZOMBIE_VILLAGER, null, ConfigHandler.isZombieVillagerChance, true, false, false);
	}
}