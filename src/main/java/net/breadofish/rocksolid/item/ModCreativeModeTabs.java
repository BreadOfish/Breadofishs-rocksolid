package net.breadofish.rocksolid.item;

import net.breadofish.rocksolid.rocksolid;
import net.breadofish.rocksolid.block.ModBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = rocksolid.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TOOLS_TAB;
    public static CreativeModeTab BLOCKS_TAB;
    public static CreativeModeTab ITEM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        //Spaghetti code
        TOOLS_TAB = event.registerCreativeModeTab(new ResourceLocation(rocksolid.MODID, "tools"),
                builder -> builder.icon(() -> new ItemStack(ModItems.enderitesword.get()))
                        .title(Component.translatable("tools")));

        BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(rocksolid.MODID, "blocks"),
                builder -> builder.icon(() -> new ItemStack(ModBlock.stone_glass.get()))
                        .title(Component.translatable("blocks")));

        ITEM_TAB = event.registerCreativeModeTab(new ResourceLocation(rocksolid.MODID, "items"),
                builder -> builder.icon(() -> new ItemStack(ModBlock.stone_glass.get()))
                        .title(Component.translatable("items")));
    }
}
