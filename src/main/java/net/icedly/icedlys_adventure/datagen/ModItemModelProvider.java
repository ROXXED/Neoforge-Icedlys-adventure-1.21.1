package net.icedly.icedlys_adventure.datagen;

import net.icedly.icedlys_adventure.IcedlysAdventure;
import net.icedly.icedlys_adventure.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IcedlysAdventure.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.URANIUM.get());
        basicItem(ModItems.RAW_URANIUM.get());
        basicItem(ModItems.CHAINSAW.get());
        basicItem(ModItems.TOMATO.get());
        basicItem(ModItems.FROSTFIRE_ICE.get());
    }
}
