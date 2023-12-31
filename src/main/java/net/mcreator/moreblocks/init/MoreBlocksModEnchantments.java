
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.moreblocks.enchantment.SpeedEnchantment;
import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MoreBlocksMod.MODID);
	public static final RegistryObject<Enchantment> SPEED = REGISTRY.register("speed", () -> new SpeedEnchantment());
}
