
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreblocks.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoreBlocksModTabs {
	public static CreativeModeTab TAB_MOREBLOCKNS;

	public static void load() {
		TAB_MOREBLOCKNS = new CreativeModeTab("tabmoreblockns") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
