
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moreblocks.MoreBlocksMod;

public class MoreBlocksModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreBlocksMod.MODID);
	public static final RegistryObject<SoundEvent> NEVER_GONNA_GIVE_YOU_UP = REGISTRY.register("never-gonna-give-you-up", () -> new SoundEvent(new ResourceLocation("more_blocks", "never-gonna-give-you-up")));
}
