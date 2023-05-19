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

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
