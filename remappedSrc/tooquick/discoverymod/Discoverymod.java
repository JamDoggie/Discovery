package tooquick.discoverymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tooquick.discoverymod.entity.DiscoveryEntityManager;
import tooquick.discoverymod.entity.EntityAshSkeleton;

public class Discoverymod implements ModInitializer
{
    public static final String MOD_ID = "discoverymod";

    public DiscoveryEntityManager entityManager = new DiscoveryEntityManager();

    @Override
    public void onInitialize() {
        entityManager.onInitialize();
    }
}
