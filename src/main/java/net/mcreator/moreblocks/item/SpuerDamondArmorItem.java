
package net.mcreator.moreblocks.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moreblocks.init.MoreBlocksModTabs;
import net.mcreator.moreblocks.init.MoreBlocksModItems;

public abstract class SpuerDamondArmorItem extends ArmorItem {
	public SpuerDamondArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{9, 7, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoreBlocksModItems.SPUERDIAMONDS.get()));
			}

			@Override
			public String getName() {
				return "spuer_damond_armor";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SpuerDamondArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "more_blocks:textures/models/armor/diamond__layer_1.png";
		}
	}

	public static class Chestplate extends SpuerDamondArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "more_blocks:textures/models/armor/diamond__layer_1.png";
		}
	}

	public static class Leggings extends SpuerDamondArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "more_blocks:textures/models/armor/diamond__layer_2.png";
		}
	}

	public static class Boots extends SpuerDamondArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoreBlocksModTabs.TAB_MOREBLOCKNS).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "more_blocks:textures/models/armor/diamond__layer_1.png";
		}
	}
}
