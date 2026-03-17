package dev.armadillomike.creepig.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import dev.armadillomike.creepig.procedures.CreepweedPlayerFinishesUsingItemProcedure;

public class CreepweedItem extends Item {
	public CreepweedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(1.5f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CreepweedPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}