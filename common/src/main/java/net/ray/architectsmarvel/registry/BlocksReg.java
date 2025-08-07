package net.ray.architectsmarvel.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.ray.architectsmarvel.block.AmethystLampBlock;
import net.ray.architectsmarvel.block.SpotlightBlock;
import net.ray.architectsmarvel.block.SpotlightLightBlock;

import static net.ray.architectsmarvel.ArchitectsMarvel.MODID;

public class BlocksReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MODID, Registries.BLOCK);


    // Lapis variants
    public static final RegistrySupplier<Block> LAPIS_STAIRS = BLOCKS.register("lapis_stairs", () -> new StairBlock((Blocks.LAPIS_BLOCK.defaultBlockState()), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_SLAB = BLOCKS.register("lapis_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_BRICKS = BLOCKS.register("lapis_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_BRICK_STAIRS = BLOCKS.register("lapis_brick_stairs", () -> new StairBlock((Blocks.LAPIS_BLOCK.defaultBlockState()), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_BRICK_SLAB = BLOCKS.register("lapis_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> CHISELED_LAPIS_BRICKS = BLOCKS.register("chiseled_lapis_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_TILES = BLOCKS.register("lapis_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_TILE_STAIRS = BLOCKS.register("lapis_tile_stairs", () -> new StairBlock((Blocks.LAPIS_BLOCK.defaultBlockState()), BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_TILE_SLAB = BLOCKS.register("lapis_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));
    public static final RegistrySupplier<Block> LAPIS_LAMP = BLOCKS.register("lapis_lamp", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).lightLevel((DefaultState) -> 15)));

    // Amethyst variants
    public static final RegistrySupplier<Block> AMETHYST_BRICKS = BLOCKS.register("amethyst_bricks", () -> new AmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final RegistrySupplier<Block> CHISELED_AMETHYST_BRICKS = BLOCKS.register("chiseled_amethyst_bricks", () -> new AmethystBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final RegistrySupplier<Block> AMETHYST_MOSAIC = BLOCKS.register("amethyst_mosaic", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final RegistrySupplier<Block> AMETHYST_LAMP = BLOCKS.register("amethyst_lamp", () -> new AmethystLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).lightLevel((DefaultState) -> 15)));

    // Calcite variants
    public static final RegistrySupplier<Block> CALCITE_BRICKS = BLOCKS.register("calcite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistrySupplier<Block> CALCITE_BRICK_STAIRS = BLOCKS.register("calcite_brick_stairs", () -> new StairBlock((Blocks.CALCITE.defaultBlockState()), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistrySupplier<Block> CALCITE_BRICK_SLAB = BLOCKS.register("calcite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistrySupplier<Block> CHISELED_CALCITE_BRICKS = BLOCKS.register("chiseled_calcite_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final RegistrySupplier<Block> CALCITE_TILES = BLOCKS.register("calcite_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));

    //MIX
    public static final RegistrySupplier<Block> SPOTLIGHT = BLOCKS.register("spotlight", SpotlightBlock::new);
    public static final RegistrySupplier<Block> SPOTLIGHT_LIGHT = BLOCKS.register("spotlight_light", () -> new SpotlightLightBlock(BlockBehaviour.Properties.of().noOcclusion().strength(-1.0F, 3600000.8F).noLootTable().noOcclusion().replaceable().lightLevel(((state -> 12)))));



    // Column blocks per material
}
