
package net.mcreator.moreblocks.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.moreblocks.init.MoreBlocksModTabs;
import net.mcreator.moreblocks.init.MoreBlocksModItems;

public class SpuerDiamondShovelItem extends ShovelItem {
	public SpuerDiamondShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 50f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get()));
			}
		}, 1, 1f, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
	}
}
