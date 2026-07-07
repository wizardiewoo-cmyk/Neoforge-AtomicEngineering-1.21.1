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

                    }).build());
    public static final Supplier<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TAB.register("tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCREWDRIVER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "alloys_tab"))
                    .title(Component.translatable("creativetab.atomicengineering.tools"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SCREWDRIVER);
                        output.accept(ModItems.STRAWBERRY);
                        output.accept(ModItems.CLASSICTHERMOMETER);
                        output.accept(ModItems.BRONZE_SWORD);
                        output.accept(ModItems.BRONZE_PICKAXE);
                        output.accept(ModItems.BRONZE_SHOVEL);
                        output.accept(ModItems.BRONZE_AXE);
                        output.accept(ModItems.BRONZE_HOE);

                    }).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "tools_tab"))
                    .title(Component.translatable("creativetab.atomicengineering.blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CONCRETE_BUTTON);
                        output.accept(ModBlocks.CONCRETE_DOOR);
                        output.accept(ModBlocks.CONCRETE_FENCE);
                        output.accept(ModBlocks.CONCRETE_STAIRS);
                        output.accept(ModBlocks.CONCRETE_SLAB);
                        output.accept(ModBlocks.CONCRETE_WALL);
                        output.accept(ModBlocks.CONCRETE_PRESSURE_PLATE);
                        output.accept(ModBlocks.CONCRETE_TRAPDOOR);
                        output.accept(ModBlocks.CONCRETE_FENCE_GATE);
                        output.accept(ModBlocks.TEST_BLOCK);
                        output.accept(ModBlocks.CHARRED_LOG);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}