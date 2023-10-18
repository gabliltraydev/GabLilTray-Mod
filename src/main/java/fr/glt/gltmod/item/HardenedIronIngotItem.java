
package fr.glt.gltmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HardenedIronIngotItem extends Item {
	public HardenedIronIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
