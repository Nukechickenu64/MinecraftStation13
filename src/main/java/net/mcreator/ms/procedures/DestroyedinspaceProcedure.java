package net.mcreator.ms.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ms.block.SpaceBlock;
import net.mcreator.ms.MsMod;

import java.util.Map;

public class DestroyedinspaceProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MsMod.LOGGER.warn("Failed to load dependency world for procedure Destroyedinspace!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MsMod.LOGGER.warn("Failed to load dependency x for procedure Destroyedinspace!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MsMod.LOGGER.warn("Failed to load dependency y for procedure Destroyedinspace!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MsMod.LOGGER.warn("Failed to load dependency z for procedure Destroyedinspace!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), SpaceBlock.block.getDefaultState(), 3);
		if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
			world.setBlockState(new BlockPos(x, y + 2, z), SpaceBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlockState(new BlockPos(x, y + 1, z), SpaceBlock.block.getDefaultState(), 3);
		}
	}
}
