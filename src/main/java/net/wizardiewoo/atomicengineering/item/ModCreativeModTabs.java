package net.wizardiewoo.atomicengineering.item;

import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtomicEngineering.MOD_ID);

    public static final Supplier<CreativeModeTab> ELEMENTS_TAB = CREATIVE_MODE_TAB.register("elements_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.atomicengineering.elements"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModBlocks.TIN_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> ALLOYS_TAB = CREATIVE_MODE_TAB.register("alloys_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "elements_tab"))
                    .title(Component.translatable("creativetab.atomicengineering.alloys"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BRONZE_INGOT);

                    }).build());    public static final Supplier<CreativeModeTab> TOOS_TAB = CREATIVE_MODE_TAB.register("tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCREWDRIVER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "alloys_tab"))
                    .title(Component.translatable("creativetab.atomicengineering.tools"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SCREWDRIVER);
                        output.accept(ModBlocks.TEST_BLOCK);
                        output.accept(ModItems.STRAWBERRY);
                        output.accept(ModBlocks.CHARRED_LOG);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}