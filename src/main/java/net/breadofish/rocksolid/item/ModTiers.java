package net.breadofish.rocksolid.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    //Why is forge like this, why why why. Also tiering data for enderite
    public static final ForgeTier ENDERITE = new ForgeTier(4, 2600, 9f,
            9f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.enderiteingot.get()));
}
