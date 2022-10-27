package net.mcreator.ms.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ms.potion.ZeroGPotionEffect;
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
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ZeroGPotionEffect.potion, (int) 1, (int) 1, (true), (true)));
	}
}
