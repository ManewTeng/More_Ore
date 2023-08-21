
package net.mcreator.moreblocks.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class MoreblocksCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("moreblocks").requires(s -> s.hasPermission(4))
				.then(Commands.argument("players", EntityArgument.players()).then(Commands.argument("MoreOre", ItemArgument.item(event.getBuildContext())).then(Commands.argument("quantity", DoubleArgumentType.doubleArg(0, 6400))))));
	}
}
