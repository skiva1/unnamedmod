
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unnamed.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.unnamed.block.SolarSandBlock;
import net.mcreator.unnamed.block.CrateBlock;
import net.mcreator.unnamed.UnnamedMod;

public class UnnamedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UnnamedMod.MODID);
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> SOLAR_SAND = REGISTRY.register("solar_sand", () -> new SolarSandBlock());
}
