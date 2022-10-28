package net.mcreator.ms.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

import net.mcreator.ms.block.SteelfloorBlock;
import net.mcreator.ms.block.PlatingBlock;
import net.mcreator.ms.block.LatticeBlock;
import net.mcreator.ms.MsMod;

import java.util.Map;

public class FloorTileRightclickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MsMod.LOGGER.warn("Failed to load dependency world for procedure FloorTileRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MsMod.LOGGER.warn("Failed to load dependency x for procedure FloorTileRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MsMod.LOGGER.warn("Failed to load dependency y for procedure FloorTileRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MsMod.LOGGER.warn("Failed to load dependency z for procedure FloorTileRightclickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == LatticeBlock.block) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PlatingBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PlatingBlock.block) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = SteelfloorBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
