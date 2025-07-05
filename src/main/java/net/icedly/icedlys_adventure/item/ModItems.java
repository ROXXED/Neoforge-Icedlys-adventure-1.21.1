package net.icedly.icedlys_adventure.item;

import net.icedly.icedlys_adventure.IcedlysAdventure;
import net.icedly.icedlys_adventure.item.custom.ChainsawItem;
import net.icedly.icedlys_adventure.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IcedlysAdventure.MOD_ID);

    public static final DeferredItem<Item> URANIUM = ITEMS.registerSimpleItem("uranium");
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.registerItem("raw_uranium", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CHAINSAW = ITEMS.registerItem("chainsaw", ChainsawItem::new, new Item.Properties().durability(64));
    public static final DeferredItem<Item> TOMATO = ITEMS.registerItem("tomato", Item::new, new Item.Properties().food(ModFoodProperties.TOMATO));
    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.registerItem("frostfire_ice", properties -> new FuelItem(properties, 800), new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
