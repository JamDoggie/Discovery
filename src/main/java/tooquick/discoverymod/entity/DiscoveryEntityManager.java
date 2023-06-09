package tooquick.discoverymod.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tooquick.discoverymod.Discoverymod;

public class DiscoveryEntityManager
{
    public static final EntityType<EntityAshSkeleton> ASH_SKELETON = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Discoverymod.MOD_ID, EntityAshSkeleton.ENT_ID),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EntityAshSkeleton::new).dimensions(EntityDimensions.fixed(0.8f, 4f)).build()
    );

    public void onInitialize() {
        // Ash Skeleton
        FabricDefaultAttributeRegistry.register(ASH_SKELETON, EntityAshSkeleton.createAttributes());
    }
}
