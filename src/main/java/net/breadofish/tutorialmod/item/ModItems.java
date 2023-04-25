package net.breadofish.tutorialmod.item;

import net.breadofish.tutorialmod.TutorialMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> Amongus_Chunk = ITEMS.register("amogus",
            () -> new Item(new Item.Properties().food(Foods.BEEF)));

    public static final RegistryObject<Item> Quiver = ITEMS.register("quiver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> coalNugget = ITEMS.register("coalNugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> copperNugget = ITEMS.register("copperNugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> diamondNugget = ITEMS.register("diamondNugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> goldenNugget = ITEMS.register("goldenNugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> redstoneNugget = ITEMS.register("redstoneNugget",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
