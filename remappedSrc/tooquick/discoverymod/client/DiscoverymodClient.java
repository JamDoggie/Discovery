package tooquick.discoverymod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import tooquick.discoverymod.Discoverymod;
import tooquick.discoverymod.entity.DiscoveryEntityManager;
import tooquick.discoverymod.entity.EntityAshSkeleton;
import tooquick.discoverymod.entity.model.ModelAshSkeleton;
import tooquick.discoverymod.entity.render.RendererAshSkeleton;

@Environment(EnvType.CLIENT)
public class DiscoverymodClient implements ClientModInitializer
{
    public static final EntityModelLayer MODEL_ASH_SKELETON_LAYER = new EntityModelLayer(new Identifier(Discoverymod.MOD_ID, EntityAshSkeleton.ENT_ID), "main");

    @Override
    public void onInitializeClient()
    {
        EntityRendererRegistry.register(DiscoveryEntityManager.ASH_SKELETON, RendererAshSkeleton::new);
    }
}
