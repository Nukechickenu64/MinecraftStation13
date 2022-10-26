package net.mcreator.ms.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ms.MsMod;

import java.util.Map;

public class SpaceEntityCollidesInTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MsMod.LOGGER.warn("Failed to load dependency entity for procedure SpaceEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setNoGravity((true));
	}
}
