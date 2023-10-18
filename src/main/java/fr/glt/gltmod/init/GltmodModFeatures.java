
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.glt.gltmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import fr.glt.gltmod.world.features.ores.HardenedIronOreFeature;
import fr.glt.gltmod.GltmodMod;

@Mod.EventBusSubscriber
public class GltmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GltmodMod.MODID);
	public static final RegistryObject<Feature<?>> HARDENED_IRON_ORE = REGISTRY.register("hardened_iron_ore", HardenedIronOreFeature::new);
}
