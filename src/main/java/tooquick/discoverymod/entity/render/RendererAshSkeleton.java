package tooquick.discoverymod.entity.render;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import tooquick.discoverymod.Discoverymod;
import tooquick.discoverymod.client.DiscoverymodClient;
import tooquick.discoverymod.entity.EntityAshSkeleton;
import tooquick.discoverymod.entity.model.ModelAshSkeleton;

public class RendererAshSkeleton extends GeoEntityRenderer<EntityAshSkeleton>
{

    public RendererAshSkeleton(EntityRendererFactory.Context renderManager)
    {
        super(renderManager, new ModelAshSkeleton());
    }

    @Override
    public Identifier getTextureLocation(EntityAshSkeleton entity)
    {
        return new Identifier(Discoverymod.MOD_ID, "textures/entity/ash_skeleton.png");
    }
}
