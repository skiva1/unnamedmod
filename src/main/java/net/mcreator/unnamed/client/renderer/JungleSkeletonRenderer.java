
package net.mcreator.unnamed.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.unnamed.entity.JungleSkeletonEntity;
import net.mcreator.unnamed.client.model.Modelcustom_model;

public class JungleSkeletonRenderer extends MobRenderer<JungleSkeletonEntity, Modelcustom_model<JungleSkeletonEntity>> {
	public JungleSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JungleSkeletonEntity entity) {
		return new ResourceLocation("unnamed:textures/entities/jungleskeleton.png");
	}
}
