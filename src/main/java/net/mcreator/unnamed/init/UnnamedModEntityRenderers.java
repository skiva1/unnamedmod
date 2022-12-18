
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unnamed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.unnamed.client.renderer.JungleSkeletonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnnamedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UnnamedModEntities.JUNGLE_SKELETON.get(), JungleSkeletonRenderer::new);
	}
}
