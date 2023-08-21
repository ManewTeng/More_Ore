
package net.mcreator.moreblocks.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class NevergiveyouupItem extends RecordItem {
	public NevergiveyouupItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.underwater.loop.additions.rare")), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
