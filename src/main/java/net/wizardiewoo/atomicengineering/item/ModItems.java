package net.wizardiewoo.atomicengineering.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.item.custom.ClassicThermometerItem;
import net.wizardiewoo.atomicengineering.item.custom.ModFoodProperties;
import net.wizardiewoo.atomicengineering.item.custom.ScrewdriveItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AtomicEngineering.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register( "tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register( "bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCREWDRIVER = ITEMS.register("screwdriver",
            () -> new ScrewdriveItem(new Item.Properties().durability(32)));
    public static final DeferredItem<Item> CLASSICTHERMOMETER = ITEMS.register("classic_thermometer",
            () -> new ClassicThermometerItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.atomicengineering.strawberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 5,-2.4F))));
    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1.0F,-2.8F))));
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5F,-3.0F))));
    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6.0F,-3.2F))));
    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, 1.0F,-3.0F))));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
