
package net.mcreator.moreblocks.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.moreblocks.init.MoreBlocksModTabs;
import net.mcreator.moreblocks.init.MoreBlocksModItems;

public class SpuerDiamondSwItem extends SwordItem {
	public SpuerDiamondSwItem() {
		super(new Tier() {
			public int getUses() {
				return 9000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get()));
			}
		}, 3, -2f, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
	}
}
