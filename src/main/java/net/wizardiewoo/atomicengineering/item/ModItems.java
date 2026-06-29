package net.wizardiewoo.atomicengineering.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wizardiewoo.atomicengineering.AtomicEngineering;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AtomicEngineering.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register( "tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register( "bronze_ingot",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
