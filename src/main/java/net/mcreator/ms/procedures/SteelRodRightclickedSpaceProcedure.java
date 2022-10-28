package net.mcreator.ms.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;

import net.mcreator.ms.block.SpaceBlock;
import net.mcreator.ms.block.LatticeBlock;
import net.mcreator.ms.MsMod;

import java.util.Map;

public class SteelRodRightclickedSpaceProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MsMod.LOGGER.warn("Failed to load dependency world for procedure SteelRodRightclickedSpace!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MsMod.LOGGER.warn("Failed to load dependency x for procedure SteelRodRightclickedSpace!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MsMod.LOGGER.warn("Failed to load dependency y for procedure SteelRodRightclickedSpace!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MsMod.LOGGER.warn("Failed to load dependency z for procedure SteelRodRightclickedSpace!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MsMod.LOGGER.warn("Failed to load dependency itemstack for procedure SteelRodRightclickedSpace!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double energy = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == SpaceBlock.block) {
			world.setBlockState(new BlockPos(x, y - 1, z), LatticeBlock.block.getDefaultState(), 3);
			(itemstack).shrink((int) 1);
		}
	}
}
