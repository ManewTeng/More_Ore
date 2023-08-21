
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MoreBlocksMod.MODID);
	public static final RegistryObject<PaintingVariant> MORE_ORE_MAKER = REGISTRY.register("more_ore_maker", () -> new PaintingVariant(16, 16));
}
