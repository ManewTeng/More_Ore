
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moreblocks.block.SpuerDiamondOreBlock;
import net.mcreator.moreblocks.block.SpuerDiamondBlock;
import net.mcreator.moreblocks.block.SilverOreBlock;
import net.mcreator.moreblocks.block.OreWorldPortalBlock;
import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreBlocksMod.MODID);
	public static final RegistryObject<Block> SPUER_DIAMOND_BLOCK = REGISTRY.register("spuer_diamond_block", () -> new SpuerDiamondBlock());
	public static final RegistryObject<Block> SPUER_DIAMOND_ORE = REGISTRY.register("spuer_diamond_ore", () -> new SpuerDiamondOreBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> ORE_WORLD_PORTAL = REGISTRY.register("ore_world_portal", () -> new OreWorldPortalBlock());
}
