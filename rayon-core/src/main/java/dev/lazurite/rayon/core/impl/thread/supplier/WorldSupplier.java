package dev.lazurite.rayon.core.impl.thread.supplier;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

import java.util.List;

public interface WorldSupplier {
     List<World> getWorlds();
     World getWorld(RegistryKey<World> key);
}
