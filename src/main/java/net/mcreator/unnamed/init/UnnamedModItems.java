
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unnamed.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.unnamed.item.DaddyItem;
import net.mcreator.unnamed.UnnamedMod;

public class UnnamedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMod.MODID);
	public static final RegistryObject<Item> CRATE = block(UnnamedModBlocks.CRATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DADDY = REGISTRY.register("daddy", () -> new DaddyItem());
	public static final RegistryObject<Item> SOLAR_SAND = block(UnnamedModBlocks.SOLAR_SAND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JUNGLE_SKELETON = REGISTRY.register("jungle_skeleton_spawn_egg",
			() -> new ForgeSpawnEggItem(UnnamedModEntities.JUNGLE_SKELETON, -10061268, -1392577,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
