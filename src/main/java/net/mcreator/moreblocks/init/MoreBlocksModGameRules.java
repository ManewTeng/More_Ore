
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreBlocksModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> MORE_SPAWN = GameRules.register("moreSpawn", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
}
