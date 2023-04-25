package net.breadofish.tutorialmod.item;

import net.breadofish.tutorialmod.TutorialMod;
import net.breadofish.tutorialmod.block.ModBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TWEAK_TAB;
    public static CreativeModeTab BLOCKS_TAB;

    public static CreativeModeTab ITEM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        //Spaghetti code
        TWEAK_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MODID, "tweaks"),
                builder -> builder.icon(() -> new ItemStack(ModItems.Quiver.get()))
                        .title(Component.translatable("misc")));

        BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MODID, "blocks"),
                builder -> builder.icon(() -> new ItemStack(ModBlock.stone_glass.get()))
                        .title(Component.translatable("blocks")));

        ITEM_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MODID, "items"),
                builder -> builder.icon(() -> new ItemStack(ModBlock.stone_glass.get()))
                        .title(Component.translatable("items")));
    }
}
