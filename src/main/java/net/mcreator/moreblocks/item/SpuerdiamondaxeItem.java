
package net.mcreator.moreblocks.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.moreblocks.init.MoreBlocksModTabs;
import net.mcreator.moreblocks.init.MoreBlocksModItems;

import java.util.List;

public class SpuerdiamondaxeItem extends AxeItem {
	public SpuerdiamondaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get()));
			}
		}, 1, -2.5f, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("spuerAXE"));
	}
}
