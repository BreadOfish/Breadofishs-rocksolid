package net.breadofish.rocksolid.datagen;

import net.breadofish.rocksolid.block.ModBlock;
import net.breadofish.rocksolid.rocksolid;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

//I didn't find out that this class existed until half way through development
public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, rocksolid.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //usage -> blockWithItem();
        blockWithItem(ModBlock.andersite_glass);
        blockWithItem(ModBlock.andersite_diamond);
        blockWithItem(ModBlock.blackstone_glass);
        blockWithItem(ModBlock.deepslate_glass);
        blockWithItem(ModBlock.diorite_glass);
        blockWithItem(ModBlock.deepslate_glass);
        blockWithItem(ModBlock.deepslatebrick_glass);
        blockWithItem(ModBlock.diorite_diamond);
        blockWithItem(ModBlock.framedandersiteglass);
        blockWithItem(ModBlock.framedblackstoneglass);
        blockWithItem(ModBlock.frameddeepslateglass);
        blockWithItem(ModBlock.framedsmglass);
        blockWithItem(ModBlock.framedgranteglass);
        blockWithItem(ModBlock.framedandersiteglass);
        blockWithItem(ModBlock.frameddioriteglass);
        blockWithItem(ModBlock.framedstoneglass);
        blockWithItem(ModBlock.tuffblock);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
