package tooquick.discoverymod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class EntityAshSkeleton extends HostileEntity implements GeoEntity
{
    public static final String ENT_ID = "ash_skeleton";

    // GeckoLib
    private AnimatableInstanceCache animCache = GeckoLibUtil.createInstanceCache(this);

    public EntityAshSkeleton(EntityType<? extends HostileEntity> entityType, World world)
    {
        super(entityType, world);

        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.25, false));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 0.8));
        this.goalSelector.add(3, new LookAroundGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public void tick()
    {

        super.tick();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar)
    {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::controllerPredicate));
    }

    private <T extends GeoAnimatable> PlayState controllerPredicate(AnimationState<T> tAnimationState)
    {
        if (tAnimationState.isMoving())
        {
            tAnimationState.getController()
                    .setAnimation(RawAnimation.begin().then("animation.ash_skeleton.run", Animation.LoopType.LOOP));

            return PlayState.CONTINUE;
        }

        tAnimationState.getController()
                .setAnimation(RawAnimation.begin().then("animation.ash_skeleton.idle", Animation.LoopType.LOOP));

        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache()
    {
        return animCache;
    }
}
