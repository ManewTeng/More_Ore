
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.moreblocks.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MoreBlocksModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1)
					.add(new BasicItemListing(new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get(), 21), new ItemStack(MoreBlocksModItems.SPUERDIAMONDAXE.get()), new ItemStack(MoreBlocksModItems.SPUER_DIAMONDPICKAXE.get()), 50, 20, 0.05f));
		}
	}
}
