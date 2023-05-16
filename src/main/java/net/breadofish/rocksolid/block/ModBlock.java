package net.breadofish.rocksolid.block;

import net.breadofish.rocksolid.rocksolid;
import net.breadofish.rocksolid.item.ModItems;
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
            DeferredRegister.create(ForgeRegistries.BLOCKS, rocksolid.MODID);

    //Andersite glass def statment

    public static final RegistryObject<Block> stone_glass = registryObject("stone_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> smooth_glass = registryObject("smooth_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));

    public static final RegistryObject<Block> blackstone_glass = registryObject("blackstone_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));

    public static final RegistryObject<Block> deepslate_glass = registryObject("deepslate_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> deepslatebrick_glass = registryObject("deepslatebrick_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> diorite_glass = registryObject("diorite_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));
    public static final RegistryObject<Block> grante_glass = registryObject("grante_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().strength(2f).explosionResistance(6000f)));

    public static final RegistryObject<Block> andersite_diamond = registryObject("andersite_diamond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(.1f)));
    public static final RegistryObject<Block> diorite_diamond = registryObject("diorite_diamond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(.1f)));
    public static final RegistryObject<Block> granite_diamond = registryObject("granite_diamond",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(.1f)));
    public static final RegistryObject<Block> frameddeepslateglass = registryObject("frameddeepslateglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));

    public static final RegistryObject<Block> framedandersiteglass = registryObject("framedandersiteglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));

    public static final RegistryObject<Block> framedblackstoneglass = registryObject("framedblackstoneglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));
    public static final RegistryObject<Block> frameddioriteglass = registryObject("frameddioriteglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));
    public static final RegistryObject<Block> framedsmglass = registryObject("framedsmglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));
    public static final RegistryObject<Block> framedgranteglass = registryObject("framedgranteglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));
    public static final RegistryObject<Block> framedstoneglass = registryObject("framedstoneglass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));
    public static final RegistryObject<Block> andersite_glass = registryObject("andersite_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.1f)));

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
