package net.breadofish.rocksolid;

import com.mojang.logging.LogUtils;
import net.breadofish.rocksolid.block.ModBlock;
import net.breadofish.rocksolid.item.ModCreativeModeTabs;
import net.breadofish.rocksolid.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(rocksolid.MODID)
public class rocksolid {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "rocksolid";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the " rocksolid" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the " rocksolid" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Creates a new Block with the id " rocksolid:example_block", combining the namespace and path
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    // Creates a new BlockItem with the id " rocksolid:example_block", combining the namespace and path
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));
    private Object rocksolid;

    public rocksolid()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlock.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }


    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        //This code sucks and I hate it.
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.stone_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.smooth_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.blackstone_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.deepslate_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.deepslatebrick_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.diorite_glass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.grante_glass);
        }
        if (event.getTab() == ModCreativeModeTabs.ITEM_TAB){
            event.accept(ModItems.coalNugget);
        }
        if (event.getTab() == ModCreativeModeTabs.ITEM_TAB){
            event.accept(ModItems.copperNugget);
        }
        if (event.getTab() == ModCreativeModeTabs.ITEM_TAB){
            event.accept(ModItems.diamondNugget);
        }
        if (event.getTab() == ModCreativeModeTabs.ITEM_TAB){
            event.accept(ModItems.redstoneNugget);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.andersite_diamond);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.granite_diamond);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.diorite_diamond);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.frameddeepslateglass);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.framedandersiteglass);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.framedgranteglass);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.framedblackstoneglass);
        }

        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.framedsmglass);
        }
        if (event.getTab() == ModCreativeModeTabs.BLOCKS_TAB){
            event.accept(ModBlock.framedblackstoneglass);
        }
        if (event.getTab() == ModCreativeModeTabs.TOOLS_TAB){
            event.accept(ModItems.enderiteaxe);
        }
        if (event.getTab() == ModCreativeModeTabs.TOOLS_TAB){
            event.accept(ModItems.enderitehoe);
        }
        if (event.getTab() == ModCreativeModeTabs.TOOLS_TAB){
            event.accept(ModItems.enderitesword);
        }
        if (event.getTab() == ModCreativeModeTabs.TOOLS_TAB){
            event.accept(ModItems.enderitepickaxe);
        }
        if (event.getTab() == ModCreativeModeTabs.TOOLS_TAB){
            event.accept(ModItems.enderiteshovel);
        }
        if (event.getTab() == ModCreativeModeTabs.ITEM_TAB){
            event.accept(ModItems.enderiteingot);
        }
    }


    //Puts the item in the creative menu, because forge decided to change it for some wierd reason


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            ItemBlockRenderTypes.setRenderLayer(ModBlock.stone_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.smooth_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.blackstone_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.deepslate_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.deepslatebrick_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.diorite_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.grante_glass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.frameddeepslateglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.framedblackstoneglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.framedgranteglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.framedandersiteglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.framedstoneglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.framedsmglass.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlock.frameddioriteglass.get(), RenderType.translucent());





        }
    }
}
