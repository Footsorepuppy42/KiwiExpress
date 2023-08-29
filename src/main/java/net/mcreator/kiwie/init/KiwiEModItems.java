
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kiwie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.kiwie.item.KiwiFRUITItem;
import net.mcreator.kiwie.KiwiEMod;

public class KiwiEModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KiwiEMod.MODID);
	public static final RegistryObject<Item> KIWI_FRUIT = REGISTRY.register("kiwi_fruit", () -> new KiwiFRUITItem());
}
