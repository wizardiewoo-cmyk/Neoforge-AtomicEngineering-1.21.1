package net.wizardiewoo.atomicengineering.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.item.custom.ModFoodProperties;
import net.wizardiewoo.atomicengineering.item.custom.ScrewdriveItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AtomicEngineering.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register( "tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register( "bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCREWDRIVER = ITEMS.register("screwdriver",
            () -> new ScrewdriveItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
