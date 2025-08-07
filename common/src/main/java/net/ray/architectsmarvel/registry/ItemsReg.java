package net.ray.architectsmarvel.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static net.ray.architectsmarvel.ArchitectsMarvel.MODID;
import static net.ray.architectsmarvel.registry.BlocksReg.*;

public class ItemsReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MODID, Registries.ITEM);

    // BlockItem region
    public static final RegistrySupplier<Item> LAPIS_BLOCK_STAIRS_ITEM = ITEMS.register("lapis_stairs", () -> new BlockItem(LAPIS_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_BLOCK_SLAB_ITEM = ITEMS.register("lapis_slab", () -> new BlockItem(LAPIS_SLAB.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_BRICKS_ITEM = ITEMS.register("lapis_bricks", () -> new BlockItem(LAPIS_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_BRICK_STAIRS_ITEM = ITEMS.register("lapis_brick_stairs", () -> new BlockItem(LAPIS_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_BRICK_SLAB_ITEM = ITEMS.register("lapis_brick_slab", () -> new BlockItem(LAPIS_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CHISELED_LAPIS_BRICKS_ITEM = ITEMS.register("chiseled_lapis_bricks", () -> new BlockItem(CHISELED_LAPIS_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_TILES_ITEM = ITEMS.register("lapis_tiles", () -> new BlockItem(LAPIS_TILES.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_TILES_STAIRS_ITEM = ITEMS.register("lapis_tile_stairs", () -> new BlockItem(LAPIS_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_TILE_SLAB_ITEM = ITEMS.register("lapis_tile_slab", () -> new BlockItem(LAPIS_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> LAPIS_LAMP_ITEM = ITEMS.register("lapis_lamp", () -> new BlockItem(LAPIS_LAMP.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> AMETHYST_BRICKS_ITEM = ITEMS.register("amethyst_bricks", () -> new BlockItem(AMETHYST_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CHISELED_AMETHYST_BRICKS_ITEM = ITEMS.register("chiseled_amethyst_bricks", () -> new BlockItem(CHISELED_AMETHYST_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AMETHYST_MOSAIC_ITEM = ITEMS.register("amethyst_mosaic", () -> new BlockItem(AMETHYST_MOSAIC.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AMETHYST_LAMP_ITEM = ITEMS.register("amethyst_lamp", () -> new BlockItem(AMETHYST_LAMP.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> CALCITE_BRICKS_ITEM = ITEMS.register("calcite_bricks", () -> new BlockItem(CALCITE_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CALCITE_BRICK_STAIRS_ITEM = ITEMS.register("calcite_brick_stairs", () -> new BlockItem(CALCITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CALCITE_BRICK_SLAB_ITEM = ITEMS.register("calcite_brick_slab", () -> new BlockItem(CALCITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CHISELED_CALCITE_BRICKS_ITEM = ITEMS.register("chiseled_calcite_bricks", () -> new BlockItem(CHISELED_CALCITE_BRICKS.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CALCITE_TILES_ITEM = ITEMS.register("calcite_tiles", () -> new BlockItem(CALCITE_TILES.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> SPOTLIGHT_ITEM = ITEMS.register("spotlight", () -> new BlockItem(SPOTLIGHT.get(), new Item.Properties()));
    // End region
}
