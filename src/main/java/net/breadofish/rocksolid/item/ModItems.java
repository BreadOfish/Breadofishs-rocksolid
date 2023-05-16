package net.breadofish.rocksolid.item;

import net.breadofish.rocksolid.rocksolid;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, rocksolid.MODID);

    public static final RegistryObject<Item> Amongus_Chunk = ITEMS.register("amogus",
            () -> new Item(new Item.Properties().food(Foods.BEEF)));

    public static final RegistryObject<Item> Quiver = ITEMS.register("quiver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> coalNugget = ITEMS.register("coalnugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> copperNugget = ITEMS.register("coppernugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> diamondNugget = ITEMS.register("diamondnugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> goldenNugget = ITEMS.register("goldennugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> redstoneNugget = ITEMS.register("redstonenugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderiteaxe = ITEMS.register("enderiteaxe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderiteboots = ITEMS.register("enderiteboots",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderitechestplate = ITEMS.register("enderitechestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderitehelmet = ITEMS.register("enderitehelmet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderitehoe = ITEMS.register("enderitehoe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderiteingot = ITEMS.register("enderiteingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> enderiteleggings = ITEMS.register("enderiteleggings",
            () -> new Item(new Item.Properties()));
    //Im regretting my life choices
    public static final RegistryObject<SwordItem> enderitesword = ITEMS.register("enderitesword",
            () -> new SwordItem(ModTiers.ENDERITE, 2, 2.5f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> enderitepickaxe = ITEMS.register("enderitepickaxe",
            () -> new PickaxeItem(ModTiers.ENDERITE, 1, 0.5f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> enderiteshovel = ITEMS.register("enderiteshovel",
            () -> new ShovelItem(ModTiers.ENDERITE, 1, .5f,new Item.Properties()));









    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
