package net.mcreator.ms.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.ms.block.SteelWallBlock;
import net.mcreator.ms.block.GirderBlock;
import net.mcreator.ms.MsMod;

import java.util.Map;

public class SteelSheetRightclickedGirderProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MsMod.LOGGER.warn("Failed to load dependency world for procedure SteelSheetRightclickedGirder!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MsMod.LOGGER.warn("Failed to load dependency x for procedure SteelSheetRightclickedGirder!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MsMod.LOGGER.warn("Failed to load dependency y for procedure SteelSheetRightclickedGirder!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MsMod.LOGGER.warn("Failed to load dependency z for procedure SteelSheetRightclickedGirder!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MsMod.LOGGER.warn("Failed to load dependency entity for procedure SteelSheetRightclickedGirder!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MsMod.LOGGER.warn("Failed to load dependency itemstack for procedure SteelSheetRightclickedGirder!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GirderBlock.block) {
			if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
				(itemstack).shrink((int) 1);
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = SteelWallBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else {
			world.setBlockState(
					new BlockPos(
							entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX(),
							entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
							entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
					GirderBlock.block.getDefaultState(), 3);
			if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
				(itemstack).shrink((int) 1);
			}
		}
	}
}
