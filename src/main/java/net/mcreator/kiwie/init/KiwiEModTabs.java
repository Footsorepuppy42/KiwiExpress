
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kiwie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KiwiEModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("kiwi_e", "kiwi_express"),
				builder -> builder.title(Component.translatable("item_group.kiwi_e.kiwi_express")).icon(() -> new ItemStack(KiwiEModItems.KIWI_FRUIT.get())).displayItems((parameters, tabData) -> {
					tabData.accept(KiwiEModItems.KIWI_FRUIT.get());
				}).withSearchBar());
	}
}
