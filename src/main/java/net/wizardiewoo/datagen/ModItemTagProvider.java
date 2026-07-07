package net.wizardiewoo.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wizardiewoo.atomicengineering.AtomicEngineering;
import net.wizardiewoo.atomicengineering.block.ModBlocks;
import net.wizardiewoo.atomicengineering.item.ModItems;
import net.wizardiewoo.atomicengineering.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AtomicEngineering.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.TIN_INGOT.get())
                .add(Items.CHARCOAL);

        tag(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get());

    }
}
