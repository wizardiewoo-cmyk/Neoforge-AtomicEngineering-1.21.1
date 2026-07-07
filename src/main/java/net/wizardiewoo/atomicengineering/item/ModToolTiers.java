package net.wizardiewoo.atomicengineering.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.wizardiewoo.atomicengineering.util.ModTags;

public class ModToolTiers {
    public static final Tier BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.TIN_INGOT));
}
