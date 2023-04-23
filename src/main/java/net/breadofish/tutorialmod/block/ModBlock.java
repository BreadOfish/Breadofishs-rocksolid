package net.breadofish.tutorialmod.block;

import net.breadofish.tutorialmod.TutorialMod;
import net.breadofish.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);

    //Andersite glass def statment
    public static final RegistryObject<Block> stone_glass = registryObject("stone_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));
    public static final RegistryObject<Block> smooth_glass = registryObject("smooth_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));

    public static final RegistryObject<Block> blackstone_glass = registryObject("blackstone_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));

    public static final RegistryObject<Block> deepslate_glass = registryObject("deepslate_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));
    public static final RegistryObject<Block> deepslatebrick_glass = registryObject("deepslatebrick_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));
    public static final RegistryObject<Block> diorite_glass = registryObject("diorite_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));
    public static final RegistryObject<Block> grante_glass = registryObject("grante_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).requiresCorrectToolForDrops().explosionResistance(6000f)));
    public static <T extends Block> RegistryObject<T> registryObject(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item>  registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
