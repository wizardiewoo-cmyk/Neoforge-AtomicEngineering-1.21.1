package net.wizardiewoo.atomicengineering.util;

import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.component.ModDataComponents;
import net.wizardiewoo.atomicengineering.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.CLASSICTHERMOMETER.get(), ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "used"),
                (stack, level, entity, seed) -> stack.get(ModDataComponents.COORDINATES) != null ? 1f : 0f);

        ItemProperties.register(ModItems.BRONZE_INGOT.get(), ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID, "temperature"),
                    (stack, level, entity, seed) -> stack.get(ModDataComponents.COORDINATES) != null ? 1f : 0f);

    }
}
