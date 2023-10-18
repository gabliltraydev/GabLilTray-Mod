
package fr.glt.gltmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import fr.glt.gltmod.init.GltmodModItems;

public class HardenedIronShovelItem extends ShovelItem {
	public HardenedIronShovelItem() {
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
		}, 1, -3f, new Item.Properties());
	}
}
