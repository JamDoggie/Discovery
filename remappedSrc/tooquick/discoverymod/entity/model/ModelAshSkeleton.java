package tooquick.discoverymod.entity.model;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;
import tooquick.discoverymod.Discoverymod;
import tooquick.discoverymod.entity.EntityAshSkeleton;

public class ModelAshSkeleton extends GeoModel<EntityAshSkeleton>
{

    @Override
    public Identifier getModelResource(EntityAshSkeleton animatable)
    {
        return new Identifier(Discoverymod.MOD_ID, "geo/ash_skeleton.json");
    }

    @Override
    public Identifier getTextureResource(EntityAshSkeleton animatable)
    {
        return new Identifier(Discoverymod.MOD_ID, "textures/entity/ash_skeleton.png");
    }

    @Override
    public Identifier getAnimationResource(EntityAshSkeleton animatable)
    {
        return new Identifier(Discoverymod.MOD_ID, "animations/ash_skeleton.animation.json");
    }

    @Override
    public void setCustomAnimations(EntityAshSkeleton animatable, long instanceId, AnimationState<EntityAshSkeleton> animationState)
    {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null)
        {
            EntityModelData entityModelData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX((float) Math.toRadians(entityModelData.headPitch()));
            head.setRotY((float) Math.toRadians(entityModelData.netHeadYaw()));
        }
    }
}