
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.moreblocks.world.biome.OREworBiome;
import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MoreBlocksMod.MODID);
	public static final RegistryObject<Biome> OR_EWOR = REGISTRY.register("or_ewor", OREworBiome::createBiome);
}
