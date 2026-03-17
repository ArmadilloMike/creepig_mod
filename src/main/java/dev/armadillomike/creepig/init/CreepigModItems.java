/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.armadillomike.creepig.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

import dev.armadillomike.creepig.item.CreepweedItem;
import dev.armadillomike.creepig.CreepigMod;

public class CreepigModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreepigMod.MODID);
	public static final DeferredItem<Item> CREEPIG_SPAWN_EGG;
	public static final DeferredItem<Item> CREEPWEED;
	static {
		CREEPIG_SPAWN_EGG = register("creepig_spawn_egg", properties -> new SpawnEggItem(CreepigModEntities.CREEPIG.get(), properties));
		CREEPWEED = register("creepweed", CreepweedItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}