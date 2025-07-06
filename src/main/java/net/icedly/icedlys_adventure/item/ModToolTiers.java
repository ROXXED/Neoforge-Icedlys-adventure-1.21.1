package net.icedly.icedlys_adventure.item;

import net.icedly.icedlys_adventure.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier RUBY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL, 650, 4f,1.7f,20,
            ()-> Ingredient.of(ModItems.RUBY.get()));

}
