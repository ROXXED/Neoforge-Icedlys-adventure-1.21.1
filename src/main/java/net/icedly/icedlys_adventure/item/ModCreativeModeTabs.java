package net.icedly.icedlys_adventure.item;

import net.icedly.icedlys_adventure.IcedlysAdventure;
import net.icedly.icedlys_adventure.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.references.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IcedlysAdventure.MOD_ID);

    public static final Supplier<CreativeModeTab> ICEDLYS_ADVENTURE_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("icedlys_adventure_items_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.icedlysadventure.icedlys_adventure_items_tab"))
                    .icon(() -> new ItemStack(ModItems.URANIUM.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.URANIUM);
                        pOutput.accept(ModItems.RAW_URANIUM);
                        pOutput.accept(ModItems.FROSTFIRE_ICE);


                        pOutput.accept(ModItems.TOMATO);

                        pOutput.accept(ModItems.CHAINSAW);



                    }).build());    public static final Supplier<CreativeModeTab> ICEDLYS_ADVENTURE_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("icedlys_adventure_blocks_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.icedlysadventure.icedlys_adventure_blocks_tab"))
                    .icon(() -> new ItemStack(ModBlocks.URANIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(IcedlysAdventure.MOD_ID, "icedlys_adventure_items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.URANIUM_BLOCK);
                        pOutput.accept(ModBlocks.URANIUM_ORE);
                        pOutput.accept(ModBlocks.URANIUM_DEEPSLATE_ORE);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
