
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.moreblocks.world.features.ores.SpuerDiamondOreFeature;
import net.mcreator.moreblocks.world.features.ores.SilverOreFeature;
import net.mcreator.moreblocks.MoreBlocksMod;

@Mod.EventBusSubscriber
public class MoreBlocksModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MoreBlocksMod.MODID);
	public static final RegistryObject<Feature<?>> SPUER_DIAMOND_ORE = REGISTRY.register("spuer_diamond_ore", SpuerDiamondOreFeature::feature);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::feature);
}
