/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.armadillomike.creepig.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import dev.armadillomike.creepig.client.renderer.CreepigRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CreepigModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreepigModEntities.CREEPIG.get(), CreepigRenderer::new);
	}
}