package net.ray.architectsmarvel.registry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.ray.architectsmarvel.blockentity.SpotlightBlockEntity;

import static net.ray.architectsmarvel.ArchitectsMarvel.MODID;

public class BlockEntitiesReg {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(MODID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<SpotlightBlockEntity>> SPOTLIGHT = BLOCK_ENTITIES.register("spotlight", () -> BlockEntityType.Builder.of(SpotlightBlockEntity::new, BlocksReg.SPOTLIGHT.get()).build(null));
}
