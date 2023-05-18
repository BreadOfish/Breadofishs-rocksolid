package net.breadofish.rocksolid.datagen;

import net.breadofish.rocksolid.block.ModBlock;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlock.smooth_glass.get());
        dropSelf(ModBlock.andersite_glass.get());
        dropSelf(ModBlock.stone_glass.get());
        dropSelf(ModBlock.framedblackstoneglass.get());
        dropSelf(ModBlock.deepslate_glass.get());
        dropSelf(ModBlock.blackstone_glass.get());
        dropSelf(ModBlock.tuffblock.get());
        dropSelf(ModBlock.diorite_glass.get());
        dropSelf(ModBlock.framedgranteglass.get());
        dropSelf(ModBlock.framedstoneglass.get());
        dropSelf(ModBlock.frameddeepslateglass.get());
        dropSelf(ModBlock.framedandersiteglass.get());
        dropSelf(ModBlock.framedblackstoneglass.get());
        dropSelf(ModBlock.frameddioriteglass.get());
        dropSelf(ModBlock.deepslate_glass.get());
        dropSelf(ModBlock.deepslatebrick_glass.get());
        dropSelf(ModBlock.framedsmglass.get());
        dropSelf(ModBlock.grante_glass.get());
        dropOther(ModBlock.andersite_diamond.get(), Items.DIAMOND);
        dropOther(ModBlock.diorite_diamond.get(), Items.DIAMOND);
        dropOther(ModBlock.granite_diamond.get(), Items.DIAMOND);
















    }
    @Override
    //something something gets all known blocks in rocksolid
    //Im going to go back in time to tell notch to make Minecraft in a actually good language that doesn't make me use this nautical nonsense (cough cough python cough cough)
    protected Iterable<Block> getKnownBlocks() {
        return ModBlock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

