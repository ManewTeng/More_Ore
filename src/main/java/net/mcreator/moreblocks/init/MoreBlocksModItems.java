
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moreblocks.item.SpuerdiamondsItem;
import net.mcreator.moreblocks.item.SpuerdiamondaxeItem;
import net.mcreator.moreblocks.item.SpuerDiamondpickaxeItem;
import net.mcreator.moreblocks.item.SpuerDiamondSwItem;
import net.mcreator.moreblocks.item.SpuerDiamondShovelItem;
import net.mcreator.moreblocks.item.SpuerDamondArmorItem;
import net.mcreator.moreblocks.item.SilverItem;
import net.mcreator.moreblocks.item.OreWorldItem;
import net.mcreator.moreblocks.item.NevergiveyouupItem;
import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBlocksMod.MODID);
	public static final RegistryObject<Item> SPUER_DIAMOND_BLOCK = block(MoreBlocksModBlocks.SPUER_DIAMOND_BLOCK, MoreBlocksModTabs.TAB_MOREBLOCKNS);
	public static final RegistryObject<Item> NEVERGIVEYOUUP = REGISTRY.register("nevergiveyouup", () -> new NevergiveyouupItem());
	public static final RegistryObject<Item> SPUERDIAMONDS = REGISTRY.register("spuerdiamonds", () -> new SpuerdiamondsItem());
	public static final RegistryObject<Item> SPUERDIAMONDAXE = REGISTRY.register("spuerdiamondaxe", () -> new SpuerdiamondaxeItem());
	public static final RegistryObject<Item> SPUER_DIAMONDPICKAXE = REGISTRY.register("spuer_diamondpickaxe", () -> new SpuerDiamondpickaxeItem());
	public static final RegistryObject<Item> SPUER_DIAMOND_SHOVEL = REGISTRY.register("spuer_diamond_shovel", () -> new SpuerDiamondShovelItem());
	public static final RegistryObject<Item> SPUER_DIAMOND_ORE = block(MoreBlocksModBlocks.SPUER_DIAMOND_ORE, MoreBlocksModTabs.TAB_MOREBLOCKNS);
	public static final RegistryObject<Item> SILVER_ORE = block(MoreBlocksModBlocks.SILVER_ORE, MoreBlocksModTabs.TAB_MOREBLOCKNS);
	public static final RegistryObject<Item> SILVER = REGISTRY.register("silver", () -> new SilverItem());
	public static final RegistryObject<Item> SPUER_DAMOND_ARMOR_HELMET = REGISTRY.register("spuer_damond_armor_helmet", () -> new SpuerDamondArmorItem.Helmet());
	public static final RegistryObject<Item> SPUER_DAMOND_ARMOR_CHESTPLATE = REGISTRY.register("spuer_damond_armor_chestplate", () -> new SpuerDamondArmorItem.Chestplate());
	public static final RegistryObject<Item> SPUER_DAMOND_ARMOR_LEGGINGS = REGISTRY.register("spuer_damond_armor_leggings", () -> new SpuerDamondArmorItem.Leggings());
	public static final RegistryObject<Item> SPUER_DAMOND_ARMOR_BOOTS = REGISTRY.register("spuer_damond_armor_boots", () -> new SpuerDamondArmorItem.Boots());
	public static final RegistryObject<Item> ORE_WORLD = REGISTRY.register("ore_world", () -> new OreWorldItem());
	public static final RegistryObject<Item> SPUER_DIAMOND_SW = REGISTRY.register("spuer_diamond_sw", () -> new SpuerDiamondSwItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
