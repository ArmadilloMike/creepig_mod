package dev.armadillomike.creepig.procedures;

import net.minecraft.world.entity.Entity;

public class CreepigOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("timeLeft", 200);
	}
}