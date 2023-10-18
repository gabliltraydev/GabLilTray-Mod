
package fr.glt.gltmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import fr.glt.gltmod.init.GltmodModItems;

public class HardenedIronHoeItem extends HoeItem {
	public HardenedIronHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GltmodModItems.HARDENED_IRON_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
