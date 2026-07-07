package net.wizardiewoo.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.block.ModBlocks;
import net.wizardiewoo.atomicengineering.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AtomicEngineering.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.SCREWDRIVER.get());
        basicItem(ModItems.STRAWBERRY.get());

        buttonItem(ModBlocks.CONCRETE_BUTTON, ModBlocks.TIN_BLOCK);
        fenceItem(ModBlocks.CONCRETE_FENCE, ModBlocks.TIN_BLOCK);
        wallItem(ModBlocks.CONCRETE_WALL, ModBlocks.TIN_BLOCK);

        basicItem(ModBlocks.CONCRETE_DOOR.asItem());

        handheldItem(ModItems.BRONZE_SWORD.get());
        handheldItem(ModItems.BRONZE_PICKAXE.get());
        handheldItem(ModItems.BRONZE_SHOVEL.get());
        handheldItem(ModItems.BRONZE_AXE.get());
        handheldItem(ModItems.BRONZE_HOE.get());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(AtomicEngineering.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
