package net.icedly.icedlys_adventure.item;

import net.icedly.icedlys_adventure.IcedlysAdventure;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IcedlysAdventure.MOD_ID);

    public static final DeferredItem<Item> URANIUM = ITEMS.registerSimpleItem("uranium");
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.registerItem("raw_uranium", Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
