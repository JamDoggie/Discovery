package tooquick.discoverymod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
import tooquick.discoverymod.config.EntityConfigValues;

public class EntityAshSkeleton extends HostileEntity implements GeoEntity
{
    public static final String ENT_ID = "ash_skeleton";

    // GeckoLib
    private AnimatableInstanceCache animCache = GeckoLibUtil.createInstanceCache(this);

    public EntityAshSkeleton(EntityType<? extends HostileEntity> entityType, World world)
    {
        super(entityType, world);

        this.goalSelector.add(1, new MeleeAttackGoal(this, 1, false));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 0.8));
        this.goalSelector.add(3, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this, LivingEntity.class));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PassiveEntity.class, true));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 64)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, EntityConfigValues.ashSkeletonHealth)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, EntityConfigValues.ashSkeletonDmg);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar)
    {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 5, this::controllerPredicate));
    }

    private <T extends GeoAnimatable> PlayState controllerPredicate(AnimationState<T> tAnimationState)
    {
        if (tAnimationState.isMoving() && isOnGround())
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
