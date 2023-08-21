
package net.mcreator.moreblocks.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.moreblocks.init.MoreBlocksModItems;

import java.util.List;

public class SpeedEnchantment extends Enchantment {
	public SpeedEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public int getMinLevel() {
		return 40;
	}

	@Override
	public int getMaxLevel() {
		return 40;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(MoreBlocksModItems.SPUER_DIAMONDPICKAXE.get(), MoreBlocksModItems.SPUERDIAMONDAXE.get(), MoreBlocksModItems.SPUER_DIAMOND_SHOVEL.get()).contains(item);
	}
}
