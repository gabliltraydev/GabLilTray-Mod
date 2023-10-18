
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.glt.gltmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.glt.gltmod.GltmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GltmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GltmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> GLT_MOD = REGISTRY.register("glt_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gltmod.glt_mod")).icon(() -> new ItemStack(GltmodModItems.HARDENED_IRON_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GltmodModBlocks.HARDENED_IRON_BLOCK.get().asItem());
				tabData.accept(GltmodModBlocks.HARDENED_IRON_ORE.get().asItem());
				tabData.accept(GltmodModItems.HARDENED_IRON_AXE.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_PICKAXE.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_SWORD.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_SHOVEL.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_INGOT.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_ARMOR_HELMET.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_ARMOR_CHESTPLATE.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_ARMOR_LEGGINGS.get());
				tabData.accept(GltmodModItems.HARDENED_IRON_ARMOR_BOOTS.get());
				tabData.accept(GltmodModBlocks.RENFORCIED_HARDENED_IRON.get().asItem());
				tabData.accept(GltmodModItems.HARDENED_IRON_ORB.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GltmodModItems.HARDENED_IRON_HOE.get());
		}
	}
}
