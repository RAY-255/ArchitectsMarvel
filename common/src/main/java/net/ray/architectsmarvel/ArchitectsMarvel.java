package net.ray.architectsmarvel;

import net.ray.architectsmarvel.registry.BlockEntitiesReg;
import net.ray.architectsmarvel.registry.BlocksReg;
import net.ray.architectsmarvel.registry.ItemsReg;

public final class ArchitectsMarvel {
    public static final String MODID = "architectsmarvel";

    public static void init() {
        BlocksReg.BLOCKS.register();
        ItemsReg.ITEMS.register();
        BlockEntitiesReg.BLOCK_ENTITIES.register();
        System.out.println("Hello from Architect's Marvels mod initialization!");
        // Write common init code here.
    }
}
