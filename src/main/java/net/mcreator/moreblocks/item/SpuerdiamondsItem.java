
package net.mcreator.moreblocks.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.moreblocks.init.MoreBlocksModTabs;

public class SpuerdiamondsItem extends Item {
	public SpuerdiamondsItem() {
		super(new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
