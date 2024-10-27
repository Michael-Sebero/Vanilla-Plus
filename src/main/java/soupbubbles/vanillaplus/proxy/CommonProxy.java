package soupbubbles.vanillaplus.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import soupbubbles.vanillaplus.handler.BlockEventHandler;
import soupbubbles.vanillaplus.handler.ConfigurationHandler;
import soupbubbles.vanillaplus.handler.EntityEventHandler;
import soupbubbles.vanillaplus.handler.LootTableEventHandler;
import soupbubbles.vanillaplus.handler.PlayerEventHandler;
import soupbubbles.vanillaplus.handler.WorldGenEventHandler;
import soupbubbles.vanillaplus.init.ModBlocks;
import soupbubbles.vanillaplus.init.ModEntities;
import soupbubbles.vanillaplus.init.ModItems;
import soupbubbles.vanillaplus.init.ModRecipes;
import soupbubbles.vanillaplus.util.Compatibility;
import soupbubbles.vanillaplus.world.WorldGenerator;

public abstract class CommonProxy implements IProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.initConfiguation(event.getSuggestedConfigurationFile());
        Compatibility.preInit();
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModEntities.initEntities();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BlockEventHandler());
        MinecraftForge.EVENT_BUS.register(new EntityEventHandler());
        MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());
        MinecraftForge.EVENT_BUS.register(new LootTableEventHandler());
        MinecraftForge.TERRAIN_GEN_BUS.register(new WorldGenEventHandler());
        GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);

        ModRecipes.init();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
