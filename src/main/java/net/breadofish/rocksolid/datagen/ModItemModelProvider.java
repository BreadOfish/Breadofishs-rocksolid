package net.breadofish.rocksolid.datagen;

import net.breadofish.rocksolid.item.ModItems;
import net.breadofish.rocksolid.rocksolid;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, rocksolid.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //usage -> simpleItem(ModItems.(itemnamehere))





    }

    //Regular items
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(rocksolid.MODID, "item/" + item.getId().getPath()));
    }
    //Use with handheld items, shocker, I know (swords, tools, ect.)
    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(rocksolid.MODID, "item/" + item.getId().getPath()));
    }
}
