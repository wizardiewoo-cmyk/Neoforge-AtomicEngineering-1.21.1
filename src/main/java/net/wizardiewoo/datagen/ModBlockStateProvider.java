package net.wizardiewoo.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AtomicEngineering.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TEST_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.CHARRED_LOG);
        blockWithItem(ModBlocks.TIN_ORE);

        stairsBlock(ModBlocks.CONCRETE_STAIRS.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));
        slabBlock(ModBlocks.CONCRETE_SLAB.get(), blockTexture(ModBlocks.TIN_BLOCK.get()), blockTexture(ModBlocks.TIN_BLOCK.get()));

        buttonBlock(ModBlocks.CONCRETE_BUTTON.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));
        pressurePlateBlock(ModBlocks.CONCRETE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));

        fenceBlock(ModBlocks.CONCRETE_FENCE.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));
        fenceGateBlock(ModBlocks.CONCRETE_FENCE_GATE.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));
        wallBlock(ModBlocks.CONCRETE_WALL.get(), blockTexture(ModBlocks.TIN_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.CONCRETE_DOOR.get(), modLoc("block/concrete_door_bottom"), modLoc("block/concrete_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.CONCRETE_TRAPDOOR.get(), modLoc("block/concrete_trapdoor"), true, "cutout");

        blockItem(ModBlocks.CONCRETE_STAIRS);
        blockItem(ModBlocks.CONCRETE_SLAB);
        blockItem(ModBlocks.CONCRETE_PRESSURE_PLATE);
        blockItem(ModBlocks.CONCRETE_FENCE_GATE, "_bottom");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));

    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("atomicengineering:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("atomicengineering:block/" + deferredBlock.getId().getPath() + appendix));

    }
}
