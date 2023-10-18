
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.glt.gltmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.glt.gltmod.block.RenforciedHardenedIronBlock;
import fr.glt.gltmod.block.HardenedIronOreBlock;
import fr.glt.gltmod.block.HardenedIronBlockBlock;
import fr.glt.gltmod.GltmodMod;

public class GltmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GltmodMod.MODID);
	public static final RegistryObject<Block> HARDENED_IRON_BLOCK = REGISTRY.register("hardened_iron_block", () -> new HardenedIronBlockBlock());
	public static final RegistryObject<Block> HARDENED_IRON_ORE = REGISTRY.register("hardened_iron_ore", () -> new HardenedIronOreBlock());
	public static final RegistryObject<Block> RENFORCIED_HARDENED_IRON = REGISTRY.register("renforcied_hardened_iron", () -> new RenforciedHardenedIronBlock());
}
