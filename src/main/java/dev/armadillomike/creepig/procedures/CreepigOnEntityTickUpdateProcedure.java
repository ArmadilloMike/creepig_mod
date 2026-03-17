package dev.armadillomike.creepig.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class CreepigOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double newtimelft = 0;
		newtimelft = entity.getPersistentData().getDoubleOr("timeLeft", 0) - 1;
		entity.getPersistentData().putDouble("timeLeft", newtimelft);
		if (entity.getPersistentData().getDoubleOr("timeLeft", 0) == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}