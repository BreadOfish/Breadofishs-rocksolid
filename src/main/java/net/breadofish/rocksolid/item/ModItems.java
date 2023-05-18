package net.breadofish.rocksolid.item;

import net.breadofish.rocksolid.rocksolid;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, rocksolid.MODID);

    //First modded item in Rocksolid
    public static final RegistryObject<Item> Amongus_Chunk = ITEMS.register("amogus",
            () -> new Item(new Item.Properties().food(Foods.BEEF)));

    @Deprecated
    public static final RegistryObject<Item> Quiver = ITEMS.register("quiver",
            () -> new Item(new Item.Properties()));
    //Nugget items
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

    public static final RegistryObject<Item> enderiteingot = ITEMS.register("enderiteingot",
            () -> new Item(new Item.Properties()));


    //Im regretting my life choices (Enderite tools)
    public static final RegistryObject<AxeItem> enderiteaxe = ITEMS.register("enderiteaxe",
            () -> new AxeItem(ModTiers.ENDERITE, 3, 1f, new Item.Properties()));

    public static final RegistryObject<SwordItem> enderitesword = ITEMS.register("enderitesword",
            () -> new SwordItem(ModTiers.ENDERITE, 2, 2.5f, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> enderitepickaxe = ITEMS.register("enderitepickaxe",
            () -> new PickaxeItem(ModTiers.ENDERITE, 0, 0.1f, new Item.Properties()));
    public static final RegistryObject<ShovelItem> enderiteshovel = ITEMS.register("enderiteshovel",
            () -> new ShovelItem(ModTiers.ENDERITE, 1, .5f,new Item.Properties()));
    public static final RegistryObject<HoeItem> enderitehoe = ITEMS.register("enderitehoe",
            () -> new HoeItem(ModTiers.ENDERITE,0,.5f, new Item.Properties()));
    // COMO TE LLAMOS???? (Enderite armor)

    public static final RegistryObject<ArmorItem> enderitehelmet = ITEMS.register("enderitehelmet",
            () -> new ArmorItem(ModArmorTiers.ENDERITE, EquipmentSlot.HEAD, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> enderitechestplate = ITEMS.register("enderitechestplate",
            () -> new ArmorItem(ModArmorTiers.ENDERITE, EquipmentSlot.CHEST, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> enderiteleggings = ITEMS.register("enderiteleggings",
            () -> new ArmorItem(ModArmorTiers.ENDERITE, EquipmentSlot.LEGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<ArmorItem> enderiteboots = ITEMS.register("enderiteboots",
            () -> new ArmorItem(ModArmorTiers.ENDERITE, EquipmentSlot.FEET, new Item.Properties().fireResistant()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
