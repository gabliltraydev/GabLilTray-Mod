
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.glt.gltmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import fr.glt.gltmod.item.HardenedIronSwordItem;
import fr.glt.gltmod.item.HardenedIronShovelItem;
import fr.glt.gltmod.item.HardenedIronPickaxeItem;
import fr.glt.gltmod.item.HardenedIronOrbItem;
import fr.glt.gltmod.item.HardenedIronIngotItem;
import fr.glt.gltmod.item.HardenedIronHoeItem;
import fr.glt.gltmod.item.HardenedIronAxeItem;
import fr.glt.gltmod.item.HardenedIronArmorItem;
import fr.glt.gltmod.GltmodMod;

public class GltmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GltmodMod.MODID);
	public static final RegistryObject<Item> HARDENED_IRON_BLOCK = block(GltmodModBlocks.HARDENED_IRON_BLOCK);
	public static final RegistryObject<Item> HARDENED_IRON_ORE = block(GltmodModBlocks.HARDENED_IRON_ORE);
	public static final RegistryObject<Item> HARDENED_IRON_AXE = REGISTRY.register("hardened_iron_axe", () -> new HardenedIronAxeItem());
	public static final RegistryObject<Item> HARDENED_IRON_PICKAXE = REGISTRY.register("hardened_iron_pickaxe", () -> new HardenedIronPickaxeItem());
	public static final RegistryObject<Item> HARDENED_IRON_SWORD = REGISTRY.register("hardened_iron_sword", () -> new HardenedIronSwordItem());
	public static final RegistryObject<Item> HARDENED_IRON_SHOVEL = REGISTRY.register("hardened_iron_shovel", () -> new HardenedIronShovelItem());
	public static final RegistryObject<Item> HARDENED_IRON_HOE = REGISTRY.register("hardened_iron_hoe", () -> new HardenedIronHoeItem());
	public static final RegistryObject<Item> HARDENED_IRON_INGOT = REGISTRY.register("hardened_iron_ingot", () -> new HardenedIronIngotItem());
	public static final RegistryObject<Item> HARDENED_IRON_ARMOR_HELMET = REGISTRY.register("hardened_iron_armor_helmet", () -> new HardenedIronArmorItem.Helmet());
	public static final RegistryObject<Item> HARDENED_IRON_ARMOR_CHESTPLATE = REGISTRY.register("hardened_iron_armor_chestplate", () -> new HardenedIronArmorItem.Chestplate());
	public static final RegistryObject<Item> HARDENED_IRON_ARMOR_LEGGINGS = REGISTRY.register("hardened_iron_armor_leggings", () -> new HardenedIronArmorItem.Leggings());
	public static final RegistryObject<Item> HARDENED_IRON_ARMOR_BOOTS = REGISTRY.register("hardened_iron_armor_boots", () -> new HardenedIronArmorItem.Boots());
	public static final RegistryObject<Item> RENFORCIED_HARDENED_IRON = block(GltmodModBlocks.RENFORCIED_HARDENED_IRON);
	public static final RegistryObject<Item> HARDENED_IRON_ORB = REGISTRY.register("hardened_iron_orb", () -> new HardenedIronOrbItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
